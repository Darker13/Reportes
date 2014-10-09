<%@ page session="true" %>
<%@include file="Sesion.jsp" %>

<%@page import="DTO.UsuarioDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<% 
    
    UsuarioDto mostrar = new UsuarioDto();
    mostrar= (UsuarioDto) request.getSession().getAttribute("uno"); %>
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

	<script src="js/jquery.min.js"></script>
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


   <!--start intro-->

   <section id="intros">
   <div id="sliders">
   <div class="sliders_containersr">
   <img src="images/banner1.jpg" width="960" height="300" alt="baner">
   </div>
   </div>
 
   </section>
   <!--end intro-->
   
   
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
   <form name="registro" action="UsuariosCtrl" method="post" accept-charset="utf-8">
       
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
       <div class="row">
           <div class="span3">
           <label>identificacion:</label>
           <input type="text" name="documento" placeholder="documento" value="<%= mostrar.getDocumento() %>" readonly> <br>
                 <label>Nombres:</label>
		 <input type="text" name="nombres"  placeholder="nombre" value="<%= mostrar.getNombres()  %>" ><br>
                  <label>Apellidos:</label>
		 <input type="text" name="apellidos" value="<%= mostrar.getApellidos() %>" placeholder="Serial">
            </div>
           <div class="span3">        
                    <label>Cargo</label>
                      <input type="text" name="cargo" value="<%= mostrar.getCargo() %>" placeholder="Cargo" >				
		      <label>telefono</label>
                      <input type="text" name="telefono" value="<%= mostrar.getTelefono() %>" placeholder="Marca" >
                       <label>Usuario</label> 
			<input type="text" name="User" value="<%= mostrar.getUsuario() %>" placeholder="Perifericos" >
           </div>			
           <div class="span3">
               <!--<label>Contraseña</label> 
		<input type="text" 	name="contraseña" value="<%= mostrar.getPas() %>" placeholder="IdUsuario" > -->
                <label>Correo</label>
                <input type="text" name="correo" value="<%= mostrar.getCorreo() %>">
                <label>Tipo de usuario</label>
                <input type="text" name="Tipo" value="<%= mostrar.getTipo() %>">
                <label>Prioridad</label>
                <input type="text" name="Prioridad" value="<%= mostrar.getPrioridad() %>"
           </div>
        <div class="span3">    
                       <input class="btn btn-success" name="btncam" type="submit" value="Cambiar" >
        </div>
       </div>
    </form>
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