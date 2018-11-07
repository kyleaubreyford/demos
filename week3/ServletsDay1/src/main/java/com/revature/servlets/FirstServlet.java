package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("initializing servlet");

		String configParam = config.getInitParameter("specifParam");
		System.out.println("config param: " + configParam);

		String contextParam = config.getServletContext().getInitParameter("sharedParam");
		System.out.println("context param: " + contextParam);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("url: " + arg0.getRequestURL());
		System.out.println("uri: " + arg0.getRequestURI());
		System.out.println("method: " + arg0.getMethod());
		super.service(arg0, arg1); // if i remove this my doGet, doPost, ... will not be called
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get request made to first servlet");
		resp.setStatus(200);
		PrintWriter writer = resp.getWriter();
		writer.write("Hello from our first servlet!!!!!");
		writer.write("Hello from our first servlet!!!!!");
	}

	@Override
	public void destroy() {
		System.out.println("destorying first servlet");
	}

}
