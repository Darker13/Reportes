/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DTO.HojaDeVidaDTO;
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
import javax.sql.DataSource;

/**
 *
 * @author Darker
 */
public class HojaDeVidaDAO {
    Context context;
    Connection cnn=null;
    PreparedStatement pstm=null;
    ResultSet rs=null;

    public HojaDeVidaDAO() {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
       }
    
    
    public String inserta (HojaDeVidaDTO hvdto) throws SQLException,NumberFormatException {
        
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        String salida;
        HojaDeVidaDTO hv= new HojaDeVidaDTO();
        int resultado;
        
        try {
            pstm=cnn.prepareStatement("INSERT INTO `hoja_vida`(`Serial_eq`, `Nombre`, `Ubicacion`, `Marca`, `Perifericos`, `USUARIO_id_documento`, `Sistema_operativo_idSistema_operativo`) "
                    + "VALUES (?,?,?,?,?,?,?)");
            pstm.setString(1,hvdto.getSerialEq());
            pstm.setString(2,hvdto.getNombre());
            pstm.setString(3,hvdto.getUbicacion());
            pstm.setString(4,hvdto.getMarca());
            pstm.setString(5,hvdto.getPerifericos());
            pstm.setInt(6,hvdto.getIdUsuario());
            pstm.setInt(7,hvdto.getSistemaOperativo());
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
    
    public String ModificarHojavidaDTO (HojaDeVidaDTO hojadto) throws SQLException {
        
        
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String salida;
       int resultado;
       try{
          pstm=cnn.prepareStatement("UPDATE `hoja_vida` SET `Nombre`= ?,`Ubicacion`= ?,"
                  + "`Marca`= ?,`Perifericos`= ?,`USUARIO_id_documento`= ?,`"
                  + "Sistema_operativo_idSistema_operativo`= ? WHERE `Serial_eq`= ?" );
          //pstm.setString(1,hojadto.getSerialEq());
          pstm.setString(1,hojadto.getNombre());
          pstm.setString(2,hojadto.getUbicacion());
          pstm.setString(3,hojadto.getMarca());
          pstm.setString(4,hojadto.getPerifericos());
          pstm.setInt(5,hojadto.getIdUsuario());
          pstm.setInt(6,hojadto.getSistemaOperativo());
          pstm.setString(7,hojadto.getSerialEq());
          resultado=pstm.executeUpdate();
          if(resultado!=0){
         salida="La hoja de vida se ha modificado exitosamente";
         
       }else{
              salida="Error Hoja De Vida no modificada";
          }
           
       }
        catch (SQLException ex){
          salida=ex.getMessage();{
    }
        }
       finally {
           if(pstm !=null){
                 pstm.close();
             }
            if(cnn !=null){
                 cnn.close();
             }
           
       }
        return salida;
}
     public String EliminarHojavidaDTO (String hojadt) throws SQLException  {
         
         try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         String salida;
         int resultado;
         
         try { pstm=cnn.prepareStatement("DELETE FROM hoja_vida WHERE `Serial_eq`=?");
          pstm.setString(1,hojadt);
         resultado=pstm.executeUpdate();
         if(resultado>0){
             salida="QueryOk";
         } else {
             salida="Error la hoja de vida no ha sido eliminado";
         }
          
         } catch (SQLException ex){
              salida=ex.getMessage();   
         } 
         finally{
            
              if(pstm !=null){
                 pstm.close();
             }
              if(cnn !=null){
                 cnn.close();
             }
              
             
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
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         ArrayList hojaV =new ArrayList();
         
         try{
             pstm=cnn.prepareStatement("SELECT\n" +
"hoja_vida.idHOJA_VIDA,\n" +
"hoja_vida.Serial_eq,\n" +
"hoja_vida.Nombre,\n" +
"hoja_vida.Ubicacion,\n" +
"hoja_vida.Marca,\n" +
"hoja_vida.Perifericos,\n" +
"hoja_vida.USUARIO_id_documento,\n" +
"sistema_operativo.Sistema\n" +
"FROM\n" +
"hoja_vida\n" +
"INNER JOIN sistema_operativo ON hoja_vida.Sistema_operativo_idSistema_operativo = sistema_operativo.idSistema_operativo");
             rs=pstm.executeQuery();
         while ( rs.next()){
             HojaDeVidaDTO hojaVida=new HojaDeVidaDTO();
             hojaVida.setHojaVida(rs.getInt(1));
             hojaVida.setSerialEq(rs.getString(2));
             hojaVida.setNombre(rs.getString(3));
             hojaVida.setUbicacion(rs.getString(4));
             hojaVida.setMarca(rs.getString(5));
             hojaVida.setPerifericos(rs.getString(6));
             hojaVida.setIdUsuario(rs.getInt(7));
             hojaVida.setSistema(rs.getString(8));
             
             hojaV.add(hojaVida);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
             if(pstm !=null){
                 pstm.close();
             }
             if(cnn !=null){
                 cnn.close();
             }
                 
         }
         
         return hojaV;
     } 
      public HojaDeVidaDTO MostrarUno(String temp) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
          
          try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         HojaDeVidaDTO hojaVida=new HojaDeVidaDTO();
         
         try{
             pstm=cnn.prepareStatement("SELECT * FROM hoja_vida where Serial_eq =?");
            pstm.setString(1, temp);
             rs=pstm.executeQuery();
             
         while ( rs.next()){
             
             hojaVida.setHojaVida(rs.getInt(1));
             hojaVida.setSerialEq(rs.getString(2));
             hojaVida.setNombre(rs.getString(3));
             hojaVida.setUbicacion(rs.getString(4));
             hojaVida.setMarca(rs.getString(5));
             hojaVida.setPerifericos(rs.getString(6));
             hojaVida.setIdUsuario(rs.getInt(7));
             hojaVida.setSistemaOperativo(rs.getInt(8));
             
             
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
             if(pstm !=null){
                 pstm.close();
             }
             
             if(cnn !=null){
                 cnn.close();
             }
             
         }
         
         return hojaVida;
     }
      
      
      
      // mostrar hojas de vida por el usuario 
      
      
       
         public ArrayList  listarHv(int user, int iduser) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(HojaDeVidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         ArrayList hojaV =new ArrayList();
         
         try{
               if (user == 3) {
                 pstm=cnn.prepareStatement("SELECT hoja_vida.idHOJA_VIDA, hoja_vida.Serial_eq, hoja_vida.Nombre, hoja_vida.Ubicacion, hoja_vida.Marca, hoja_vida.Perifericos, hoja_vida.USUARIO_id_documento, sistema_operativo.Sistema FROM hoja_vida INNER JOIN sistema_operativo ON hoja_vida.Sistema_operativo_idSistema_operativo = sistema_operativo.idSistema_operativo WHERE `USUARIO_id_documento` = ?");
                 pstm.setInt(1, iduser);
                 rs=pstm.executeQuery();
             }else if (user == 2 | user == 1){
                 pstm=cnn.prepareStatement("SELECT hoja_vida.idHOJA_VIDA, hoja_vida.Serial_eq, hoja_vida.Nombre, hoja_vida.Ubicacion, hoja_vida.Marca, hoja_vida.Perifericos, hoja_vida.USUARIO_id_documento, sistema_operativo.Sistema FROM hoja_vida INNER JOIN sistema_operativo ON hoja_vida.Sistema_operativo_idSistema_operativo = sistema_operativo.idSistema_operativo");
                  
             rs=pstm.executeQuery();
             }
         
               while ( rs.next()){
             HojaDeVidaDTO hojaVida=new HojaDeVidaDTO();
             hojaVida.setHojaVida(rs.getInt(1));
             hojaVida.setSerialEq(rs.getString(2));
             hojaVida.setNombre(rs.getString(3));
             hojaVida.setUbicacion(rs.getString(4));
             hojaVida.setMarca(rs.getString(5));
             hojaVida.setPerifericos(rs.getString(6));
             hojaVida.setIdUsuario(rs.getInt(7));
             hojaVida.setSistema(rs.getString(8));
             
             hojaV.add(hojaVida);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return hojaV;
           
         }
}
    
