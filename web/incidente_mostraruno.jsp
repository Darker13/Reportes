<%@page import="DTO.IncidenteDto"%>
<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>

<% 
    
    IncidenteDto mostrar = new IncidenteDto();
    mostrar= (IncidenteDto) request.getSession().getAttribute("uno"); %>
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
       <h1>Actualizacion Incidente</h1>
       <!--<img class="imagen" src="images/Sin titulo-1 copia.jpg" alt="" > -->
       	 <img src="images/monitor.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
   <form name="actualizarIncidente" action="IncidenteCtrlr" method="post" accept-charset="utf-8">
       
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
       <div class="row">
           <div class="span3">
               <label>id incidente</label>
               <input type="text" name="idincidente" placeholder="documento" value="<%= mostrar.getIdincidente()  %>" readonly> <br>
           <label>Id usuario</label>
            <input type="text" name="documento" placeholder="documento" value="<%= mostrar.getIdusuario()  %>" > <br>
                 
                  <label>Titulo:</label>
		 <input type="text" name="titulo" value="<%= mostrar.getTituloIncidente()%>" >
                 
                 <label>Estado:</label>
		 <input type="text" name="estado" value="<%= mostrar.getIdEstado()  %>">
            </div>
           <div class="span3">        
                    <label>Tipo Daño:</label>
                      <input type="text" name="tipo" value="<%= mostrar.getIdTipo_Daño() %>">				
		      <label>Descripcion:</label>
                      <input type="text" name="descripcion" value="<%= mostrar.getDescripcion() %>">
                     <!-- <label>Asignado</label>
               <input type="text" name="asignado" placeholder="documento" value="<%= mostrar.getIdAsignado() %>" > <br>-->
                     <label> Asignado a: </label>
               <select name="asignado">
                   <option value="1">Administrador</option>
                   <option value="2">Tecnico - Erika Miranda</option>
                   <option value="4">Tecnico - Daniel Navas</option>
               </select>
               <label>Nivel</label>
               <input type="text" name="Nivel" placeholder="documento" value="<%= mostrar.getIdnivel()  %>" > <br>
               
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