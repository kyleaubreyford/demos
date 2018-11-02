package com.revature.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Fruit;

public class FruitServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("retreiving all fruit");
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit(1, "orang", "orange", 9));
		fruits.add(new Fruit(2, "pear", "greenish", 1));
		
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(fruits);
		resp.getWriter().write(json);
		
	}

}
