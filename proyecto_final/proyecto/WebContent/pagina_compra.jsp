<html>
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="pagina_compra.css">
    <title>centro hipico medina del campo</title>
  </head>
  <body>
      <nav>
        <ul>
           <li>
            <a href="pagina_principal.jsp">Centro hipico medina del campo</a>
          </li>
          <li>
            <a href="pagina_caballos.jsp">caballos</a>
          </li>
          <li>
            <a href="pagina_herramientas.jsp">herramientas</a>
          </li>
          <li>
            <a href="pagina_compra.jsp">compra de articulos (provisional)</a>
          </li>
          <li>
            <a href="pagina_peluqueria.jsp">peluqueria equina</a>
          </li>
        </ul>
      </nav>
        <h1 id="titulo">
        <strong>CENTRO HIPICO MEDINA DEL CAMPO</strong>
      </h1>
           <a href="pagina_inicio_formulario.jsp"><img id=log src="img/caballo.jpg"/></a>           
      <div id="photos">
      <form action="compra" method="get">
       <div id="photo_espuela">
      <h2 id="espuela">ESPUELA</h2>
      <img id=photo1 src="img/espuela-inoxidable-de-contacto.jpg"/>
      <input type="text" name="producto"  >
      <input type="submit" value="a�adir" >
      </div>  
	</form>
       <form action="compra" method="get">
      <div id="photo_casco">
      <h2 id="casco">CASCO</h2>
      <img id="photo2" src="img/Casco-Equitacion-Fouganza-140-Terciopelo-Negro.jpg"/>
      <input type="text" name="producto"  >
      <input type="submit" value="a�adir" >
      </div>
      </form>
       <div id="photo_guantes">
      <h2 id="guantes">GUANTES</h2>
      <img id="photo3" src="img/guante-roeckl-wisbech-invierno-par.jpg"/>
      </div>
       <div id="photo_pantalon">
      <h2 id="pantalon">PANTAL�N</h2>
      <img id="photo4" src="img/Pantalon-equitacion-140-Ninos-Fouganza-marron.jpg"/>
      </div>
      </div>
  </body>
</html>