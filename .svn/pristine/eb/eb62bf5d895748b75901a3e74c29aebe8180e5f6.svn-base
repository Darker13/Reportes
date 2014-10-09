<%@page import="DTO.IncidenteDto"%>
<%@ page session="true" %>
<%@include file="Sesion.jsp" %>
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
      <img src="images/icon3.png" width="51" height="52" alt="icons" class="icons"/>
      
    </section>
   </div>
   <div class="holder_content1">

     <section class="group4">
         <fieldset>
         <legend>Incidentes</legend>
       <img class="imagen" src="images/Sin titulo-1 copia.jpg" alt="" > 
       	 <img src="images/monitor.png" width="51" height="52" alt="icons" class="icons"/>
  	<article>
	  <br>
   <br>
   <br>
   <br>
  
   <br>
            <%    
            ArrayList<IncidenteDto> inc= new ArrayList<IncidenteDto>();
            inc= (ArrayList) request.getSession().getAttribute("inciden");
            %>
            <center>
            <%@include file="Mensaje.jsp" %>
            </center>
            <table id="simple-example-table" class="table table-hover table-condensed table-hover" >
                                        <tbody>
                                        <tr  align="center">
                                            <th width="12%">Id Incidente</th>
                                            <th width="12%">Id usuario</th>
                                        <th width="12%">Fecha de inicio </th>
                                          <th width="12%">Titulo</th>
                                        <th width="12%">Tipo de daño</th>
                                          <th width="12%">asiganado a:</th>
                                         <th width="12%">Nivel</th>
                                         <th width="12%">Descripcion</th>
                                         <th>Solucion</th>
                                         <th>Descripcion</th>
                                         <th>Fecha solucion</th>
                                         
                                         <th></th>
                                         </tr>
                                         <% for (IncidenteDto incidentes:inc){%>
                                         <tr>
                                             <td><%out.print(incidentes.getIdincidente()); %></td>
                                             <td><%out.print(incidentes.getIdusuario());  %></td>
                                             <td><%out.print(incidentes.getFecha_hora()); %></td>
                                             <td><%out.print(incidentes.getTituloIncidente()); %></td>
                                             <td><%out.print(incidentes.getIdTipo_Daño()); %></td>
                                             <td><%out.print(incidentes.getIdAsignado()); %></td>
                                             <td><%out.print(incidentes.getIdnivel()); %></td>
                                             <td><%out.print(incidentes.getDescripcion()); %></td>
                                             <td><%out.print(incidentes.getFechaSolucion()); %></td>
                                             <td><%out.print(incidentes.getRegSolucion()); %></td>
                                             <td><%out.print(incidentes.getComentarios()); %></td>
                                             
                                         </tr>
                                         <% } %>
                                        </tbody>
				        
                                       
			          </tr>
    </table>
    </fieldset>
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
   <span>?????????</span>
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