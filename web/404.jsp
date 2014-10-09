<%@ page session="true" %>
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
<style >
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
       <img class="img-rounded"  src="images/404-1.png"   alt="404" class="icons"/>
   </section>
   </div>
   <!--end holder-->
   <!--start holder-->
   <div class="holder_content">
       <!-- Inicio solo rol 1 menciona al administrador --> 
    
   <section class="group1">
   <h1>Registro Incidentes</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
   <a href="incidente.jsp" style="float:right" ><input class="boton btn btn-success" type="submit" value="incidentes"> </a>
   </section>    
  
   <section class="group2">
   <h1>Listado de Incidente</h1>
   <img src="images/icon1.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.   </p>
      <a href="IncidenteCtrlr?accion=Mostrar&Usuario=<%=rolId %>&idusuario=<%=iden %>"> <boton style="float:right" class="btn btn-success"><center>Mostrar</center></boton></a>
   </section>
    
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
