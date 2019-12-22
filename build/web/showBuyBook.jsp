<%-- 
    Document   : showBuyBook
    Created on : 21.12.2019, 19:19:21
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Книжный магазин "КНИГОЛЮБ"</title>
    </head>
    <body>
        <h1>Книжный магазин "КНИГОЛЮБ"</h1>
    <body>
        <p>${info}</p>
        ${book.title}, по цене ${book.price}EUR - ${book.quantity} шт.
        <br>
        <form action="buyBook" method="POST" name="buy_book">
            <select name="quantityBook">
                <c:forEach begin="1" end="${book.quantity}" varStatus="status">
                    <option value="${status.count}">${status.count}</option>
                </c:forEach>
            </select><br>
            <br>
            <input type="hidden" value="${book.id}" name="book_id">
            <input type="submit" value="Купить">
        </form>  
    </body>
</html>
