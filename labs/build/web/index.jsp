<%-- 
    Document   : index
    Created on : 05/04/2024, 10:33:48 AM
    Author     : zoe10
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Page</title>
    <style>
        .container {
            display: flex;
            justify-content: space-between;
            align-items: flex-start;
            height: 80vh;
        }
        .user-info {
            text-align: right;
            margin-bottom: 10px;
        }
        .top-left {
            align-self: flex-start;
        }
    </style>
    <link rel="stylesheet" href="css/democss.css">
</head>
<body>
    <div class="container">
        <%-- Retrieve User JavaBean from session --%>
        <% User user = (User) session.getAttribute("user"); %>
        
        <% if (user != null) { %>
            <div>
                <h1>Main Page</h1>
            </div>
        <% } else { %>
            <div>
                <p>Please log in to view your details.</p>
                <a class="button" href="one.jsp">Register</a>
            </div>
        <% } %>
    </div>

    <div class="user-info">
        <% if (user != null) { %>
            <p>You are logged in as <%= user.getName() %>, <%= user.getEmail() %></p>
            <a href="logout.jsp">Logout</a>
            <%-- Invalidate session on logout --%>
            
            <a href="edit_user.jsp">My Account</a>
        <% } %>
    </div>
</body>
</html>
