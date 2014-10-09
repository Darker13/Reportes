<%@page import="java.util.ArrayList"%>
<%@page import="DTO.IncidenteDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@include file="Sesion.jsp" %>
<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<style>
    h1 {
        color: green;
    }
    h2 {
        color: green;
    }
</style>

<!-- script -->
	<script src="js/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
        <script src="js/hora.js"></script>
	
	    </head>
    <body>
    <!--start container-->
    <div id="containers">

    <!--start header-->

    <header>
 
   <!--start logo-->
    <a href="#" id="logo"><img src="images/logof.png" width="211" height="100" alt="logo"/></a>    

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
   
   <div class="holder_content1">

       
   <section class="group4">
       
              
                
   <h1>Bienvenidos</h1>
      <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/>
      
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
        hola 
    </section>
   </div>
   <!--end holder-->
   <!--start holder-->
   <div class="holder_content">
       <!-- Inicio solo rol 1 menciona al administrador --> 
       
       <% if (rol == 1){ %>
   <section class="group1">
   <h1>Historial Incidentes</h1>
   <img src="images/calendar_date.png" width="51" height="52" alt="icons" class="icons"/>
   <p>En este modulo encontraras los registros de incidentes que ya tienen una asignacion y una solucion dada por el administrador o el tecnico.<br><br></p>
   <a href="HistorialCtrl?accion=Historial&Usuario=<%=rolId %>&idusuario=<%=iden %>"> <boton style="float:right" class="btn btn-success"><center>Historial</center></boton></a>
   </section>
  
   <section class="group2">
   <h1>Registro Incidentes</h1>
   <img src="images/address_book.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Aqui podra registrar un reporte. Puede dar un titulo un tipo de incidente sea Hardware (La parte fisica del computador ya sean teclados mouse etc..) 
   Software (Programas como historias clinicas, office) si es diferente escoja otros.</p>
   <a href="incidente.jsp" style="float:right" ><input class="boton btn btn-success" type="submit" value="Incidentes"> </a>
   </section>    
   <section class="group3">
   <h1>Listado de Incidente</h1>
   <img src="images/pages.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Aqui encontrara la lista de los incidentes asignados y que se encuentran pendientes a una solucion por parte del administrador o el tecnico.<br><br></p>
    <a href="IncidenteCtrlr?accion=Mostrar&Usuario=<%=rolId %>&idusuario=<%=iden %>"> <boton style="float:right" class="btn btn-success"><center>Mostrar</center></boton></a>
   </section>
   
   
   
   <section class="group1">
   <h1>Usuarios</h1>
   <img src="images/user.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Registrar el usuario de acuerdo a un patron establecido, unos datos minimos para el correcto manejo de la aplicacion.<br><br><br></p>
   <a href="registro.jsp" style="float:right" ><input class="boton btn btn-success" type="submit" value="Usuarios"> </a>
    
   </section>
   
   <section class="group2">
   <h1>Edicion usuarios</h1>
   <img src="images/users.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Modificar los datos de los usuarios, eliminarlos, consultarlos, toda la administracion con los usuarios. <br><br><br><br> </p>
   <form method="post" action="UsuariosCtrl">
             <input type="submit" name="Consulta" value="ConsultarTodos" style="float:right"  class="boton btn btn-success">
         </form> 
   </section>
   
    <section class="group3">
   <h1>Partes</h1>
   <img src="images/tools.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Registro de partes ingresadas a la institucion se lleva un control de estas <br><br><br><br><br> </p>
   <a href="registro-partes.jsp" style="float:right" ><input class="btn btn-success"  type="submit" value="Partes"> </a>
    
   </section>
       
        <section class="group1">
   <h1>Edicion partes</h1>
   <img src="images/tools.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Modificar las partes previamente registradas, eliminarlos, consultarlos, toda la administracion de partes. <br> <br><br><br><br> </p>
   <form method="post" action="ParteCtrl">
             <input type="submit" name="Consult" value="Consultar" style="float:right" class="btn btn-success" >
         </form> 
    
   </section>
   
    <section class="group2">
   <h1>Hojas de Vida </h1>
   <img src="images/blank_page.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Registrar la hoja de vida del equipo de acuerdo a un patron establecido, para el control de todas las maquinas utilizadas en la clinica (Computadores).<br><br><br></p>
   <a href="hv.jsp" style="float:right" ><input class="boton btn btn-success" type="submit" value="Hojas de Vida"> </a>
   </section>
   
         <section class="group3">
   <h1>Ver Hojas de vida</h1>
   <img src="images/blank_page.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Modificar las Hojas de vida previamente registradas, eliminarlos, consultarlos, toda la administracion de partes. <br><br><br><br> </p>
   <a href="HojaVidaCtrl?accion=Mostrar&Usuario=<%=rolId %>&idusuario=<%=iden %>"> <boton style="float:right" class="btn btn-success"><center>Mostrar</center></boton></a>
  </section>
   
    <%} %>
       
       
    
    <!-- fil rol 1 -->
    <!--uno y dos rol -->
    <% if( rol == 1  ){ %>
    
    <section class="group1">
   <h1>Incidentes pendientes por asignacion</h1>
   <img src="images/clock.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <form method="post" action="IncidenteCtrlr">
             <input type="submit" name="Consult" value="Pendientes" style="float:right" class="btn btn-success" >
         </form> 
    
   </section>
    
    
    <section class="group2">
   <h1>Reportes</h1>
   <img src="images/page.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
  <a href="Reports/menu.jsp">  <button style="float:right" class="btn btn-success" value="Reporte"> reporte</button></a>
   </section>
    
    <% } %>
    
  
    
    
       <!-- Inicio rol 2 y 3 -->
   <% if( rol == 2 | rol == 3 ){ %>
   <section class="group1">
   <h1>Registro Incidentes</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <a href="incidente.jsp" style="float:right" ><input class="boton btn btn-success" type="submit" value="Incidentes"> </a>
   </section>    
  
   <% } %>
   <% if( rol ==2 | rol == 3 ){ %>
   <section class="group2">
   <h1>Listado de Incidente</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
      <a href="IncidenteCtrlr?accion=Mostrar&Usuario=<%=rolId %>&idusuario=<%=iden %>"> <boton style="float:right" class="btn btn-success"><center>Mostrar</center></boton></a>
   </section>
      <% } %>
     <% if(rol == 2) {%> 
<section class="group3">
   <h1>Hojas de Vida </h1>
   <img src="images/icon2.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum  facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.</p>
   <a href="hv.jsp" style="float:right" ><input class="boton btn btn-success" type="submit" value="Hojas de Vida"> </a>
   </section>
<% }  %>
<% if( rol == 2  | rol == 3){ %>
        <section class="group3">
   <h1>Ver Hojas de vida</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <!--<form name="mostrart" action="HojaVidaCtrl" method="post">
     <input style="float:right" class="btn btn-success" name="vertodo" type="submit" value="Ver-Todas" >
   </form>-->
    <a href="HojaVidaCtrl?accion=Mostrar&Usuario=<%=rolId %>&idusuario=<%=iden %>"> <boton style="float:right" class="btn btn-success"><center>Mostrar</center></boton></a>
  </section>
      <% } %>  
   <%if(rol == 2 ) {%>
    <section class="group1">
   <h1>Partes</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <a href="registro-partes.jsp" style="float:right" ><input class="btn btn-success"  type="submit" value="Partes"> </a>
    
   </section>
       
        <section class="group2">
   <h1>Edicion partes</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <form method="post" action="ParteCtrl">
             <input type="submit" name="Consult" value="Consultar" style="float:right" class="btn btn-success" >
         </form> 
    
   </section>
          <%}%>
          
          
            <% if(  rol == 2 ){ %>
    
    <section class="group1">
   <h1>Incidentes pendientes a asignacion</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <form method="post" action="IncidenteCtrlr">
             <input type="submit" name="Consult" value="Pendientes" style="float:right" class="btn btn-success" >
         </form> 
    
   </section>
    
    <% } %>
          
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

   
   <section class="footer_left">
   <h3>Sistemas
   <span>Ing. Sistemas</span>
   <span>6059999 Ext 707</span>
   </h3>
   </section> 
   <img src="images/contact-us.png" width="240" height="230" alt="contact" class="picture_footer"/>

    
   
   </div>
   </footer>
   
   </body></html>
