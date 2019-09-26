<%-- 
    Document   : Produto
    Created on : 25/09/2019, 19:37:30
    Author     : brunomuller
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="ClassesNegocio.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<!--<ul>
  <li><a class="active" href="#home">Produto</a></li>
  <li><a href="#news">News</a></li>
</ul>-->
<table>
    <tr>
        <th>Selecionado</th>
        <th>Nome do Produto</th>
        <th>Imagem</th>
        <th>Unidade</th>
        <th>Quantidade</th>
        <th />
    </tr>
  
<%
    for(Item produto : (List<Item>)request.getAttribute("Produtos")){
%>       
  <tr>
        <td><input type="checkbox" name="selecionado" value="0"></td>
        <td><%  out.println(produto.getNome());  %></td>
        <td><%  out.println(produto.getUrlImagem());  %></td>
        <td><%  out.println(produto.getUnidade()); %></td>
        <td><input type="text" name="quantidade"></td>
        <td><button type="submit">Adicionar ao Carrinho</button></td>
    </tr>
    <% } %>
</table>

<!--<c:forEach items="${request.Produtos}" var="produto">
    <ul>
        <li> <c:out value = "${produto.nome}"/></li>
    </ul>
</c:forEach>
      <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach>-->
</body>
</html>
