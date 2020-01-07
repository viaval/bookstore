<%-- 
    Document   : showBuyBook
    Created on : 21.12.2019, 19:19:21
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RAAMATUD KAUPLUS  "Rahva Raamat"</title>
    </head>
    <body>
        <h1>RAAMATUD KAUPLUS  "Rahva Raamat"</h1>
        <p>${info}</p>
       <a href="index.jsp">Главна страница</a><br>
        <br>
        <form action="buyBook" method="POST">
            <h1>Список книг</h1>
            <select name="bookId">
                <c:forEach var="book" items="${listBooks}" varStatus="status">
                    <option value="${book.id}">
                        ${status.index+1}) ${book.title}. ${book.author}. ${book.year}. ${book.price}
                    </option>
                </c:forEach>
            </select>

            <h2>Список покупателей</h2> 
            <select name="shopperId">
                <c:forEach var="shopper" items="${listShoppers}" varStatus="status">
                    <option value="${shopper.id}">
                     ${status.index+1}) ${shopper.name}. ${shopper.lastname}. ${shopper.email}. ${shopper.money}
                    </option>
                </c:forEach>
            </select><br>
            <br>
            Количество экземпляров:<br>
            <br>
            <input type="test" name="count" value=""><br>
            <br>
            <input type="submit" value="КУПИТЬ КНИГУ">
        </form>  
    </body>
</html>
