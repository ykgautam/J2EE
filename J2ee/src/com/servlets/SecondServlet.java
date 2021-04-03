package com.servlets;

/**
 * servlet using GenericServlet class
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("this is secondServlet using GenericServlet");
//		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>this is secondServlet using GenericServlet</h1>");
	}

}
