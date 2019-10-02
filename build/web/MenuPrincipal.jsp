<%-- 
    Document   : MenuPrincipal
    Created on : 29/09/2019, 10:51:05
    Author     : brunomuller
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" href="css/navBar.css" type="text/css" />
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <div class="navBar" id="myDIV">"
          <button onClick="location.href='/loja/Produto'" class="btn active">Produtos</button>
          <button onClick="location.href='/loja/Carrinho'" class="btn">Carrinho</button>
          <button class="btn">Login</button>
        </div>

        <script>
            // Add active class to the current button (highlight it)
            var header = document.getElementById("myDIV");
            var btns = header.getElementsByClassName("btn");
            for (var i = 0; i < btns.length; i++) {
              btns[i].addEventListener("click", function() {
              var current = document.getElementsByClassName("active");
              current[0].className = current[0].className.replace(" active", "");
              this.className += " active";
              });
            }
        </script>
        
        <div id="baga">
            <iframe style="border-width: 0px; width: 100%;margin: 0" src="Produto.jsp"></iframe>
        </div>
    </body>
</html>

