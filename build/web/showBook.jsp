<%-- 
    Document   : showBook
    Created on : 19.12.2019, 1:41:26
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавить книгу в корзину</title>
    </head>
    <body>
        <h1>Оформить заказ</h1>
        <h2>Выбрать способ доставки</h2>
        <a href="index.jsp">Главна страница</a><br>
        <br>
        <form action="createBook" method="POST">
            Название:<br>
            <input type="text" name="title"><br>
            Автор:<br>
            <input type="text" name="author"><br>
            Жанр:<br>
            <input type="text" name="genre"><br>
            Год издания:<br>
            <input type="text" name="year"><br>
            Цена:<br>
            <input type="text" name="price"><br>
            Колличество:<br>
            <input type="text" name="quantity"><br>
            <br>
            <input type="submit" value="Добавить"><br>
          
        </form>
    </body>
</html>
