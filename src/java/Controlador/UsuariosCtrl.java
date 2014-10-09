/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTO.TipoUsuarioDto;
import DTO.UsuarioDto;
import Modelo.UsuarioDao;
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
 * @author darker
 */
public class UsuariosCtrl extends HttpServlet {

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
        UsuarioDao userdao = new UsuarioDao();
        UsuarioDto userdto = new UsuarioDto();
        
        
        
         if (request.getParameter("ingreso") !=null && request.getParameter("ingreso").equals("Login")){
            String user= request.getParameter("user");
            String clave= request.getParameter("password");
            String salida="";
             TipoUsuarioDto  TipoU = null;
            
            try {
                    TipoU = userdao.validarUsuario(user, clave);
                    salida=(String)TipoU.getMensaje();
                     if(salida.equalsIgnoreCase("QueryOk")){
                        session.setAttribute("idUsuario", TipoU.getUsuario());
                        session.setAttribute("clave", TipoU.getPas());
                        session.setAttribute("idTipo", TipoU.getIdTipo());
                        session.setAttribute("nombreTipo", TipoU.getTipoUser());
                        session.setAttribute("id_documento", TipoU.getDocumento());
                        session.setAttribute("idprioridad", TipoU.getPrioridad());
                        
                            response.sendRedirect("panel.jsp");
                        
                     }
                 else{
                 response.sendRedirect("index.jsp?msg="+salida);
                     }                       
                    
            } catch (SQLException ex) {
                        //out.print(rtdo);
                        response.sendRedirect("index.jsp?msg="+"Error:"+ex.getMessage());
                    }
               
                        
                    
        
        }else if (request.getParameter("reg")!=null && request.getParameter("reg").equals("registro")){
            
            userdto.setDocumento(Integer.parseInt(request.getParameter("documento")));
            userdto.setNombres(request.getParameter("nombres"));
            userdto.setApellidos(request.getParameter("apellidos"));
            userdto.setCargo(request.getParameter("cargo"));
            userdto.setTelefono(Integer.parseInt(request.getParameter("telefono")));
            userdto.setUsuario(request.getParameter("User"));
            userdto.setPas(request.getParameter("contraseña"));
            userdto.setCorreo(request.getParameter("correo"));
            userdto.setTipo(Integer.parseInt(request.getParameter("Tipo")));
            userdto.setPrioridad(Integer.parseInt(request.getParameter("Prioridad")));
            
              try {
                String salida1=userdao.inserta(userdto);
                response.sendRedirect("registro.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("registro.jsp?msg="+ex.getMessage());
            }
            
            
            
        }
         
         else if (request.getParameter("Consulta") != null && request.getParameter("Consulta").equals("ConsultarTodos")){
            try {
                ArrayList<UsuarioDto> user=userdao.listaTodo();
                request.getSession().setAttribute("usua", user);
                response.sendRedirect("mostrarusuarios.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(UsuariosCtrl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ( "eliminar".equals(request.getParameter("accion"))){
     
            
                   try {
                   UsuarioDao elim = new UsuarioDao();
            
            request.getSession().setAttribute("elimi", ""+elim.EliminarUsuarioDto(request.getParameter("serial")));
            
                ArrayList<UsuarioDto> user=userdao.listaTodo();
                request.getSession().setAttribute("usua", user);
                    
                response.sendRedirect("mostrarusuarios.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(HojaVidaCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }    else if ( "Modificar".equals(request.getParameter("accion"))){
     
            
                   try {
                   
                   
             userdto=userdao.MostrarUno(Integer.parseInt(request.getParameter("serial")));
            
                request.getSession().setAttribute("uno", userdto);
                    
                response.sendRedirect("user_mostraruno.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(UsuariosCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } 
     
     
        }
        
        else if (request.getParameter("btncam")!=null && request.getParameter("btncam").equals("Cambiar")){
           
            //userdto.setDocumento(Integer.parseInt(request.getParameter("documento")));
            userdto.setUsuario(request.getParameter("User"));
            userdto.setNombres(request.getParameter("nombres"));
            userdto.setApellidos(request.getParameter("apellidos"));
            userdto.setCargo(request.getParameter("cargo"));
            userdto.setTelefono(Integer.parseInt(request.getParameter("telefono")));
            //userdto.setPas(request.getParameter("contraseña"));
            userdto.setCorreo(request.getParameter("correo"));
            userdto.setTipo(Integer.parseInt(request.getParameter("Tipo")));
            userdto.setPrioridad(Integer.parseInt(request.getParameter("Prioridad")));
            userdto.setDocumento(Integer.parseInt(request.getParameter("documento")));
            try {
                
                String salida1=userdao.ModificarUsuarioDto(userdto);
                ArrayList<UsuarioDto> user=userdao.listaTodo();
                request.getSession().setAttribute("usua", user);
                response.sendRedirect("mostrarusuarios.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("mostrarusuarios.jsp?msg="+ex.getMessage());
            }
        
        }/**else if (request.getParameter("btncam")!=null && request.getParameter("btncam").equals("Cambiar")){
            
            userdto.setDocumento(Integer.parseInt(request.getParameter("documento")));
            userdto.setNombres(request.getParameter("nombres"));
            userdto.setApellidos(request.getParameter("apellidos"));
            userdto.setTelefono(Integer.parseInt(request.getParameter("telefono")));
            userdto.setUsuario(request.getParameter("User"));
            userdto.setPas(request.getParameter("contraseña"));
            userdto.setCorreo(request.getParameter("correo"));
            userdto.setTipo(Integer.parseInt(request.getParameter("Tipo")));
            userdto.setCargo(request.getParameter("cargo"));
        
          try {
                
                String salida1=userdao.ModificarUsuarioDto(userdto);
                ArrayList<UsuarioDto> hv=userdao.listaTodo();
                request.getSession().setAttribute("uno", hv);
                response.sendRedirect("mostrarusuarios.jsp?msg="+salida1);
            }catch (SQLException ex){
                response.sendRedirect("mostrarusuarios.jsp?msg="+ex.getMessage());
            }
        
        }
     
        else {
            response.sendRedirect("index-administrador.jsp?msg= no se encontró acción");
        }*/
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuariosCtrl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuariosCtrl at " + request.getContextPath() + "</h1>");
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
