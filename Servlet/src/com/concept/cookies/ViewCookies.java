package com.concept.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewCookies")
public class ViewCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        out.println("<h2>Stored Cookies:</h2>");

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println(cookie.getName() + " : " + cookie.getValue() + "<br>");
            }
        } else {
            out.println("No cookies found!");
        }
    }
}
