<%-- 
    Document   : welcome
    Created on : 01/04/2024, 4:24:55 PM
    Author     : btjhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <%
          String tos = request.getParameter("tos");
    %>
    <body>
        <header style="text-align:center;">
            <a href="main.jsp">Home</a>
            <a href="welcome.jsp">Account</a>
            <a href="index_logout.jsp">Logout</a>
        </header>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
        %>
        <%if(request.getParameter("tos") != null){ %>
        <h1>Welcome <%= name%></h1>
        <p>Your email is <%= email%></p>
        <p>Your password is <%= password%></p>
        <p>Your gender is <%= gender%></p>
        <%}else{%>
        <p>Sorry, you must agree to the Terms of Service.</p>
        <a href="register.jsp">Click here to go back</a>
        <%}%>
    </body>
</html>
