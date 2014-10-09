<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]>
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
<!-- css -->
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/stylescopia.css"/>
<link rel="stylesheet" href="css/estilo.css">

<!-- scripts -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'images/loading.gif',
				play: 0,
				pause: 0,
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
		<nav>
    <ul>
    <li><a href="index-administrador.jsp">Inicio</a></li>
    <li><a href="configuracion.jsp">Configuracion</a></li>
			<li><a href="registro.jsp">Usuario +</a></li>
			<li><a href="index.jsp">Cierre</a></li> 
    </ul>
    </nav>  

	</header>
 		<div class="holder_content1">
		<section class="group4">		                            
          <table border="1">
              <tr>
                  <td>Id</td>
                  <td>Nombre</td>
                  <td>Apellido</td>
                  <td>Contraseña</td>
                  <td>Usuario</td>
              </tr>
          </table>       
<BR>
<BR>
                                        </section>	
   		</div>
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
   <!--end footer-->
   </body></html>
