
<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]>
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
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
   <!--start holder-->
   <div class="holder_content1">
       <section class="group4">
       <h1>Bienvenidos</h1>
      <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/>
    </section>
   </div>
   <div class="holder_content1">
     <section class="group4">
       <h1>Nuevas partes</h1>
       <!--<img class="imagen" src="images/cvn.jpg" alt="" > -->
       	 <img src="images/users.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
   <form id="form1" action="ParteCtrl" method="post" >
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
           <div class="row">
                <div class="span3"> 
                     <label>Tipo</label>
                     <input type="text" name="tipo" placeholder="Tipo" required pattern="[A-Za-z0-9]{1,20}">
                     <label>Serial:</label>
                     <input type="text" name="serial"   placeholder="serial" required pattern="[A-Za-z0-9]{1,20}">
                     <label>Nombre de la parte:</label>
                     <input type="text" name="nombre"  placeholder="Nombre de la parte" required pattern="[A-Za-z\s]{1,20}">
                </div>
                <div class="span3">
                    <label>Hoja de vida Asociada:</label>
                    <input type="text" name="hv" placeholder="id de hoja de vida" required pattern="[0-9]{1,20}">				
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <input class="btn btn-success" type="submit" name="reg" value="registro" > 
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