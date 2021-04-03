package com.servlets;

/**
 * servlet using HttpServlet class 
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is get method using HttpServlet");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("this is get nethod using HttpServlet");
	}

}
