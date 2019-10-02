<%-- 
    Document   : baga
    Created on : 29/09/2019, 20:40:54
    Author     : brunomuller
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <title>JSP Page</title>
        <style>
            .wrapper {
  position: relative;
  width: 960px;
  padding: 10px;
}
section {
  background: #7f7f7f;
  position: absolute;
  display: none;
  top: 10px;
  right: 0;
  width: 740px;
  min-height: 400px;
  color: #fff;
  border: 4px solid #000;
}
section:first-of-type {
  display: block;
}
nav {
  float: left;
  width: 200px;
}
ul {
  list-style: none;
}
li {
  background: #c3c3c3;
  width: 100%;
  height: 32px;
  line-height: 32px;
  margin-bottom: 10px;
  text-align: center;
  color: #fff;
  cursor: pointer;
  border: 4px solid #000;
}
.active {
  background: #7f7f7f;
}
            </style>
    </head>
    <body>
        <script>
  (function($) {
    $('nav li').click(function() {
      $(this).addClass('active').siblings('li').removeClass('active');
      $('section:nth-of-type('+$(this).data('rel')+')').stop().fadeIn(400, 'linear').siblings('section').stop().fadeOut(400, 'linear'); 
    });
  })(jQuery);
</script>
        <div class="wrapper">

  <nav>
    <ul>
      <li data-rel="1" class="active">Section 1</li>
      <li data-rel="2">Section 2</li>
      <li data-rel="3">Section 3</li>
      <li data-rel="4">Section 4</li>
    </ul>
  </nav>

  <section>
    <article>
      <h4>Section 1</h4>
    </article>
  </section>

  <section>
    <article>
      <h4>Section 2</h4>
    </article>
  </section>

  <section>
    <article>
      <h4>Section 3</h4>
    </article>
  </section>

  <section>
    <article>
      <h4>Section 4</h4>
    </article>
  </section>

</div>
    </body>
</html>
