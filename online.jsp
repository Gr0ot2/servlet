<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link  rel="stylesheet" href="online.css" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="formulario">
 <form action="prueba3" name="cogiendodatos" method="post">
 <label>NOMBRE</label>
 <br></br>
 <input name="nombre" type="text"/>
 <br></br>
 <label>APELLIDO</label>
 <br></br>
 <input name="apellido" type="text"/>
 <br></br>
 <label>TELEFONO</label>
 <br></br>
 <input name="telefono" type="number"/>
  <br></br>
 <label id="label">CORREO ELECTRÓNICO</label>
 <br></br>
 <input name="correo" 	type="email"/>
 <br></br>
 <label>TIENDA</label>
 <br></br>
<select name="1" id="1">
<option></option>
<option>amazon</option>
<option>aliexpress</option>
</select> 
<br></br>
<br></br>
<input name="yes" type="checkbox" value="si"/>acepta los terminos de privacidad
<br></br>
<input name="yes" type="checkbox" value="no"/> no acepta los terminos de privacidad
<br></br>
 <input name="enviar" type="submit"/>
 </form>
 </div>
</body>
</html>