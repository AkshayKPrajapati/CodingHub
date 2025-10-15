package com.servlet.requestdispature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("success login , Welcome to new server ");
		
		response.setContentType("text/html");
		String email = request.getParameter("email");
		PrintWriter printWriter=response.getWriter();
		printWriter.print("Welcome ,"+email);
		
	}
}
