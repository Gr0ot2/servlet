<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="tienda_fisica.css" type="text/css">
<title>Insert title here</title>
</head>
<body>
<div id="formulario">
<form action="Prueba2" name="cogiendodatos" method="post">
<label id="label">NOMBRE</label>
<br></br>
 <input name="nombre" 	type="text"/>
 <br></br>
 <label id="label">APELLIDO</label>
 <br></br>
 <input name="apellido" type="text"/>
 <br></br>
 <label id="label">NUMERO DE TELEFONO</label>
 <br></br>
 <input name="telefono" type="number"/>
 <br></br>
 <label id="label">CORREO ELECTRÓNICO</label>
 <br></br>
 <input name="correo" 	type="email"/>
 <br></br>
 <label id="label">TIENDA</label>
 <br></br>
<select name="1" id="1">
<option></option>
<option>zara</option>
<option>H&M</option>
<option>bershka</option>
</select> 
<br></br>
<input name="yes" type="checkbox" value="si"/>acepta los terminos de privacidad
<br></br>
<input name="yes" type="checkbox" value="no" checked="checked"/> no acepta los terminos de privacidad
<br></br>
 <input name="enviar" type="submit"/>
 </form>
 </div>
 </body>
</html>