<%@page import="proyecto.datos_caballos_clase"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object obj= request.getSession().getAttribute("list");
ArrayList<datos_caballos_clase> list;
if (obj instanceof ArrayList<?>) {
    list = (ArrayList<datos_caballos_clase>) obj;
 %>
  <%for(datos_caballos_clase dato:list)  {%>
  <br></br>
  NOMBRE
  <br></br>
   <%= dato.getNombre()%>
   <br></br>
 	RAZA
   <br></br>
   <%= dato.getRaza()%>
    <br></br>
	CAPA
   <br></br>
   <%= dato.getCapa()%>
     <br></br>
   <%} %>
 <%} %>
</body>
</html>