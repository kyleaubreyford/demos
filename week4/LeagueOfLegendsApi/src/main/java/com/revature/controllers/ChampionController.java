package com.revature.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Champion;
import com.revature.services.ChampionService;
import com.revature.util.ResponseMapper;

public class ChampionController {
	private Logger log = Logger.getRootLogger();
	private ChampionService cs = ChampionService.currentImplementation;
	private ObjectMapper om = new ObjectMapper();

	void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String method = req.getMethod();
		log.trace("reqiest made to champion controller with method: " + req.getMethod());
		switch (method) {
		case "GET":
			processGet(req, resp);
			break;
		case "POST":
			processPost(req, resp);
			break;
		case "OPTIONS":
			return;
		default:
			resp.setStatus(404);
			break;
		}
	}

	private void processGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String uri = req.getRequestURI();
		String context = "LeagueOfLegendsApi";
		uri = uri.substring(context.length() + 2, uri.length());
		String[] uriArray = uri.split("/");
		System.out.println(Arrays.toString(uriArray));
		if (uriArray.length == 1) { // /champions
			String role = (String) req.getSession().getAttribute("role");
			if (!"ADMIN".equals(role)) {
				resp.setStatus(403);
				return;
			} else {
				log.info("retreiving all champions");
				List<Champion> champions = cs.findAll();
				ResponseMapper.convertAndAttach(champions, resp);
				return;
			}
		} else if (uriArray.length == 2) { // /champions/{id}
			try {
				int id = Integer.parseInt(uriArray[1]);
				log.info("retreiving champion with id: " + id);
				Champion c = cs.findById(id);
				ResponseMapper.convertAndAttach(c, resp);
				return;
			} catch (NumberFormatException e) {
				resp.setStatus(400);
				return;
			}
		} else if (uriArray.length == 3 && uriArray[1].equals("role")) { // /champions/role/{role}
			String role = uriArray[2];
			log.info("finding all champions with role: " + role);
			List<Champion> champions = cs.findAllByRole(role);
			ResponseMapper.convertAndAttach(champions, resp);
			return;
		} else if (uriArray.length == 3 && uriArray[1].equals("name")) { // /champions/name/{name}
			String name = uriArray[2];
			log.info("finding champion with the name: " + name);
			Champion c = cs.findByName(name);
			ResponseMapper.convertAndAttach(c, resp);
			return;
		} else {
			resp.setStatus(404);
			return;
		}
	}

	private void processPost(HttpServletRequest req, HttpServletResponse resp)
			throws JsonParseException, JsonMappingException, IOException {
		String uri = req.getRequestURI();
		String context = "LeagueOfLegendsApi";
		uri = uri.substring(context.length() + 2, uri.length());
		if (!"champions".equals(uri)) {
			log.debug("could not recognize request with uri: " + uri);
			resp.setStatus(404);
			return;
		} else {
			String role = (String) req.getSession().getAttribute("role");
			if (!"ADMIN".equals(role)) {
				resp.setStatus(403);
				return;
			} else {
				log.info("saving new champion");
				Champion c = om.readValue(req.getReader(), Champion.class);
				cs.save(c);
				resp.getWriter().write("" + c.getId());
				resp.setStatus(201);
				return;
			}
		}
	}

}
