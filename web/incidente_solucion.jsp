<%@page import="DTO.IncidenteDto"%>
<%@ page session="true" %>
<%@include file="Sesion.jsp" %>

<% 
    
    IncidenteDto mostrar = new IncidenteDto();
    mostrar= (IncidenteDto) request.getSession().getAttribute("uno"); %>
<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <script src="js/jquery.min.js"></script>
	
<!-- <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
	<script src="js/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
        <script src="js/hora.js"></script>

    </head>
    <body onload="document.forms['solucion']['fechafinal'].value=fecha;"> 
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
   <h1>Solucion Incidente</h1>
   <img src="images/tools.png" width="51" height="52" alt="icons" class="icons"/>
   <center>
   <article>
     <div class="row">
           <div class="span3">
               <label>id incidente</label>
               <input type="text" name="idincidente" placeholder="documento" value="<%= mostrar.getIdincidente()  %>" readonly > <br>
           
                  
            </div>
           <div class="span3">        
                    <label>Tipo Daño:</label>
                      <input type="text" name="tipo daño" value="<%= mostrar.getIdTipo_Daño() %>" placeholder="tipo daño"  disabled>				
		      
                      <label>Asignado</label>
               <input type="text" name="documento" placeholder="documento" value="<%= mostrar.getIdAsignado() %>" disabled> <br>
               <label>Nivel</label>
               <input type="text" name="documento" placeholder="documento" value="<%= mostrar.getIdnivel()  %>" disabled> <br>
                       
           </div>
        <div class="span3">    
   </center>
  
   
               
               <form action="SolucionCtrl" method="post" name="solucion">   
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
             <label>id incidente</label>
               <input type="text" name="idincidente" placeholder="documento" value="<%= mostrar.getIdincidente()  %>" readonly > <br>
            <label>Titulo Incidente:</label>
            <input type="text" name="titulo" value="<%= mostrar.getTituloIncidente()%>" placeholder="Serial" readonly >
           <label>Id usuario</label>
           <input type="text" name="idUsuario" placeholder="documento" value="<%= mostrar.getIdusuario()  %>" readonly > <br>
                 
            <input type="hidden" name="idAsignado" placeholder="documento" value="<%= mostrar.getIdAsignado() %>" >
           
               <label>Descripcion:</label>
               <input type="text" name="descripcion" value="<%= mostrar.getDescripcion() %>" placeholder="Marca" readonly >
<fieldset>
    <legend>Fecha de Solucion</legend>   
    <input type="text" name="fechafinal" required readonly>
    <legend>Solucion</legend>
    <textarea class="textarea" name="solucion" required></textarea>
     <legend>Comentarios:</legend>
     <textarea name="comentario"></textarea> 
     
     <input class="btn btn-success" type="submit" name="registra" value="registrar" > 
</fieldset>
 </form>               
                
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

   </div>
   </footer>
   
   </body></html>
