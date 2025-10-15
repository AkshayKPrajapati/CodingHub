package com.servlet.requestdispature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Hardcoded data
		 */
		String originalEmail = "admin@mail.com";
		String originalPassword = "admin";
		
		
		
		
		
		/*
		 * get data from the user
		 */
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("login credential Email : "+email +" Password : "+password);
		
		
		RequestDispatcher dispatcher=null;
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		
		//check condition
		if(originalEmail.equalsIgnoreCase(email) && originalPassword.equalsIgnoreCase(password)) {
			System.out.println("login credential sucessfully !!! ");
			dispatcher=request.getRequestDispatcher("/success");
			dispatcher.forward(request, response);
		}
		else {
			System.err.println("credential failed !!!");
			printWriter.print("Invalid  Credential");
			dispatcher=request.getRequestDispatcher("requestDispature.html");
			dispatcher.include(request, response);
		}
		
	}
	

}
