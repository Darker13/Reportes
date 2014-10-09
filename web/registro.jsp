<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 
<!-- <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>-->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>

	<script src="js/jquery.min.js"></script>
	<script src="js/slides.min.jquery.js"></script>
	<script>
	function validarPsw(){
			var psw1 = 	document.getElementById("psw1").value;	
			var psw2 = document.getElementById("psw2").value; 
			if (psw1 == psw2) {
				alert("Si esta igualito"); 
				
			}else {
				alert("Verifique la contraseña")	;	
				return false;
			}	
		}
	</script>


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
    
   <div class="holder_content1">
       <section class="group4">
       <h1>Bienvenidos</h1>
      <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/>
    </section>
   </div>
   <div class="holder_content1">
          
    <section class="group4">
       <h1>Nuevos Usuario</h1>
       <!--<img class="imagen" src="images/cvn.jpg" alt="" > -->
       	 <img src="images/users.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
   <form id="form1" action="UsuariosCtrl" method="post" >
       
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
            <div class="row">
                <div class="span3"> 
                     <label>Documento:</label>
                     <input type="text" name="documento"   placeholder="Documento" required pattern="[0-9]{1,20}">
                     <label>Nombre:</label>
                     <input type="text" name="nombres"   placeholder="Nombre" required pattern="[A-Za-z\s]{1,20}">
                     <label>Apellido:</label>
                     <input type="text" name="apellidos"  placeholder="Apellido" required pattern="[A-Za-z\s]{1,20}">
                </div>
                <div class="span3">
                    <label>Cargo</label>
                    <input type="text" name="cargo" placeholder="Cargo" required pattern="[A-Za-z\s]{1,20}">				
                    <label>Telefono</label>
		    <input type="text" name="telefono" id="telefono" name="Tel" required placeholder="Extencion" pattern="[0-9]{3,10}" title="Ej: 0123456789"/>	
                    <label>Usuario</label>
                    <input type="text" name="User" placeholder="Usuario" required pattern="[A-Za-z0-9]{4,10}">
                    
                    <label>Prioridad</label>
                    <select name="Prioridad">
                        <option value="1">Urgente</option>
                        <option value="2">Medio</option>
                    </select><br>
                    <br>
                    <br>
                    <input class="btn btn-success" type="submit" name="reg" value="registro" > 
                </div>
                <div class="span3">
                    <label for="password">Password</label> 
                    <input type="password" id="psw1" name="Pas" placeholder="password" required>
                    <label for="password">Password</label> 
                    <input type="password" name="contraseña" id="psw2" name="Pass" placeholder="Password" required onblur="validarPsw()">
                    <label for="email">Correo:</label>
                    <input type="email" pattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
                                                       name="correo"  placeholder="Usuario@cardiovascularnavarra.org"  required/>			
                    <label>Tipo de usuario</label>
                    <select name="Tipo">
                        <option value="1">Administrador</option>
                        <option value="2">Tecnico</option>
                        <option value="3">Usuario</option>
                   </select>   
                </div>
          </div>
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
