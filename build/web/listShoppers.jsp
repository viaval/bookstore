<%-- 
 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список покупателей</title>
    </head>
    <body>
        <h1>Список покупателей</h1>
        <a href="index.jsp">Главна страница</a><br>
        <ol>
            <c:forEach var="shopper" items="${listShoppers}">
                <li>${shopper.name}. ${shopper.lastname}. ${shopper.email}. ${shopper.money}</li>
            </c:forEach>
        </ol>
    </body>
</html>
