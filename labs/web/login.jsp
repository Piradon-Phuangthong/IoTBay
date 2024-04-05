<%-- 
    Document   : login
    Created on : 05/04/2024, 1:47:21 PM
    Author     : btjhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/democss.css">
        <title>Login</title>
    </head>
    <body>
        <h1>Enter your sign-in details: </h1>
        <form action="checkuser.jsp" method="post">
            <table>
                <tr><td>Email: </td><td><input type="text" placeholder="Enter Email" name="email"></td></tr>
                <tr><td>Password: </td><td><input type="password" placeholder="Enter Password" name="password"></td></tr>
            </table>
            <div>
                <input class="button" type="submit" value="Login">
            </div>
        </form>
    </body>
</html>
