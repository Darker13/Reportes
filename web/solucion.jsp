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
 
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>

<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>

<script type="text/javascript" >
			$(document).ready(function(){
						$(".group4 h1").click(function(){
							$(this).parent().find(".mas").animate({ opacity:'toggle' , height:'toggle'},500);
						});
			});
			
		</script>
	
	

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
   <h1>Registro de incidente</h1>
   <img src="images/tools.png" width="51" height="52" alt="icons" class="icons"/>

   <article>
		<center>   
   <br>
   <br>
   <br>
   <br>
   <form name="insiente" action="index-administrador.html" method="get" accept-charset="utf-8">
			<ul>
			<li>	
				<label for="descripción"><b>Solución<b></label> <br>
			 	<textarea class="textarea"></textarea>
								
					</li>
				<li>
						<label for="descripciÃ³n "><b>Comentario<b></label> <br>
			 	<textarea class="textarea"></textarea>			
				</li>		
				<br>
				<br>
				<br>
				<br>			
					<li>
				<center>
					 <input class="boton1" type="submit" value="Registro" > 
				</center>			 
			 	</li>
					<li>
					<center>
					<h1> Agregar Parte	</h1>
					
					<div class="mas">
					
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<label for="Perifericos">Perifericos</label> 
					<br>
						&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
					<input type="text" 	name="Perifericos" placeholder="Perifericos" >
				  
				</center>
						
						</div>	   
				</li>
				
				
			</ul>
										
		</form>
  
   </section>

   </div>
   <!--end holder-->
  
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

    
   <div id="FooterTwo"> Â© 2013 PYTHON </div>
   <div id="FooterTree"> Funciona bajo el Navegador Mozilla Firefox </div> 
   </div>
   </footer>
   
   </body></html>
