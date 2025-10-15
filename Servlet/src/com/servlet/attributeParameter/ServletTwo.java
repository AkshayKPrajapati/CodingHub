package com.servlet.attributeParameter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletTwo")
public class ServletTwo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        // retrieve data sent from ServletOne
        int sum = (int) request.getAttribute("sum");
        int x = (int) request.getAttribute("firstNumber");
        int y = (int) request.getAttribute("secondNumber");

        int multi = x * y;

        printWriter.print("<h2>Sum is " + sum + " and Multiplication is " + multi + "</h2>");
    }
}
