/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import DTO.PartesDto;
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
 * @author darker
 */
public class PartesDao {
    
    
    
    Context context;  
    Connection cnn=null;
    PreparedStatement pstm=null;
    ResultSet rs=null;

    public PartesDao() {
    
    } 

    
    
    public String insertaIncidente (PartesDto pardto) throws SQLException,NumberFormatException{
        
    
            try {
           InitialContext initContext=new InitialContext();
           context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            
            try {
            cnn=ds.getConnection();
           } catch (SQLException ex) {
                Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
           }
           } catch (NamingException ex) {
            Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        String salida;
        
        PartesDto inc= new PartesDto();
        int resultado;
        
        try {
            pstm=cnn.prepareStatement("INSERT INTO `python`.`perifericos` (`Id`, `Tipo`, `Serial`, `Nombre_Parte`, `HOJA_VIDA_idHOJA_VIDA`) VALUES (?,?,?,?,?);");
            pstm.setInt(1, pardto.getIdparte());
            pstm.setString(2, pardto.getTipo());
            pstm.setString(3, pardto.getSerial());
            pstm.setString(4, pardto.getNomparte());
            pstm.setInt(5, pardto.getHojadevida());
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
    
    
        public String ModificarPartesDto (PartesDto parte) throws SQLException {
            try {
           InitialContext initContext=new InitialContext();
           context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            
            try {
            cnn=ds.getConnection();
           } catch (SQLException ex) {
                Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
           }
           } catch (NamingException ex) {
            Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        String salida;
       int resultado;
       try{
          pstm=cnn.prepareStatement("UPDATE `python`.`perifericos` SET `Tipo` =?,\n" +
"`Serial` =?,\n" +
"`Nombre_Parte` =?,\n" +
"`HOJA_VIDA_idHOJA_VIDA` = ? WHERE `perifericos`.`Id` =?" );
          
            pstm.setString(1, parte.getTipo());
            pstm.setString(2, parte.getSerial());
            pstm.setString(3, parte.getNomparte());
            pstm.setInt(4, parte.getHojadevida());
            pstm.setInt(5, parte.getIdparte());
          resultado=pstm.executeUpdate();
          if(resultado!=0){
         salida="La parte se ha modificado con exito";
         
       }else{
              salida="Error Hoja De Vida no modificada";
          }
           
       }
        catch (SQLException ex){
          salida=ex.getMessage();{
    }
        }
        return salida;
}
     public String EliminarPartesDto (String Partes)  {
         try {
           InitialContext initContext=new InitialContext();
           context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            
            try {
            cnn=ds.getConnection();
           } catch (SQLException ex) {
                Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
           }
           } catch (NamingException ex) {
            Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         String salida;
         int resultado;
         
         try { pstm=cnn.prepareStatement("DELETE FROM `python`.`perifericos` WHERE `perifericos`.`Id` = ?");
          pstm.setString(1,Partes);
         resultado=pstm.executeUpdate();
         if(resultado>0){
             salida="QueryOk";
         } else {
             salida="Error la parte no ha sido eliminado";
         }
          
         } catch (SQLException ex){
              salida=ex.getMessage();   
         } 
         return salida;
     }
     
    
     public ArrayList listaTodo() throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
         try {
           InitialContext initContext=new InitialContext();
           context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            
            try {
            cnn=ds.getConnection();
           } catch (SQLException ex) {
                Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
           }
           } catch (NamingException ex) {
            Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         ArrayList part =new ArrayList();
         
         try{
             pstm=cnn.prepareStatement("SELECT `Id`, `Tipo`, `Serial`, `Nombre_Parte`, `HOJA_VIDA_idHOJA_VIDA` FROM `perifericos`");
             rs=pstm.executeQuery();
         while ( rs.next()){
             PartesDto Parte=new PartesDto();
             Parte.setIdparte(rs.getInt(1));
             Parte.setTipo(rs.getString(2));
             Parte.setSerial(rs.getString(3));
             Parte.setNomparte(rs.getString(4));
             Parte.setHojadevida(rs.getInt(5));
             part.add(Parte);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return part;
     } 
      public PartesDto MostrarUno(String temp) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
          
          try {
           InitialContext initContext=new InitialContext();
           context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            
            try {
            cnn=ds.getConnection();
           } catch (SQLException ex) {
                Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
           }
           } catch (NamingException ex) {
            Logger.getLogger(PartesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         PartesDto Parte=new PartesDto();
         
         try{
             pstm=cnn.prepareStatement("SELECT `Id`, `Tipo`, `Serial`, `Nombre_Parte`, `HOJA_VIDA_idHOJA_VIDA` FROM `perifericos`  WHERE `perifericos`.`Id` =? ");
            pstm.setString(1, temp);
             rs=pstm.executeQuery();
             
         while ( rs.next()){
             
             Parte.setIdparte(rs.getInt(1));
             Parte.setTipo(rs.getString(2));
             Parte.setSerial(rs.getString(3));
             Parte.setNomparte(rs.getString(4));
             Parte.setHojadevida(rs.getInt(5));
             
             
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return Parte;
     }
}
     
    

