/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Correo.Mail;
import DTO.IncidenteDto;
import Modelo.IncidenteDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author darker
 */
@WebServlet(name = "IncidenteCtrlr", urlPatterns = {"/IncidenteCtrlr"})
public class IncidenteCtrlr extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        IncidenteDao incidao = new IncidenteDao();
        IncidenteDto incidto = new IncidenteDto();
        String salida=null;
        
    
        
         if (request.getParameter("registra")!=null && request.getParameter("registra").equals("registrar")){
            try {
                IncidenteDao inciDao = new IncidenteDao();
                
                // incidto.setIdincidente(Integer.parseInt(request.getParameter("idincidente")));
                incidto.setFecha_hora(request.getParameter("fecha"));
                incidto.setTituloIncidente(request.getParameter("titulo"));
                incidto.setDescripcion(request.getParameter("descripcion"));
                incidto.setIdusuario((Integer)request.getSession(false).getAttribute("id_documento"));
                incidto.setIdTipo_Daño(Integer.parseInt(request.getParameter("tipo")));
                
                int valorfinal = inciDao.insertarIncidentePrioridad(incidto);
                
                if(valorfinal==1){
                    salida="No se logró crear un ticket ya que usted no genero prioridad";
                    response.sendRedirect("incidente.jsp?msg="+salida);
                }
                else if(valorfinal==2){
                    salida="Ticket creado";
                    Mail cMail = new Mail(); 
                    String usuarioCorreo = incidao.consultaCorreo(incidto);
                    String _admin = "erika21miranda@gmail.com";
                    String _asunto= "Creación de ticket";
                    String _msj= 
                                    "<p>&nbsp;</p>"
                                    +"<p>Felicidades, el ticket fue creado exitosamente y fue informado al administrador.</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Con los  siguientes datos:</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Titulo: "+incidto.getTituloIncidente()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Descripción: "+incidto.getDescripcion()+"</p>"
                                      +"<p>&nbsp;</p>"
                                    +"<p>Fecha: "+incidto.getFecha_hora()+"</p>"
                                     +"<p>&nbsp;</p>"
                                    +"<p>Cordialmente:</p>"
                                    +"<p>Area encargada.</p>";
                            
                            
                    String enviar = cMail.enviarCorreo(_msj, _asunto, usuarioCorreo, _admin, usuarioCorreo);
                    response.sendRedirect("incidente.jsp?msg="+salida); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            }
              
        
        
        
         }
         
         else if (request.getParameter("muestra") != null && request.getParameter("muestra").equals("Mostrar")){
            try {
                ArrayList<IncidenteDto> inc=incidao.listaTodo();
                request.getSession(false).setAttribute("inciden", inc);
                response.sendRedirect("mostrarincidentes.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if ( "eliminar".equals(request.getParameter("accion"))){
     
            
                   try {
                   IncidenteDao elim = new IncidenteDao();
            
            request.getSession(false).setAttribute("elimi", ""+elim.EliminarIncidenteDto(request.getParameter("serial")));
            
                ArrayList<IncidenteDto> inc=incidao.listaTodo();
                request.getSession(false).setAttribute("inciden", inc);
                    
                response.sendRedirect("mostrarincidentes.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }
        
        else if ( "Modificar".equals(request.getParameter("accion"))){
     
            
                   try {
                 
             incidto=incidao.MostrarUno(Integer.parseInt(request.getParameter("serial")));
              request.getSession(false).setAttribute("uno", incidto);
              response.sendRedirect("incidente_mostraruno.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }  
        
        
        else if ( "Solucion".equals(request.getParameter("accion"))){
     
            
                   try {
                 
             incidto=incidao.MostrarUno(Integer.parseInt(request.getParameter("serial")));
              request.getSession(false).setAttribute("uno", incidto);
              response.sendRedirect("incidente_solucion.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        } 
        
        
        
        else if ( "Mostrar".equals(request.getParameter("accion"))){
     
            
                   try {
                       //Inicializo variables para pasar los parametros desde la session para llistar segun cada usuario se pasan el id del usuario y el tipo de usuario 
                       
                     int user = Integer.parseInt( request.getParameter("Usuario"));
                     int iduser=Integer.parseInt(request.getParameter("idusuario"));
              
                     
                    ArrayList<IncidenteDto> inc=incidao.listarUser(user, iduser);
                    request.getSession(false).setAttribute("inciden", inc);
                    response.sendRedirect("mostrarincidentes.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }
        
    
        
         
         else if (request.getParameter("btncam")!=null && request.getParameter("btncam").equals("Cambiar")){
            
            incidto.setTituloIncidente(request.getParameter("titulo"));
            incidto.setDescripcion(request.getParameter("descripcion"));
            incidto.setIdusuario(Integer.parseInt(request.getParameter("documento")));
            incidto.setIdnivel(Integer.parseInt(request.getParameter("Nivel")));
            incidto.setIdEstado(Integer.parseInt(request.getParameter("estado")));
            incidto.setIdAsignado(Integer.parseInt(request.getParameter("asignado")));
            incidto.setIdTipo_Daño(Integer.parseInt(request.getParameter("tipo")));
            incidto.setIdincidente(Integer.parseInt(request.getParameter("idincidente")));
            
            
            try {
                 String asignacionCorreo = incidao.AsignacionCorreo(incidto);
                String salida1=incidao.ModificarIncidenteDto(incidto);
               
                 Mail cMail = new Mail(); 
                    String usuarioCorreo = incidao.consultaCorreo(incidto);
                    String _admin = "erika21miranda@gmail.com";
                    String _asunto= "Asignación de ticket";
                    String _msj= 
                                    "<p>&nbsp;</p>"
                                    +"<p>El ticket ha sido asignado.</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Con los  siguientes datos:</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Titulo: "+incidto.getTituloIncidente()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Descripción: "+incidto.getDescripcion()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Cordialmente:</p>"
                                    +"<p>Area encargada.</p>";
                            
                            
                    String enviar = cMail.enviarCorreo(_msj, _asunto, usuarioCorreo, _admin, asignacionCorreo);
                
                ArrayList<IncidenteDto> inci=incidao.listaTodo();
                request.getSession(false).setAttribute("inciden", inci);
                response.sendRedirect("mostrarincidentes.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("mostrarincidentes.jsp?msg="+ex.getMessage());
            }
        
        }
         
        else if (request.getParameter("Consult") != null && request.getParameter("Consult").equals("Pendientes")){
            try {
                ArrayList<IncidenteDto> pendi=incidao.pendientes();
                request.getSession(false).setAttribute("pendiente", pendi);
                response.sendRedirect("pendientes.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    
         
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IncidenteCtrlr</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IncidenteCtrlr at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
