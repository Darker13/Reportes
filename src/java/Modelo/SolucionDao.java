/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import DTO.SolucionDto;
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
public class SolucionDao {
    
    
    Context context;
    Connection cnn=null;
    PreparedStatement pstm=null;
    ResultSet rs=null;
    private int id;

    public SolucionDao() {
    }
    
    public String insertar (SolucionDto soldto) throws SQLException,NumberFormatException, NamingException {
        cnn=Conectar.getInstance();
        String salida;
        SolucionDto solucion= new SolucionDto();
        int resultado;
          try {
           pstm = cnn.prepareStatement("INSERT INTO `python`.`SolucionIncidente` (`idSolucionIncidente`, `Fecha_Solucion`, `Reg_Solucion`, `Comentarios`, `incidencia_idINCIDENCIA`, `hoja_vida_idHOJA_VIDA`, `perifericos_Id`, `estado_idEstado`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
            pstm.setInt(1,soldto.getIdsolucion());
            pstm.setString(2,soldto.getFechaSolucion());
            pstm.setString(3,soldto.getRegSolucion());
            pstm.setString(4,soldto.getComentarios());
            pstm.setInt(5,soldto.getIdIncidencia());
            pstm.setInt(6,soldto.getHojaVida());
            pstm.setInt(7,soldto.getIdPeriferico());
            pstm.setInt(8,soldto.getIdEstado());
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
        }finally{
            if(pstm!=null){
                pstm.close();
            }
            try {
                Conectar.desconectar();
            } catch (Exception ex) {
                Logger.getLogger(SolucionDto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salida;
    }
    
    
    
    public String ModificarSolucion (SolucionDto soldto) throws SQLException {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String salida;
       int resultado;
       try{
          pstm=cnn.prepareStatement("UPDATE `python`.`SolucionIncidente` SET `Fecha_Solucion` = ?, `Reg_Solucion` = ?, `Comentarios` = ?, `incidencia_idINCIDENCIA` = ?, `hoja_vida_idHOJA_VIDA` = ?, `perifericos_Id`, `estado_idEstado` = ? WHERE `SolucionIncidente`.`idSolucionIncidente` =?;");
       
            pstm.setString(1,soldto.getFechaSolucion());
            pstm.setString(2,soldto.getRegSolucion());
            pstm.setString(3,soldto.getComentarios());
            pstm.setInt(4,soldto.getIdIncidencia());
            pstm.setInt(5,soldto.getHojaVida());
            pstm.setInt(6,soldto.getIdPeriferico());
            pstm.setInt(7,soldto.getIdEstado());
          
          
          resultado=pstm.executeUpdate();
          if(resultado!=0){
         salida="QueryOk";
         
       }else{
              salida="Error solucion no modificada";
          }
           
       }
        catch (SQLException ex){
          salida=ex.getMessage();{
    }
        }
        return salida;
}

    
    public String EliminarSolucion (String soldto)  {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         String salida;
         int resultado;
         
         try { pstm=cnn.prepareStatement("DELETE FROM `python`.`SolucionIncidente` WHERE `SolucionIncidente`.`idSolucionIncidente` = ?");
          pstm.setString(1,soldto);
         resultado=pstm.executeUpdate();
         if(resultado>0){
             salida="QueryOk";
         } else {
             salida="Error la solucion no ha sido eliminado";
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
                Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         ArrayList User =new ArrayList();
         
         try{
             pstm=cnn.prepareStatement("");
             rs=pstm.executeQuery();
         while ( rs.next()){
             SolucionDto solucion=new SolucionDto();
           //  usuario.setDocumento(rs.getInt(1));
            solucion.setIdsolucion(rs.getInt(1));
             solucion.setFechaSolucion(rs.getString(2));
             solucion.setRegSolucion(rs.getString(3));
             solucion.setComentarios(rs.getString(4));
             solucion.setIdIncidencia(rs.getInt(5));
             solucion.setHojaVida(rs.getInt(6));
             solucion.setIdPeriferico(rs.getInt(7));
             solucion.setIdEstado(rs.getInt(8));
             User.add(solucion);
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
    
    
    
    
     public SolucionDto MostrarUno(int temp) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
         try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(SolucionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         SolucionDto solucion=new SolucionDto();
         
         try{
             pstm=cnn.prepareStatement("SELECT usuario.id_documento, usuario.USUARIO, usuario.Nombre, usuario.Apellido, usuario.Telefono, usuario.Email, usuario.`Contraseña`, usuario.Cargo, usuario.tipo_idTIPO, usuario.prioridad_idprioridad FROM usuario WHERE usuario.id_documento = ?");
            pstm.setInt(1, temp);
             rs=pstm.executeQuery();
             
         while ( rs.next()){
             
             solucion.setIdsolucion(rs.getInt(1));
             solucion.setFechaSolucion(rs.getString(2));
             solucion.setRegSolucion(rs.getString(3));
             solucion.setComentarios(rs.getString(4));
             solucion.setIdIncidencia(rs.getInt(5));
             solucion.setHojaVida(rs.getInt(6));
             solucion.setIdPeriferico(rs.getInt(7));
             solucion.setIdEstado(rs.getInt(8));
             
             
             
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return solucion;
     }
     
    
    
    
    
}
