<%-- 
    Document   : edit_user
    Created on : 05/04/2024, 11:32:28 AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uts.isd.model.User"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/democss.css"> 
    <title>Edit Account</title>
</head>
<body>
    <h1>Edit Account</h1>
    
    <% 
        User user = (User) session.getAttribute("user"); 
        if (user != null) { // Check if user is not null
    %>
        <form action="update_user.jsp" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="<%= user.getName() %>" required><br>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="<%= user.getEmail() %>" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" value="<%= user.getPassword() %>" required><br>
            <label for="gender">Gender:</label>
            <input type="text" id="gender" name="gender" value="<%= user.getGender() %>"><br>
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" value="<%= user.getAddress() %>"><br>
            <input type="submit" value="Update">
        </form>
    <% } else { %>
        <p>No user logged in.</p>
    <% } %>
    
    <a href="index.jsp">
        <button class="button">Back to Main Page</button>
    </a>
</body>
</html>
