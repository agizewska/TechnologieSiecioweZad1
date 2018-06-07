<%@ page import="java.util.ArrayList" %>
<%@ page import="pwr.model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Mój
  Date: 07.06.2018
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Podsumowanie </title>
</head>
<body>
    <h1> Kupione produkty </h1>

    <table class="table">
        <thead>
        <tr>
            <th> Produkty </th>
            <th> Ceny </th>
        </tr>
        </thead>
        <tbody>
    <%
    ArrayList<Product> products = (ArrayList <Product>) request.getAttribute("products");

    String sum = (String) request.getAttribute("sum");
    String avg = (String) request.getAttribute("avg");

    for (int i = 0; i<products.size(); i++){
        String name = products.get(i).getName();
        String price = String.valueOf(products.get(i).getPrice());

       %>

    <tr>
        <td> <%= name%> </td>
        <td> <%= price%></td>
    </tr>
        <%
    }
    %>

        </tbody>
    </table>

        <h4> Suma: <%= sum%> </h4>
        <h4> Średnia: <%=avg %> </h4>




</body>
</html>
