/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTO.UsuarioDto;
import Modelo.UsuarioDao;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Darker
 */
@WebServlet(name = "GestionUsuario", urlPatterns = {"/GestionUsuario"})
public class GestionUsuario extends HttpServlet {

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
        
       
        
        try {
            /* TODO output your page here. You may use following sample code. */
          
         
            
         UsuarioDto obj= new UsuarioDto();
         UsuarioDao obj1=new UsuarioDao();
         
         obj.setDocumento(Integer.parseInt(request.getParameter("Doc")));
         obj.setNombres(request.getParameter("Nom"));
         obj.setApellidos(request.getParameter("Ape"));
         obj.setCorreo(request.getParameter("Cor"));
         obj.setTelefono(Integer.parseInt(request.getParameter("Tel")));
         obj.setPas(request.getParameter("Pas"));
         obj.setCargo(request.getParameter("Car"));
         obj.setTipo(Integer.parseInt(request.getParameter("Tipo")));
         obj.setUsuario(request.getParameter("User"));
         
         String salida=obj1.inserta(obj);
         out.printf(salida);
          
         response.sendRedirect("registro.jsp?res="+salida);
            
            
            
        } 
        
        catch (SQLException ex) {
                        //out.print(rtdo);
                        response.sendRedirect("index.jsp?res="+ex.getMessage());
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


   
            
            
            
            
            
            
            
            
         