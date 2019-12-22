<%-- 
    Document   : listBooks
    Created on : 19.12.2019, 19:55:29
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список книг</title>
    </head>
    <body>
        <h1>Список книг</h1>
        <a href="index.jsp">Главна страница</a><br>
        <ol>
            <c:forEach var="book" items="${listBooks}">
                <li>${book.title}. ${book.author}. ${book.genre}. ${book.year}. ${book.price}</li>
            </c:forEach>
        </ol>
    </body>
</html>
