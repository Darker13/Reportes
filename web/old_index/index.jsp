<%@page session="true" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>

<!-- css -->
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/stylescopia.css"/>
<link rel="stylesheet" href="css/estilo.css">

<!-- scripts -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	
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
		<form name="regist" action="UsuariosCtrl" method="post" accept-charset="utf-8">
		&nbsp; &nbsp; &nbsp; 
		<label>Usuario:</label> 
		&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
		&nbsp; &nbsp; 	&nbsp; &nbsp; 
		<label>Contraseña:</label> <br>
			&nbsp; &nbsp; 
			<input type="text" name="user" title="Por favor ingrese el usuario " placeholder="Usuario" required pattern="[A-Za-z0-9]{4,10}">
				<input type="password" name="password" placeholder="Contraseña" required>
                                <input class="boton" type="submit" value="Login" name="ingreso"> 
                                <%
            
            if(request.getParameter("msg")!=null){
           %>
           <div style="color: red">
               <%   
                out.print(request.getParameter("msg"));
               %>
           </div>
                <% 
           }
            
            %>
				</form>
                    
		</nav>

	</header>
  
  
  <!--start intro-->

   <section id="intro">
   <div id="slides">
   <div class="slides_container">
   <img src="images/banner1.jpg" width="960" height="300" alt="baner">
   <img src="images/banner1.jpg" width="960" height="300" alt="baner">
   <img src="images/banner1.jpg" width="960" height="300" alt="baner">

   </div>
   </div>
 
   </section>
   <!--end intro-->
   
   <div class="holder_content1">
					
   
 				 <div class="holder_content1">
					<section class="group4">		
					<h1>Nuestra Misión</h1>

					<p>Somos una empresa prestadora de servicios de salud, encamina a mejorar las condiciones de vida de nuestros 
                                            usuarios en patologías médicas y quirúrgicas con énfasis en las enfermedades vasculares y cardiacas. 
                                            Con la competencia de nuestro talento humano, vocación educativa y liderazgo tecnológico logramos 
                                            posicionamiento en el sector salud, rentabilidad y solidez financiera que garantiza nuestra permanencia y 
                                            crecimiento continuo.</p>
					
					
   			</section>	
   		
					<section class="group4">		
					<h1>Nuestra Visión</h1>

					<p> En el año 2015 seremos reconocidos en el ámbito nacional e internacional como una de las mejores clínicas 
                                            especializadas en el manejo integral de enfermedades cardiovasculares y vasculares periféricas, 
                                            fortaleciendo los demás servicios incluidos en nuestro portafolio y distinguiéndonos por la excelencia en la
                                            prestación del servicio y la satisfacción de nuestros clientes.</p>
					<br>
					<br>
					
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
   
   </body></html>
