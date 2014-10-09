<%@ page session="true" %>
<%
    String idUsuario="";
    int rol=0, iduser=0;
    String rolId="";
    String nombreUsuario="";
    HttpSession sesionOk = request.getSession();
    if (sesionOk.getAttribute("idUsuario")== null){
        response.sendRedirect("../HelpDesk/index.jsp?msg= Es necesario identificarse");
    }else{
        idUsuario=""+session.getAttribute("idUsuario");
        rolId=""+session.getAttribute("idTipo");
        rol=Integer.parseInt(rolId); 
        sesionOk.setAttribute("iduser", iduser);
        
    }
    %>

<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!-- scripts -->
 <script src='http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js' type='text/javascript'/></script>
 <!--<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>-->
 
<!-- estilos -->
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
<!-- Inicio Mensaje de boton  -->
<script>
function msg()
{
alert("Registro realizado con exito");
}
</script>
<!-- fin de mensaje boton -->
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
		
		<script type="text/javascript" >
			$(document).ready(function(){
						$(".group4 h1").click(function(){
							$(this).parent().find(".mas").animate({ opacity:'toggle' , height:'toggle'},500);
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
   <label for="filtro">Filtar:</label>
   <input type="search" name="filtro"> <input type="submit" name="busqueda>">  <img src="images/refresh.png" alt="Refrescar"> <br> <br>
   
 
   <section class="group4">
   <h1>Registro 1</h1>
   <img class="lol" src="images/bin.png" alt="" > 
   <img class="lol"  src="images/locked.png" alt="" >
   <img class="lol"  src="images/print.png" alt="" >
   
   <div class="mas">
			 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent quis 
			 eros sed dolor aliquam adipiscing. Sed pharetra, dui at vulputate pretium, 
			 massa nisl consectetur neque, et condimentum nunc est eu felis. Mauris posuere vestibulum erat, 
			 non euismod nisi facilisis ac. Aenean ipsum elit, congue eu sollicitudin ut, mollis nec lectus. 
			 Sed vel enim sed justo aliquam facilisis non id turpis. Nulla vehicula eros eget volutpat eleifend.
			 Ut tortor ante, varius nec lectus auctor, ultrices pulvinar risus. Sed sed mauris odio. Donec et purus hendrerit, 
			 tempor lectus porta, tincidunt lorem. Nullam ullamcorper, urna eleifend dictum fermentum, mi magna ullamcorper mi, 
			 vel lobortis nulla lectus quis eros.

				</div>   
   </section>
   
    <section class="group4">
    <h1>Registro 2</h1>
    <img class="lol" src="images/bin.png" alt="" > 
   <img class="lol"  src="images/locked.png" alt="" >
   <img class="lol"  src="images/print.png" alt="" >
   
				<div class="mas">
				 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent quis 
			 eros sed dolor aliquam adipiscing. Sed pharetra, dui at vulputate pretium, 
			 massa nisl consectetur neque, et condimentum nunc est eu felis. Mauris posuere vestibulum erat, 
			 non euismod nisi facilisis ac. Aenean ipsum elit, congue eu sollicitudin ut, mollis nec lectus. 
			 Sed vel enim sed justo aliquam facilisis non id turpis. Nulla vehicula eros eget volutpat eleifend.
			 Ut tortor ante, varius nec lectus auctor, ultrices pulvinar risus. Sed sed mauris odio. Donec et purus hendrerit, 
			 tempor lectus porta, tincidunt lorem. Nullam ullamcorper, urna eleifend dictum fermentum, mi magna ullamcorper mi, 
			 vel lobortis nulla lectus quis eros.
				</div>    
    
    </section>
    
     <section class="group4">
     <h1>Registro 3</h1>
     <img class="lol" src="images/bin.png" alt="" > 
   <img class="lol"  src="images/locked.png" alt="" >
   <img class="lol"  src="images/print.png" alt="" >
   
     <div class="mas">
				 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent quis 
			 eros sed dolor aliquam adipiscing. Sed pharetra, dui at vulputate pretium, 
			 massa nisl consectetur neque, et condimentum nunc est eu felis. Mauris posuere vestibulum erat, 
			 non euismod nisi facilisis ac. Aenean ipsum elit, congue eu sollicitudin ut, mollis nec lectus. 
			 Sed vel enim sed justo aliquam facilisis non id turpis. Nulla vehicula eros eget volutpat eleifend.
			 Ut tortor ante, varius nec lectus auctor, ultrices pulvinar risus. Sed sed mauris odio. Donec et purus hendrerit, 
			 tempor lectus porta, tincidunt lorem. Nullam ullamcorper, urna eleifend dictum fermentum, mi magna ullamcorper mi, 
			 vel lobortis nulla lectus quis eros.
				</div>   
     </section>
						<section class="group4">
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

    
   <div id="FooterTwo"> © 2013 PYTHON </div>
   <div id="FooterTree"> Valid html5 / design and code by <a href="#">marija zaric - creative simplicity</a> </div> 
   </div>
   </footer>
   
   </body></html>
