/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTO.HojaDeVidaDTO;
import Modelo.HojaDeVidaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Erika
 */
public class HojaVidaCtrl extends HttpServlet {

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
            throws ServletException, IOException, ArrayIndexOutOfBoundsException, ArrayStoreException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HojaDeVidaDTO hvdto= new HojaDeVidaDTO();
        HojaDeVidaDAO hvdao= new HojaDeVidaDAO();
        
        
        if (request.getParameter("btn1")!=null && request.getParameter("btn1").equals("Registro")){
            hvdto.setNombre(request.getParameter("nombre"));
            hvdto.setSerialEq(request.getParameter("Serial"));
            hvdto.setUbicacion(request.getParameter("Ubicación"));
            hvdto.setMarca(request.getParameter("Marca"));
            hvdto.setPerifericos(request.getParameter("Perisfericos"));
            hvdto.setIdUsuario(Integer.parseInt(request.getParameter("IdUsuario")));
            hvdto.setSistemaOperativo(Integer.parseInt(request.getParameter("Tipo")));
            
            try {
                String salida1=hvdao.inserta(hvdto);
                response.sendRedirect("hv.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("hv.jsp?msg="+ex.getMessage());
            }
            
        }else if("Ver-Todas".equals(request.getParameter("vertodo")) ){
            try {
                ArrayList<HojaDeVidaDTO> hv=hvdao.listaTodo();
                request.getSession(false).setAttribute("hojas", hv);
                response.sendRedirect("mostrarhv.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(HojaVidaCtrl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if ( "eliminar".equals(request.getParameter("accion"))){
     
            
                   try {
                   HojaDeVidaDAO elim = new HojaDeVidaDAO();
            
            request.getSession().setAttribute("elimi", ""+elim.EliminarHojavidaDTO(request.getParameter("serial")));
            
                ArrayList<HojaDeVidaDTO> hv=hvdao.listaTodo();
                request.getSession(false).setAttribute("hojas", hv);
                    
                response.sendRedirect("mostrarhv.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(HojaVidaCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }
         else if ( "Modificar".equals(request.getParameter("accion"))){
     
            
                   try {
                   
                   
             hvdto=hvdao.MostrarUno(request.getParameter("serial"));
            
                request.getSession(false).setAttribute("uno", hvdto);
                    
                response.sendRedirect("hv_mostuno.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(HojaVidaCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }
        
        else if (request.getParameter("btncam")!=null && request.getParameter("btncam").equals("Cambiar")){
                //hvdto.setIdHOJA_VIDA(Integer.parseInt(request.getParameter("id")));
            hvdto.setNombre(request.getParameter("nombre"));
            hvdto.setSerialEq(request.getParameter("Serial"));
            hvdto.setUbicacion(request.getParameter("Ubicación"));
            hvdto.setMarca(request.getParameter("Marca"));
            hvdto.setPerifericos(request.getParameter("Perifericos"));
            hvdto.setIdUsuario(Integer.parseInt(request.getParameter("IdUsuario")));
            hvdto.setSistemaOperativo(Integer.parseInt(request.getParameter("Tipo")));
            hvdto.setIdHOJA_VIDA(Integer.parseInt(request.getParameter("id")));
            
            try {
                
                String salida1=hvdao.ModificarHojavidaDTO(hvdto);
                ArrayList<HojaDeVidaDTO> hv=hvdao.listaTodo();
                request.getSession(false).setAttribute("hojas", hv);
                response.sendRedirect("mostrarhv.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("mostrarhv.jsp?msg="+ex.getMessage());
            }
        
        }
        
        
        
        
          else if ( "Mostrar".equals(request.getParameter("accion"))){
     
            
                   try {
                     
                       
                     int user = Integer.parseInt( request.getParameter("Usuario"));
                     int iduser=Integer.parseInt(request.getParameter("idusuario"));
              
                     
                    ArrayList<HojaDeVidaDAO> hdv=hvdao.listarHv(user, iduser);
                    request.getSession(false).setAttribute("hojas", hdv);
                    response.sendRedirect("mostrarhv.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteCtrlr.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }
        
        
        
        
        
        
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HojaVidaCtrl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HojaVidaCtrl at " + request.getContextPath() + "</h1>");
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
