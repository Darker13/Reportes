<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>

<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]>
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>

	<script src="js/1.5.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	
    </head>
    <body>
    <!--start container-->
    <div id="containers">

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
   <h1>Bienvenidos</h1>
      <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/>
      
    </section>
   </div>
   
   
   <div class="holder_content1">
            

     <section class="group4">
       <h1>Registro Hoja de Vida</h1>
       <img class="imagen" src="images/Sin tÃ­tulo-1 copia.jpg" alt="" > 
       	 <img src="images/monitor.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
   
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
   <form name="registro" action="HojaVidaCtrl" method="get" accept-charset="utf-8">
       <div class="row">
           <div class="span3">
             <label>Nombre del equipo:</label>
             <input type="text" name="nombre"  placeholder="nombre" required><br>
             <label>Serial Equipo</label> 
             <input type="text" name="Serial" placeholder="Serial" required>
             <label>Ubicación</label>
             <input type="text" name="Ubicación" placeholder="Ubicación" required>				
           </div>
           <div class="span3">
             <label>Marca</label>
             <input type="text" name="Marca" placeholder="Marca" required>
             <label>Perifericos</label> 
             <input type="text" name="Perifericos" placeholder="Perifericos" required>
             <label>Documento usuario</label> 
             <input type="text" name="IdUsuario" placeholder="IdUsuario" required> 
           </div> 
           <div class="span3">
		<label>Sistema Operativo</label> 
                    <select name="Tipo" > 
                       <option value="1">Windows XP</option>
                       <option value="2">Windows Vista</option>
                       <option value="3">Windows 7</option>
                       <option value="4">Windows 8</option>
                       <option value="5">Linux Ubuntu</option>
                       <option value="6">Linux Mint</option>
                    </select>
                <br>
                <br>
              <center>
                 <input  class="boton1 btn btn-success" name="btn1" type="submit" value="Registro" >
              </center>
           </div>
       </div> 
		</form>
   <br>
   <br>
   <br>
   <br>
  <!-- <form name="mostrart" action="HojaVidaCtrl" method="post">
       <center>
       <input class="boton1 btn btn-success" name="vertodo" type="submit" value="Ver-Todas" >
       </center>
   </form>-->
   <br>
   </article> 
   
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
   <span>Luis Gordo</span>
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

   </div>
   </footer>
   </body></html>
