/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import DTO.TipoUsuarioDto;
import DTO.UsuarioDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.apache.catalina.connector.Request;

/**
 *
 * @author darker
 */
public class UsuarioDao {
    
    Context context;
    Connection cnn=null;
    PreparedStatement pstm=null;
    ResultSet rs=null;
    private int id;

    public UsuarioDao() {
    }
    
    public String inserta (UsuarioDto userdto) throws SQLException,NumberFormatException {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String salida;
        UsuarioDto user= new UsuarioDto();
        int resultado;
          try {
           pstm = cnn.prepareStatement("INSERT INTO `python`.`usuario` (`id_documento`, `USUARIO`, `Nombre`, `Apellido`, `Telefono`, `Email`, `Contraseña`, `Cargo`, `tipo_idTIPO`, `prioridad_idprioridad`) VALUES (?,?,?,?,?,?,MD5(?),?,?,?);");
            pstm.setInt(1,userdto.getDocumento());
            pstm.setString(2,userdto.getUsuario());
            pstm.setString(3,userdto.getNombres());
            pstm.setString(4,userdto.getApellidos());
            pstm.setInt(5,userdto.getTelefono());
            pstm.setString(6, userdto.getCorreo());
            pstm.setString(7,userdto.getPas());
            pstm.setString(8,userdto.getCargo());
            pstm.setInt(9,userdto.getTipo());
            pstm.setInt(10,userdto.getPrioridad());
            resultado=pstm.executeUpdate();
            
            if (resultado>0){
                salida="Registro Creado";
                
            }else{
                salida="Error en el registro";
            }
        }
        catch (SQLException ex){
            salida=ex.getMessage();
        }
        catch (NumberFormatException num){
            salida=num.getMessage();
        }
        return salida;
    }
    
    
    public String ModificarUsuarioDto (UsuarioDto userdto) throws SQLException {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String salida;
       int resultado;
       try{
          pstm=cnn.prepareStatement("UPDATE `python`.`usuario` SET `USUARIO` = ?, `Nombre` = ?, `Apellido` = ?, `Telefono` = ?, `Email` = ?,  `Cargo` = ?, `tipo_idTIPO` = ?, `prioridad_idprioridad` = ? WHERE `usuario`.`id_documento` = ?;" );
          //pstm.setInt(1, userdto.getDocumento());
          pstm.setString(1,userdto.getUsuario());
          pstm.setString(2,userdto.getNombres());
          pstm.setString(3,userdto.getApellidos());
          pstm.setInt(4,userdto.getTelefono());
          pstm.setString(5,userdto.getCorreo());
          //pstm.setString(6,userdto.getPas());
          pstm.setString(6,userdto.getCargo());
          pstm.setInt(7,userdto.getTipo());
          pstm.setInt(8,userdto.getPrioridad());
          pstm.setInt(9,userdto.getDocumento());
          
          
          resultado=pstm.executeUpdate();
          if(resultado!=0){
         salida="El usuario ha sido modificado exitosamente";
         
       }else{
              salida="Error usuario no modificada";
          }
           
       }
        catch (SQLException ex){
          salida=ex.getMessage();{
    }
        }
        return salida;
}

    public String EliminarUsuarioDto (String userdto)  {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         String salida;
         int resultado;
         
         try { pstm=cnn.prepareStatement("DELETE FROM `usuario` WHERE `usuario`.`id_documento` = ?");
          pstm.setString(1,userdto);
         resultado=pstm.executeUpdate();
         if(resultado>0){
             salida="QueryOk";
         } else {
             salida="Error el usuario no ha sido eliminado";
         }
          
         } catch (SQLException ex){
              salida=ex.getMessage();   
         } 
         return salida;
     }
    
    
    public ArrayList listaTodo() throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         ArrayList User =new ArrayList();
         
         try{
             pstm=cnn.prepareStatement("SELECT\n" +
"usuario.id_documento,\n" +
"usuario.USUARIO,\n" +
"usuario.Nombre,\n" +
"usuario.Apellido,\n" +
"usuario.Telefono,\n" +
"usuario.Email,\n" +

"usuario.Cargo,\n" +
"usuario.TIPO_idTIPO\n" +
"FROM\n" +
"usuario");
             rs=pstm.executeQuery();
         while ( rs.next()){
             UsuarioDto usuario=new UsuarioDto();
             usuario.setDocumento(rs.getInt(1));
             usuario.setUsuario(rs.getString(2));
             usuario.setNombres(rs.getString(3));
             usuario.setApellidos(rs.getString(4));
             usuario.setTelefono(rs.getInt(5));
             usuario.setCorreo(rs.getString(6));
             usuario.setCargo(rs.getString(7));

             usuario.setTipo(rs.getInt(8));
             
             
             User.add(usuario);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return User;
     } 
    
    
     public UsuarioDto MostrarUno(int temp) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
         try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         UsuarioDto usuario=new UsuarioDto();
         
         try{
             pstm=cnn.prepareStatement("SELECT `id_documento`,`USUARIO`, `Nombre`, `Apellido`, `Telefono`, `Email`, `Contraseña`, `Cargo`, `TIPO_idTIPO`, `prioridad_idprioridad` FROM `usuario` WHERE `id_documento`= ?");
            pstm.setInt(1, temp);
             rs=pstm.executeQuery();
             
         while ( rs.next()){
             
             usuario.setDocumento(rs.getInt(1));
             usuario.setUsuario(rs.getString(2));
             usuario.setNombres(rs.getString(3));
             usuario.setApellidos(rs.getString(4));
             usuario.setTelefono(rs.getInt(5));
             usuario.setCorreo(rs.getString(6));
             usuario.setPas(rs.getString(7));
             usuario.setCargo(rs.getString(8));
             usuario.setTipo(rs.getInt(9));
             usuario.setPrioridad(rs.getInt(10));
             
             
             
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return usuario;
     }
     
     
    //Se valida el usuario para el inicio de session 
     
     public TipoUsuarioDto validarUsuario(String u, String p) throws SQLException {
         try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        UsuarioDto usevali= new UsuarioDto();
         TipoUsuarioDto TUser =new  TipoUsuarioDto();
        String salida;
        try{
            //Consulta trae (documento del usuario, id del usuario, contraseña, tipo de usuario(rol), prioridad y Cargo)
        pstm=cnn.prepareStatement("SELECT usuario.id_documento,  usuario.USUARIO,  usuario.`Contraseña`, usuario.tipo_idTIPO,  usuario.prioridad_idprioridad, usuario.Cargo, tipo.idTIPO, tipo.Descripcion, prioridad.idprioridad, prioridad.prioridad  FROM usuario INNER JOIN tipo ON usuario.tipo_idTIPO = tipo.idTIPO INNER JOIN prioridad ON usuario.prioridad_idprioridad = prioridad.idprioridad WHERE  usuario.USUARIO = ? AND  usuario.`Contraseña` = MD5(?)");
            
         pstm.setString(1, u);
         pstm.setString(2, p);
            rs=pstm.executeQuery();
        
        if(rs.next()){
            TUser.setUsuario(rs.getString("USUARIO"));
            TUser.setPas(rs.getString("Contraseña"));
            TUser.setDocumento(rs.getInt("id_documento"));
            TUser.setIdTipo(Integer.parseInt(rs.getString("IdTIPO")));
            TUser.setTipoUser(rs.getString("Descripcion"));
            TUser.setDocumento(rs.getInt("id_documento"));
            TUser.setPrioridad(rs.getInt("idprioridad"));
            id=TUser.getIdTipo();
            salida="QueryOk";
            TUser.setMensaje(salida);
        }else{
            salida="Datos no validos";
           TUser.setMensaje(salida);
        }
        
        }catch(SQLException ex){
            salida=ex.getMessage();
            
        }finally{
            if(rs!=null){
                rs.close();
            }
        }
        return TUser;
    }

    private void TipoUsuarioDto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
     
}



