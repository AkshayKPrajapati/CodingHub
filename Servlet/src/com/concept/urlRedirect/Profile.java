package com.concept.urlRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username= req.getParameter("username");
		String age =req.getParameter("age");
		
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("Profile Page  ");
		out.print("Hello, " + username + "<br>");
		out.print("Age is: " + age + "<br><br>");
		out.print("Do you want to log out ??");
		
	}

}
