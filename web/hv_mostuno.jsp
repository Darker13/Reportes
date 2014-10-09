<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
<%@page import="DTO.HojaDeVidaDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>

<% 
    
    HojaDeVidaDTO mostrar = new HojaDeVidaDTO();
    mostrar= (HojaDeVidaDTO) request.getSession().getAttribute("uno"); %>
<!doctype html>  
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]>
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->

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
       <h1>Actualizacion Hoja de Vida</h1>
       <!--<img class="imagen" src="images/Sin titulo-1 copia.jpg" alt="" > -->
       	 <img src="images/monitor.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
   <form name="registro" action="HojaVidaCtrl" method="get" accept-charset="utf-8">
       
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
       <div class="row">
           <div class="span3">
            <label>identificador</label>
            <input type="text" name="id" placeholder="nombre" value="<%= mostrar.getHojaVida() %>" readonly> <br>
              <label>Nombre del equipo:</label>
               <input type="text" name="nombre"  placeholder="nombre" value="<%= mostrar.getNombre()  %>" required><br>
                 <label>Serial Equipo</label>
                 <input type="text" 	name="Serial" value="<%= mostrar.getSerialEq() %>" placeholder="Serial" required>
           </div>
           <div class="span3">
                 <label>Ubicación</label>
		 <input type="text" name="Ubicación" value="<%= mostrar.getUbicacion() %>" placeholder="Ubicación" required>				
                 <label>Marca</label>
		 <input type="text" name="Marca" value="<%= mostrar.getMarca() %>" placeholder="Marca" required>
		 <label>Perifericos</label> 
		 <input type="text" name="Perifericos" value="<%= mostrar.getPerifericos() %>" placeholder="Perifericos" required>
           </div>
           <div class="span3">
                <label>Documento usuario</label> 
		<input type="text" 	name="IdUsuario" value="<%= mostrar.getIdUsuario() %>" placeholder="IdUsuario" required> 
                <label>Sistema Operativo</label> 
		<select name="Tipo" > 
                   <option value="1">Windows XP</option>
                   <option value="2">Windows Vista</option>
                   <option value="3">Windows 7</option>
                   <option value="4">Windows 8</option>
                   <option value="5">Linux Ubuntu</option>
                   <option value="6">Linux Mint</option>
                </select>
             <input class="btn btn-success" name="btncam" type="submit" value="Cambiar" >
           </div>
       </div>     
		</form>
   
   
   <!--<form name="mostrar" action="HojaVidaCtrl" method="post">
       <center>
       <input class="boton1" name="cons" type="submit" value="consultarHV" >
       </center>
   </form>
   <br>
   
   <form name="mostrart" action="HojaVidaCtrl" method="post">
       <center>
       <input class="boton1" name="vertodo" type="submit" value="Ver-Todas" >
       </center>
   </form>-->
   <br>
   <br>
   <br>
   <br>
   </article> 
   
 </section>

   </div>
   <!--end holder-->
  
   </div>
   <!--end container-->
   
   <!--start footer-->
   <footer>
   <div class="containers">
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