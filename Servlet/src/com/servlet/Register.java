package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		
		System.out.println("Name : "+firstName+ " "+lastName);
		System.out.println("Email : "+email);
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.print("Hey , "+firstName+" "+ lastName+"</br>");
		printWriter.print("Email : "+email);
		
	}
}
