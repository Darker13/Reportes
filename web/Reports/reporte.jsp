<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.Context"%>
<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<%@page import="net.sf.jasperrepors.engine.*"%>
 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            Context context;
            Connection cnn;
            PreparedStatement pstm;
            ResultSet rs=null;
    
            
            try{
                 
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            cnn = ds.getConnection();
               
            

                File reportFile = new File(application.getRealPath("//Reports//clinicanavarra.jasper"));

                byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, cnn);

                response.setContentType("application/pdf");
                response.setContentLength(bytes.length);
                ServletOutputStream outStream = response.getOutputStream();
                outStream.write(bytes, 0, bytes.length);
                outStream.flush();
                outStream.close();
            } catch (Exception ex) {

                out.println("Error:" + ex.getMessage());

            }



        %>
    </body>
</html>
