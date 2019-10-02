<%-- 
    Document   : Produto
    Created on : 25/09/2019, 19:37:30
    Author     : brunomuller
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="ClassesNegocio.Item"%>
<%@page import="ClassesNegocio.Globals"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css/Base.css" type="text/css" />

<%
    String contextPath = request.getContextPath();
    String g;
%>

<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }
        
        .baseProps {
            border: 1px solid #dddddd;
            padding: 8px 30px;
        }

        td, th, .baseProps {
          text-align: left;  
        }
        
        .tdRightAlign, .baseProps{
          text-align: right;
        }
        
        .tdCenterAlign, .baseProps{
          text-align: center;
        }

        tr:nth-child(even) {
          background-color: #AAD698;
        }
        
        .button{
            background-color: #89BF73;
            border: none;
            color: white;
            padding: 10px 70px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 12px;
          }

          img{
              width: 40px;
              height: 40px;
          }
          
          input{
              height: 30px;
              background-color: #89BF73;
              font-size: 14px;
              border-color: #89BF73;
              box-shadow: 0px 0px 0px 0px;
          }
    </style>
    <script>
        function baga(e){
            var linha = e.parentNode.parentNode.rowIndex;
            alert(linha)
            var coluna = e.parentNode.cellIndex - 1;
            alert(coluna)
            var a = document.getElementById("produtos").rows[linha].cells[coluna].querySelector('input').value;;
            return a;
        }
    </script>
</head>
<body>
    <h1>Lista de Produtos</h1>
    <table id="produtos">
        <col width="150">
        <col width="400">
        <col width="100">
        <col width="200">
        <col width="100">
        <col width="200">
        <tr>
            <th class="tdCenterAlign">Selecionado</th>
            <th>Nome do Produto</th>
            <th>Imagem</th>
            <th>Unidade</th>
            <th>Preço</th>
            <th>Quantidade</th>
            <th />
        </tr>

        <c:forEach items="${Produtos}" var="produto" varStatus="loop">
            <tr>
                <td class="tdCenterAlign"><input type="checkbox" name="selecionado" value="0"></td>
                <td> <c:out value = "${produto.nome}"/></td>
                <td> <img src="<c:out value = "${produto.urlImagem}"/>" onerror="this.src='http://s.glbimg.com/po/tt/f/original/2012/11/05/fundo_transparente.png'"/></td>
                <td> <c:out value = "${produto.unidade}"/></td>
                <td> <c:out value = "${produto.valor}"/></td>
                <td> <input type="number" name="quantidade" min="1" value="1"></td>
                <td class="tdRightAlign"><a class="button" onclick="baga(this);" href="${contextPath}/loja/Carrinho?action=Adicionar&id=${loop.index}&nome=${produto.nome}&urlImagem=${produto.urlImagem}&unidade=${produto.unidade}&valor=${produto.valor}&qtd=javascript: baga(this);">Adicionar ao Carrinho</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
