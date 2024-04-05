<%-- 
    Document   : register2
    Created on : 20/03/2024, 7:10:05 PM
    Author     : zoe10
--%>

<%@page import="uts.isd.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/democss.css">
    <title>Registration Page</title>
</head>
<body>
    <% String submitted = request.getParameter("submitted");
        if (submitted != null && submitted.equals("yes")) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");
            if (request.getParameter("tos") != null) { %>
                <h1>Welcome <%= name %>!</h1>
                <p> Your email is: <%= email %>.</p>
                <p>Your password is: <%= password %>.</p>
                <p>Your gender is: <%= gender %>.</p>
                <p>Your address: <%= address %>.</p>
    <%-- Creating and storing User JavaBean into session --%>
    <%
        // Create User JavaBean instance
        User user = new User(email, name, password, gender, address);

        // Store User JavaBean into session
        session.setAttribute("user", user);
    %>
            <a href="index.jsp">Proceed to Main Page</a>
            <% } else { %>
                <p>To register, you must agree to the terms of service.</p>
                <a href="one.jsp">Register</a>
            <% }
        } else { %>
            <h1>Sign Up</h1>
            <form action="one.jsp" method="post">
                <table>
                    <tr><td>Full Name: </td><td><input type="text" placeholder="Enter Name" name="name" required="true"></td></tr>
                    <tr><td>Email: </td><td><input type="text" placeholder="Enter Email" name="email"></td></tr>
                    <tr><td>Password: </td><td><input type="password" placeholder="Enter Password" name="password"></td></tr>
                    <tr><td>Gender: </td><td><input type="text" placeholder="Enter Gender" name="gender"></td></tr>
                    <tr><td>Address:</td><td><input type="text" placeholder="Enter Address" name="address"></td></tr>
                    <tr><td>Agree to TOS:</td><td><input type="checkbox" name="tos"></td></tr>
                    <input type="hidden" name="submitted" value="yes">
                </table>
                <div>
                    <input class="button" type="submit" value="Register">
                    <a class="button" href="index.html">Cancel</a>
                </div>
            </form>
    <% } %>
</body>
</html>