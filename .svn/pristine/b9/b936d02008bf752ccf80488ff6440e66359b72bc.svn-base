<%@ page session="true" %>
<%
    String idUsuario="";
    int rol=0, iduser=0, identificacion=0, prioridad=0;
    String rolId="";
    String nombreUsuario="";
    String iden="";
    String priority="";
    HttpSession sesionOk = request.getSession();
    if (sesionOk.getAttribute("idUsuario")== null){
        response.sendRedirect("../HelpDesk/index.jsp?msg= Es necesario identificarse");
    }else{
        idUsuario=""+session.getAttribute("idUsuario");
        rolId=""+session.getAttribute("idTipo");
        rol=Integer.parseInt(rolId); 
        iden=""+session.getAttribute("id_documento");
        identificacion=Integer.parseInt(iden);
        priority=""+session.getAttribute("idprioridad");
        prioridad=Integer.parseInt(priority);
        sesionOk.setAttribute("iduser", iduser);
    }
    %>
<!doctype html>  
<head>
<meta charset="UTF-8">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="images/favicon.gif" type="image/x-icon"/> 
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<link rel="stylesheet" type="text/css" href="css/estilo.css"/>


		
		<script type="text/javascript" >
			$(document).ready(function(){
						$(".holder_content1 h1").click(function(){
							$(this).parent().find(".mas").animate({ opacity:'toggle' , height:'toggle'},500);
						});
			});
			
		</script>
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
       
     <%
            
            if(request.getParameter("msg")!=null){
           %>
           <div class="alert alert-success">
               <%   
                out.print(request.getParameter("msg"));
               %>
           </div>
                <% 
           }else {
                %>
                <div class="alert alert-danger">
            <%   
                out.print(request.getParameter("msg"));
               %>
                </div>
                <% } %>
   <h1>Bienvenidos</h1>
      <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/>
      
    </section>
   </div>
   </section>
   <!--end intro-->
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
   <form name="inciente" action="IncidenteCtrlr" method="post" accept-charset="utf-8">
       
       <div class="row">
           <div class="span3">
               
                <label>Fecha</label>
                <input type="date" name="fecha" >
		<label for="Titutlo">Titulo</label>
                <input type="text" name="titulo" placeholder="Titulo de incidente" pattern="[A-ZÑa-zñ\s]{1,20}" required> 
            </div>
           <div class="span3">
               <label for="tipo"><b>Tipo de daño</b></label>
		<select name="tipo"  required>
                     <OPTION VALUE="1">Otros</OPTION>
                     <OPTION VALUE="2">Hardware </OPTION>
                     <OPTION VALUE="3">Software </OPTION>
   		</select>  
               
		
          </div>
           <div class="span3">
               
               <label for="descripcion ">Descripcion</label> 
               <textarea name="descripcion" required=""></textarea>
		<input class="btn btn-success" type="submit" name="registra" value="registrar" > 
           </div>
       </div>
		</form>
  	</center>
  
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
