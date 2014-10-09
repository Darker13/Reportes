<%@ page session="true" %>
<%@include file="Sesion.jsp" %>

<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!-- scripts -->
 <script src='js/jquery.js' type='text/javascript'/></script>
 <!--<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>-->
 
<!-- estilos -->
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>

<!-- Inicio Mensaje de boton  -->
<script>
function msg()
{
alert("Registro realizado con exito");
}
</script>
<!-- fin de mensaje boton -->
	<script src="js/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'images/loading.gif',
				play: 5000,
				pause: 2500,
				hoverPause: true
			});
		});
	</script>
		
			
    </head>
    <body>
    <!--start container-->
    <div id="container">

    <!--start header-->

    <header>
 
   <!--start logo-->
    <a href="#" id="logo"><img src="images/logof.png" width="221" height="130" alt="logo"/></a>    

	<!--end logo-->
	
   <!--start menu-->

<nav>
    <ul>
        <li><a href="panel.jsp">Inicio</a></li>
        <li><a href="salir.jsp">Cerrar</a></li> 
    </ul>
</nav>
	<!--end menu-->
        <!--end header-->
	</header>
   <!--start holder-->
   <div class="holder_content1">
       
     
   <section class="group4">
   <h1>Creacion de Informes</h1>
     <label for="fecha">Seleccione fecha de inicio del Informe</label>
     <input title="El formato de la fecha es MM/DD/YYYY" type="date"
     	 name="fechayhora" pattern="(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\d\d">
     <label for="fecha">Seleccione fecha de fin del Informe</label>
     <input title="El formato de la fecha es MM/DD/YYYY" type="date"
     	 name="fechayhora" pattern="(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\d\d">
      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; 
				 <input class="boton1" type="submit" value="Generar" > 
					 
   </section>
   
    
	
   </div>
   <!--end holder-->
  
   </div>
   <!--end container-->
   
   <!--start footer-->
   <footer>
   <div class="container">
   <section class="footer_left">
   <h3>Electromedicina
   <span>Ingeniera Andrea</span>
   <span>6059999 ext </span>
   </h3>
   </section> 
   
   <section class="footer_left">
   <h3>Mantenimiento
   <span>Luis</span>
   <span>6059999 ext </span>
   </h3>
   </section> 

   
   <aside class="footer_left">
   <h3>Sistemas
   <span>Ing. Sistemas</span>
   <span>6059999 Ext 707</span>
   </h3>
   </aside> 
   <img src="images/contact-us.png" width="240" height="230" alt="contact" class="picture_footer"/>

    
   <div id="FooterTwo"> © 2013 PYTHON </div>
   <div id="FooterTree"> Funciona bajo el Navegador Mozilla Firefox </div> 
   </div>
   </footer>
   
 
   
   </body></html>
