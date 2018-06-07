<%--
  Created by IntelliJ IDEA.
  User: Mój
  Date: 07.06.2018
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> Shop </title>
  </head>
  <body>
  <h1> Sklep ze wszystkim </h1>
  <h2> Wybierz produkty </h2>
  <form action="/ShopController" method="post">
    <div> Produkt: <input type="text" name="p1"> Cena: <input type="text" name="price1"></div>
    <div> Produkt: <input type="text" name="p2"> Cena: <input type="text" name="price2"></div>
    <div> Produkt: <input type="text" name="p3"> Cena: <input type="text" name="price3"></div>
    <div> Produkt: <input type="text" name="p4"> Cena: <input type="text" name="price4"></div>
    <div> <input type="submit" value="Dodaj do koszyka"></div>
  </form>
  </body>
</html>
