package com.servlets;

/**
 * servlet using Servlet interface
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	@Override
	public void destroy() {
		System.out.println("this is destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("this is getServletConfig ");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("this is getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("this is init");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("this is service");
//		set the content type of response
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>this is my output from servlet service method</h1>");
		writer.print("todays date and time is " + new Date().toString());

	}

}
