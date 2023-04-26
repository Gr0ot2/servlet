<%@page import="proyecto.datos_pupilaje"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="caballos_pupilaje/relampago.css" type="text/css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<h1>relampago</h1>
<form action="pupilaje" method="get">
<input value="relampago"name="1" type="hidden"/>
<br></br>
<label id="label">fecha_nacimiento/compra</label>
<br><br>
<input name="nacimiento" type="text"/>
<br><br>
<label id="label">fecha_herrado</label>
<br><br>
<input name="herrado" type="text"/>
<br></br>
<label id="label">fecha_veterinario</label>
<br><br>
<input name="veterinario" type="text"/>
<br></br>
<label id="label">fecha_desparasitado</label>
<br><br>
<input name="desparasitado" type="text"/>
<br></br>
<label id="label">fecha_pienso</label>
<br><br>
<input name="pienso" type="text"/>
<br></br>
 <input name="enviar" type="submit"/>
</form>
</body>
</html>
