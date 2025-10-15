package com.servlet.attributeParameter;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletOne")
public class ServletOne extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get data from the user
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");

        // convert to integers
        int x = Integer.parseInt(firstNumber);
        int y = Integer.parseInt(secondNumber);

        int sum = x + y;

        // set attributes to send to ServletTwo
        request.setAttribute("sum", sum);
        request.setAttribute("firstNumber", x);
        request.setAttribute("secondNumber", y);

        // forward request to ServletTwo
        RequestDispatcher dispatcher = request.getRequestDispatcher("/servletTwo");
        dispatcher.forward(request, response);
    }
}
