<%-- 
    Document   : showLogin
    Created on : 18.12.2019, 23:15:35
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>вход в ситему</title>
    </head>
    <body>
        <h1>Входите!</h1>
        <p>${info}</p>
        <form action="login" method="POST">
            Login: <input type="text" name="login"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="Go">
        </form>
    </body>
</html>
