<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
    <h3>This is index page</h3>

    <%! 
        String name = "Akshay"; 
        Set<String> set = new HashSet<String>();
    %>

    <%
        // Add some sample data to the set
        set.add("Java");
        set.add("JSP");
        set.add("Servlet");
        set.add("HTML");
    %>

    <p>Name: <%= name %></p>

    <h4>Set Elements:</h4>
    <ul>
        <%
            for(String item : set){
        %>
            <li><%= item %></li>
        <%
            }
        %>
    </ul>
</body>
</html>
