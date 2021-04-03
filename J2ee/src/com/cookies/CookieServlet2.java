package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.println(getServletName());

//		get all the cookies
		Cookie[] cookies = req.getCookies();

		boolean flag = false;
		String name = "";
		if (cookies == null) {
			writer.println("u r a new user");
			return;

		} else {
			for (Cookie cookie : cookies) {
				String c = cookie.getName();
				if (c.equals("name")) {
					flag = true;
					name = cookie.getValue();
				}
			}
		}
		if (flag) {
			writer.println("welcome back here " + name);
		}

		writer.println("welcome back " + name);

	}

}
