/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Correo.Mail;
import DTO.IncidenteDto;
import DTO.SolucionDto;
import Modelo.IncidenteDao;
import Modelo.SolucionDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dante
 */
@WebServlet(name = "SolucionCtrl", urlPatterns = {"/SolucionCtrl"})
public class SolucionCtrl extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        SolucionDao soldao = new SolucionDao();
        SolucionDto soldto = new SolucionDto();
        IncidenteDao inciDao = new IncidenteDao();
        IncidenteDto incidto = new IncidenteDto();
        String salir = null;
        
        
        if (request.getParameter("registra")!=null && request.getParameter("registra").equals("registrar")){
            
            soldto.setIdIncidencia(Integer.parseInt(request.getParameter("idincidente")));
            soldto.setFechaSolucion(request.getParameter("fechafinal"));
            soldto.setRegSolucion(request.getParameter("solucion"));
            soldto.setComentarios(request.getParameter("comentario"));
            incidto.setIdusuario(Integer.parseInt(request.getParameter("idUsuario")));
            incidto.setIdAsignado(Integer.parseInt(request.getParameter("idAsignado")));
            incidto.setTituloIncidente(request.getParameter("titulo"));
            incidto.setDescripcion(request.getParameter("descripcion"));
              try {
                  
               
                int salida1=inciDao.sp_solucion(soldto);
                if (salida1 == 1){
                    salir = "Error al procesar la solucion";
                    response.sendRedirect("mostrarincidentes.jsp?msg="+salir);
                    
                }else if ( salida1 == 2 ){
                    salir = "Solucion creada y tiket cerrado";
                    
                     Mail cMail = new Mail(); 
                    String asignacionCorreo = inciDao.AsignacionCorreo(incidto);
                    String usuarioCorreo = inciDao.consultaCorreo(incidto);
                    String _admin = "erika21miranda@gmail.com";
                    String _asunto= "Solución de ticket";
                    String _msj= 
                                    "<p>&nbsp;</p>"
                                    +"<p>El ticket ha sido resuelto.</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Con los  siguientes datos:</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Titulo: "+incidto.getTituloIncidente()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Descripción: "+incidto.getDescripcion()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Solución: "+soldto.getRegSolucion()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Fecha de solución: "+soldto.getFechaSolucion()+"</p>"
                                    +"<p>&nbsp;</p>"
                                    +"<p>Cordialmente:</p>"
                                    +"<p>Area encargada.</p>";
                            
                            
                    String enviar = cMail.enviarCorreo(_msj, _asunto, usuarioCorreo, _admin, asignacionCorreo);
                    
                    
                    response.sendRedirect("mostrarincidentes.jsp?msg="+salir);
                }
                
                
            }catch (SQLException ex){
                response.sendRedirect("mostrarincidentes.jsp?msg="+ex.getMessage());
            }
            
            
            
        }
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SolucionCtrl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SolucionCtrl at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
