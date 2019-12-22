<%-- 
    Document   : showShopper
    Created on : 19.12.2019, 2:49:24
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Зарегистрировать покупателя</title>
    </head>
    <body>
        <h1>Оформить заказ</h1>
        <h2>Мои данные</h2>
        <a href="index.jsp">Главна страница</a><br>
        <br>
        <form action="createShopper" method="POST">
            Имя:<br>
            <input type="text" name="name"><br>
            Фамилия:<br>
            <input type="text" name="lastname"><br>
            Электронная почта:<br>
            <input type="text" name="email"><br>
            Сумма денег:<br>
            <input type="text" name="money"><br>
            <br>
            <input type="submit" value="Добавить"><br>
        </form>
    </body>
</html>
