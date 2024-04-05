<%-- 
    Document   : logout
    Created on : 05/04/2024, 10:40:09 AM
    Author     : zoe10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Logout</title>
    <link rel="stylesheet" href="css/democss.css">
</head>
<body>
    <%
                // Invalidate session when user clicks "Logout"
                session.invalidate();
    %>
    <h1>You have been logged out.</h1>
    <p>Click <a href="index.jsp">here</a> to return to the main page.</p>
</body>
</html>
