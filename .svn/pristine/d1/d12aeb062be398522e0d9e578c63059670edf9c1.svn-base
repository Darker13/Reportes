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