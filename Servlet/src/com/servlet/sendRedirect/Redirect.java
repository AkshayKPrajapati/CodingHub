package com.servlet.sendRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sendRedirect")
public class Redirect extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		//Original Data
		String originalEmail="admin@mail.in";
		String originalPassword="admin";
		
		
		if(email.equals(originalEmail) && password.equals(originalPassword)){
			resp.sendRedirect("home.html");
		}
		
	}
}
