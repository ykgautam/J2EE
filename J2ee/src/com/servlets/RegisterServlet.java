package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
//		writer.print("welcome to RegisterServlet");
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String condition = req.getParameter("condition");
		writer.println(" condition value is  " + condition);
		if (condition != null) {
			if (condition.equals("checked")) {
				writer.println("<h3>you have clicked the checkbox</h3>");
				writer.print("<h2> name: " + name + "</h2>");
				writer.println("<h2> password: " + password + "</h2>");
				writer.println("<h2> email: " + email + "</h2>");
				writer.println("<h2> gender: " + gender + "</h2>");
				writer.println("<h2> course: " + course + "</h2>");
				
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("success");
				requestDispatcher.include(req, resp);
//				requestDispatcher.forward(req, resp);
				
			} else {
				writer.println("<h2>please click on the terms and condtion</h2>");
			}
		} else {
			writer.println("<h2>please click on the terms and condtion</h2>");

			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}

	}

}
