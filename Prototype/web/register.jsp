<%-- 
    Document   : register
    Created on : 01/04/2024, 4:24:43 PM
    Author     : btjhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Enter your details:</h1>
        <form action="welcome.jsp" method="POST">
            <table>
                <tr>
                    <td><label for="email">Email: </label></td>
                    <td><input type="text" name="email" required="true"></td>
                </tr>
                <tr>
                    <td><label for="name">Name: </label></td>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td><label for="password">Password: </label></td>
                    <td><input type="password" name="password" required></td>
                </tr>
                <tr>
                    <td><label for="gender">Gender: </label></td>
                    <td><input name="gender" required></td>
                </tr>
                <tr>
                    <td><label for="tos">TOS: </label></td>
                    <td><input type="checkbox" name="tos" value="checked"></td>
                </tr>
            </table>
            <br>
            <div>
                <a href="index_logout.jsp">Cancel</a>
                <input type="submit" value="Register"> 
            </div>
        </form>
    </body>
</html>
