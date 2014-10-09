<%@page import="DTO.PartesDto" %>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@include file="Sesion.jsp" %>

<!doctype html>  
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]-->
 <!--<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>-->
  <!--[endif]-->

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
       <h1>Hoja de Vida</h1>
       <img class="imagen" src="images/Sin titulo-1 copia.jpg" alt="" > 
       	 <img src="images/monitor.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
   <br>
   <% int c=1;
            
            ArrayList<PartesDto> user= new ArrayList<PartesDto>();
            user= (ArrayList) request.getSession().getAttribute("part");
            %>
            
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
            <table id="simple-example-table" class="table table-hover table-condensed table-hover" >
                                        <tbody>
                                        <tr align="left">
                                            <th>ID Parte</th>
                                        <th>Nombre parte</th>
                                          <th>Serial</th>
                                        <th>Tipo parte</th>
                                          <th width="12%">Hoja de vida</th> 
                                          <% if(rol==1){  %>
                                         <th>Eliminar</th>
                                         <% } %>
                                         <% if(rol==1||rol==2){  %>
                                         <th>Modificar</th>
                                         <% } %>
                                         </tr>
                                         <% for (PartesDto usuario: user){%>
                                         <tr>
                                             
                                             <td><%out.print(usuario.getIdparte());%></td>
                                             <td><%out.print(usuario.getNomparte());%></td>
                                             <td><%out.print(usuario.getSerial());%></td>
                                             <td><%out.print(usuario.getTipo());%></td>
                                             <td><%out.print(usuario.getHojadevida());%></td>
                                             <% if(rol == 1){ %>
                                             <td><a href="ParteCtrl?accion=eliminar&serial=<%out.print(usuario.getIdparte()); %>"><boton class="btn btn-success" title="Realmente desea eliminar a =<%out.print(usuario.getIdparte());%>"><center>Eiminar</center></boton></a></td>
                                             <% } %>
                                             <% if (rol==1||rol==2){  %>
                                             <td><a href="ParteCtrl?accion=Modificar&serial=<%= usuario.getIdparte() %>"> <boton class="btn btn-success"><center>Modificar</center></boton> </a></td>
                                             <%  } %>
                                         </tr>
                                         <%}%>
                                        </tbody>
				        
                                       
			          </tr>
    </table>
                                        <br>
                                        <br>
  <!-- <input class="boton2" name="cons" type="submit" value="consultarHV" >-->
   </article> 
   
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
   <span>Luis Gordo</span>
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