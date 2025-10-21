<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>JSP Declaration and Expression Example</title>
</head>
<body>
    <h1>Declaration</h1>
    <%!  
        int id = 101; 
        String name = "Hello"; 
        Set<Integer> list = new HashSet<Integer>(); 
    %>

    <h1>Expression Tag</h1>
    My name is: <%= name %><br>
    This is my id: <%= id %><br><br>

    <%
        list.add(10); 
        list.add(20); 
        list.add(30); 
    %>

    <h1>Print the List</h1>
    <%
        for(Integer num : list) {
            out.println(num + "<br>");
        }
    %>
</body>
</html>
