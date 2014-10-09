
<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
<%@page import="DTO.HojaDeVidaDTO" %>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!doctype html>  
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="screen" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Clinica Vascular Navarra - Home</title>
<link rel="icon" href="images/favicon.gif" type="image/x-icon"/>
 <!--[if lt IE 9]
 <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
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
    <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/></section>
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
            
            ArrayList<HojaDeVidaDTO> hvida= new ArrayList<HojaDeVidaDTO>();
            hvida= (ArrayList) request.getSession().getAttribute("hojas");
            %>
            
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
            <table id="simple-example-table" class="table table-hover table-condensed table-hover" >
                
                                        <tbody>
                                        <tr align="left">
                                            <th width="4%">Item</th>
                                        <th width="12%">Hoja No</th>
                                          <th width="12%">Serial No</th>
                                        <th width="13%">Nombre</th>
                                          <th width="12%">Ubicación</th>
                                         <th width="13%">Marca</th>
                                         <th width="12%">Usuario</th>
                                         <th width="13%">Perifericos</th>
                                         <th width="13%">Sistema Operativo</th>
                                        <%if( rol == 1 ) {%>
                                         <th>Eliminar</th>
                                         <% } if ( rol == 1  | rol == 2 ){ %>
                                         <th>Modificar</th>
                                         <% } %>
                                         </tr>
                                         <% for (HojaDeVidaDTO hsv: hvida){%>
                                         <tr>
                                             <td><%=c++%></td>
                                             <td><%out.print(hsv.getHojaVida());%></td>
                                             <td><%out.print(hsv.getSerialEq());%></td>
                                             <td><%out.print(hsv.getNombre());%></td>
                                             <td><%out.print(hsv.getUbicacion());%></td>
                                             <td><%out.print(hsv.getMarca());%></td>
                                             <td><%out.print(hsv.getIdUsuario());%></td>
                                             <td><%out.print(hsv.getPerifericos());%></td>
                                             <td><%out.print(hsv.getSistema());%></td>
                                             <%if(rol==1){%>
                                             <td><a href="HojaVidaCtrl?accion=eliminar&serial=<%out.print(hsv.getSerialEq()); %>"><boton class="btn btn-danger" title="Realmente desea eliminar a =<%out.print(hsv.getSerialEq());%>"><center>Eiminar</center></boton></a></td>
                                            <% } if ( rol == 1 |  rol == 2 ){ %>
                                             <td><a href="HojaVidaCtrl?accion=Modificar&serial=<%=hsv.getSerialEq()%>"> <boton class="btn btn-success"><center>Modificar</center></boton> </a></td>
                                             <% } %>
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
   <div class="containers">
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
   </body>
</html>