<%@page import="java.sql.Date"%>
<%@ page session="true" %>
<%
HttpSession sesion=request.getSession();

%>
<%
String usuario = "";
HttpSession sesionOk = request.getSession();
if (sesionOk.getAttribute("usuario") == null) {
%>
<jsp:forward page="index.jsp">
<jsp:param name="error" value="Es
obligatorio identificarse"/>
</jsp:forward>
<%
} else {
usuario = (String)sesionOk.getAttribute("usuario");
}
%>

<%@page import="DTO.UsuarioDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.UsuarioDao"%>

<!--codigo 2-->
<!doctype html>  
<html>   
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!-- scripts -->
 <script src='http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js' type='text/javascript'/></script>
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
 
<!-- estilos -->
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
<!-- <link rel="stylesheet" type="text/css" href="css/default.css" /> 
		<link rel="stylesheet" type="text/css" href="css/component.css" />-->
		
		<!-- script -->
		<script src="js/modernizr.custom.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>

	
	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'images/loading.gif',
				play: 0,
				pause: 2500,
				hoverPause: true
			});
		});
	</script>
		<!-- acordeon -->
		<script type="text/javascript" >
			$(document).ready(function(){
						$(".group4 h1").click(function(){
							$(this).parent().find(".mas").animate({ opacity:'toggle' , height:'toggle'},500);
						});
			});
			
		</script>
		<!-- fin acordeon -->
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
    <li><a href="index-administrador.jsp">Inicio</a></li>
    <li><a href="configuracion.jsp">configuración</a></li>
			<li><a href="registro.jsp">Usuario +</a></li>
			<li><a href="index.jsp">Cierre</a></li> 
    </ul>
    </nav>
	<!--end menu-->
    <!--end header-->
	</header>
   <!--start holder-->
   <div class="holder_content1">
          <% 
         Date acceso=new Date(sesion.getLastAccessedTime());
     out.println("Ultimo acceso: "+acceso+"<br>");

     //out.print("Id de sesion"+ sesion.getId());
     out.print("Creacion: "+sesion.getCreationTime());
     Date momento=new Date(sesion.getCreationTime());
     out.print("<BR>Creacion: "+momento);

         %>
   <section class="group4">
   <h1>General</h1>
   
   
   <div class="mas">
       <form name="registro" action="#"  method="get" accept-charset="utf-8">
				
				<label for="mostar"><b>Estado del sistema:</b></label>
				<input type="radio" name="on" value="1">online
				<input type="radio" name="of" value="2">offline <br>
					<label for="Nombre"><b>Nombre del sitio:</b></label>
						<input title="sitio" type="text" name="sitio" placeholder="Clinica Vascular Navarra">		<br>
						<label for="area"><b>Area por defecto:</b></label>
						<SELECT name="area" size="1">
                                                    
			 				 
   							<OPTION VALUE="coor">Coordinador Sistemas</OPTION>
   								<OPTION VALUE="aux">Auxiliar Sistemas</OPTION>
   								<option value="prog">Programador Sistemas</option>
  									
							</SELECT> <br>
						
						<label for="Nivel"><b>Nivel del incidente:</b></label>
							<SELECT NAME="Colores" SIZE="1">
                                                            
   							<OPTION VALUE="Alto">Alto</OPTION>
   								<OPTION VALUE="Medio">Medio</OPTION>
   								<option value="bajo">Bajo</option>
  									
							</SELECT>				<br>
                                                        <label for="Nivel"><b>Numero de intentos de conexion:</b></label>
							<SELECT NAME="Colores" SIZE="1">
			 				 
   							<OPTION VALUE="1">1</OPTION>
   								<OPTION VALUE="2">2</OPTION>
   								<option value="3">3</option>
  									<option value="4">4</option>
  									<option value="5">5</option>
							</SELECT>				
							
							estara bloqueado por  
							 <SELECT NAME="Colores" SIZE="1">
			 				 
   							<OPTION VALUE="1">1</OPTION>
   								<OPTION VALUE="2">2</OPTION>
   								<option value="3">3</option>
  									<option value="4">4</option>
  									<option value="5">5</option>
							</SELECT>		
				Minutos
				
                                <label><b>Tiempo de duración de sesión</b> </label>
				<input title="tiempo" type="text" name="tiempo"><b>Esto marcara el tiempo de permanencia de logeo de un usuario</b>
				 <a href="configuracion.html">
		<input class="boton" type="submit" value="Guardar"> 
				 </a>
				</form>
				</div>   
   </section>
   
    <section class="group4">
    <h1>Inicio</h1>
    <form action="configuracion.jsp" method="get" name="mensaje">
				<div class="mas">
				<label for="wellcome">mensaje de inicio</label>
				<textarea class="areaconfig" id="bienvenida" placeholder="Bienvenido a sitio de registro de incidentes"></textarea>
				<br>
				<label for="mostar">Mostrar mensaje de Bienvenida:</label>
				<input type="radio" name="myradio" value="1">Si
				<input type="radio" name="myradio" value="2">No
			<input class="boton" type="submit" value="Guardar"> 
         </form>
				</div>    
    
    </section>
    
     <section class="group4">
     <h1>Usuarios</h1>
     
     <div class="mas">
         <form method="post" action="UsuariosCtrl">
             <input type="submit" name="Consulta" value="ConsultarTodos" class="boton2">
         </form> 
         <br>
         <br>
         <!--codigo faltante 1-->
         
   	
				</div>   
     </section>


			<section class="group4">
     <h1>Ubicacion</h1>
     
     <div class="mas">
				hola mundo hola mundo hola mundo hola mundo hola mundo 				
				</div>   
     </section>

   </div>
   <!--end holder-->
  
   </div>
   <!--end container-->
   
     <!--start footer-->
   <footer>
   <div class="container">
   <section class="footer_left">
   <h3>Contact information:
   <span>Lorem ipsum dolor sit amet</span>
   <span>Lorem ipsum dolor sit amet</span>
   </h3>
   </section> 
   
   <section class="footer_left">
   <h3>Website:
   <span>Lorem ipsum dolor sit amet</span>
   <span>Lorem ipsum dolor sit amet</span>
   </h3>
   </section> 

   
   <aside class="footer_left">
   <h3>Lorem ipsum:
   <span>Lorem ipsum dolor sit amet</span>
   <span>Lorem ipsum dolor sit amet</span>
   </h3>
   </aside> 
   <img src="images/contact-us.png" width="240" height="230" alt="contact" class="picture_footer"/>

    
   <div id="FooterTwo"> Â© 2011</div>
   
   </div>
   </footer>
   
   </body>
</html>
