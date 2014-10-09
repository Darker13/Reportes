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

<!doctype html>  
<head>
<meta charset="UTF-8">
<title>OnlineSolutions - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]>
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->

<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/stylescopia.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	<script>
		$(function(){
			$('#slides').slides({
				preload: true,
				preloadImage: 'images/loading.gif',
				play: 5000,
				pause: 2500,
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
    <a href="#" id="logo"><img src="images/logo.png" width="221" height="130" alt="logo"/></a>    

	<!--end logo-->
	
   <!--start menu-->

	<nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                 <li><a href="#">Portfolio</a></li>
                <li><a href="#">News</a></li>
                <li><a href="#">Contact</a></li>

            </ul>
    </nav>
	<!--end menu-->
	

    <!--end header-->
	</header>


   <!--start intro-->

   <section id="intro">
   <div id="slides">
   <div class="slides_container">
   <img src="images/banner1.png" width="960" height="300" alt="baner">
   <img src="images/banner1.png" width="960" height="300" alt="baner">
   <img src="images/banner1.png" width="960" height="300" alt="baner">

   </div>
   </div>
 
   </section>
   <!--end intro-->
   
   
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

  
   
   <!-- <section class="group4">
   
   </section> -->

   </div>
   <!--end holder-->

   
   <!--start holder-->

   <div class="holder_content">

   <section class="group1">
   <h1> Clinica Vascular navarra</h1>
   <img src="images/icon4.png" width="51" height="52" alt="icons" class="icons"/>
   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec molestie. Sed aliquam sem ut arcu. Phasellus sollicitudin. 
   Vestibulum condimentum  facilisis nulla. In hac habitasse platea dictumst. Nulla nonummy. Cras quis libero.</p>
   
   </section>

   <center>
   <section class="group2">
   <h1>Cambio de contraaseña</h1>	
   <img src="images/icon2.png" width="51" height="52" alt="icons" class="icons"/>
   <br>
   <br>
   <br>
   <br>
   
   <li>
					<label for="password">Contraseña antigua</label> 
					<br>
					<input type="password" name="password" placeholder="password" required></li>
					<br>
					<label for="password">Nueva Contraseña </label>
                                        <br>
					<input type="password" name="password" placeholder="password" required>
                                        <br>
                                        </li>
   <a href=""><span class="button">Cambiar</span></a>
   
   </section>
   </center>
  
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

    
   <div id="FooterTwo"> Â© 2011 Online solutions </div>
   <div id="FooterTree"> Valid html5 / design and code by <a href="http://www.marijazaric.com">marija zaric - creative simplicity</a> </div> 
   </div>
   </footer>
   <!--end footer-->
 <!-- Free template distributed by http://freehtml5templates.com -->  
   </body></html>
