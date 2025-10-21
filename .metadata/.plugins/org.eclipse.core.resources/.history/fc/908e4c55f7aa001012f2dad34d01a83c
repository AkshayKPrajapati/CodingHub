package com.concept.urlRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlRedirect")
public class UrlRedirect extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO get the data user client 
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welocme to Home Page  ");
		out.print("Hello, " + username + "<br>");
		out.print("Age is: " + age + "<br><br>");

		
		out.print("<a href='profile?username=" + username + "&age=" + age + "'>Go to Profile</a>");
	}

}
