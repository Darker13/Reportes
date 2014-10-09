<%-- 
    Document   : verificarConexion
    Created on : 09-10-2013, 08:00:39 PM
    Author     : SENA
--%>

<%@page import="Modelo.Conectar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= Conectar.getInstace() %></h1>
    </body>
</html>
