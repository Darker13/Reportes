/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTO.PartesDto;
import Modelo.PartesDao;
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
@WebServlet(name = "ParteCtrl", urlPatterns = {"/ParteCtrl"})
public class ParteCtrl extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
        PartesDao partdao = new PartesDao();
        PartesDto partdto = new PartesDto();
    
        
        if (request.getParameter("reg")!=null && request.getParameter("reg").equals("registro")){
            
              
              partdto.setTipo(request.getParameter("tipo"));
              partdto.setSerial(request.getParameter("serial"));
              partdto.setNomparte(request.getParameter("nombre"));
              partdto.setHojadevida(Integer.parseInt(request.getParameter("hv")));
              try {
                String salida1=partdao.insertaIncidente(partdto);
                response.sendRedirect("registro-partes.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("registro-partes.jsp?msg="+ex.getMessage());
            }
            
            
            
        }else if (request.getParameter("Consult") != null && request.getParameter("Consult").equals("Consultar")){
            try {
                ArrayList<PartesDto> user=partdao.listaTodo();
                request.getSession().setAttribute("part", user);
                response.sendRedirect("mostrarpartes.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(ParteCtrl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ( "eliminar".equals(request.getParameter("accion"))){
     
            
                   try {
                   PartesDao elim = new PartesDao();
            
            request.getSession().setAttribute("elimi", ""+elim.EliminarPartesDto(request.getParameter("serial")));
            
                 ArrayList<PartesDto> user=partdao.listaTodo();
                request.getSession().setAttribute("part", user);
                response.sendRedirect("mostrarpartes.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(ParteCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        } else if ( "Modificar".equals(request.getParameter("accion"))){
     
            
                   try {
                   
                   
             partdto=partdao.MostrarUno(request.getParameter("serial"));
            
                request.getSession().setAttribute("uno", partdto);
                
                    
                response.sendRedirect("parte_mostraruno.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(UsuariosCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }else if (request.getParameter("btncam")!=null && request.getParameter("btncam").equals("Cambiar")){
           
           // userdto.setDocumento(Integer.parseInt(request.getParameter("documento")));
            partdto.setNomparte(request.getParameter("nombres"));
            partdto.setSerial(request.getParameter("apellidos"));
            partdto.setTipo(request.getParameter("cargo"));
            partdto.setHojadevida(Integer.parseInt(request.getParameter("telefono")));
            partdto.setIdparte(Integer.parseInt(request.getParameter("documento")));
            
            try {
                
                String salida1=partdao.ModificarPartesDto(partdto);
                ArrayList<PartesDto> user=partdao.listaTodo();
                request.getSession().setAttribute("usua", user);
                response.sendRedirect("mostrarpartes.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("mostrarpartes.jsp?msg="+ex.getMessage());
            }
        
        }
     
        else{
            response.sendRedirect("index-administrador.jsp?msg= no se encontró acción");
        }
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParteCtrl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ParteCtrl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
