<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="inicio.css" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="formulario">
<form action="prueba" name="cogiendodatos" method="post">
<input class="1" id="radio" type="radio" name="escoja" value="null" style="visibility:hidden" checked>
<input id="radio" type="radio" name="escoja" value="tienda online">tienda online
<input id="radio" type="radio" name="escoja" value="tienda fisica">tienda fisica
<br>
 <input name="enviar" type="submit"/>
</form>
</div>
</body>
</html>