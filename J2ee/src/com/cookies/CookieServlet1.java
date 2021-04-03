package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("servlet name is " + getServletName());

		String name = req.getParameter("name");
		
		Cookie c=new Cookie("name", name);

		resp.addCookie(c);
		
//		writer.println("welcome " + name);
		writer.println("<h2> ");
		writer.println("welcome " + name);
		writer.println("<a href='CookieServlet2'>got to 2nd servlet</a>");

		writer.println("</h2>");

//		req.setAttribute("name", name);

	}

}
