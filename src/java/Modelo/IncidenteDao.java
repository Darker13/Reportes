/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


import DTO.IncidenteDto;
import DTO.SolucionDto;
import java.sql.CallableStatement;
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
public class IncidenteDao {
    
    
    
     Context context;
    Connection cnn=null;
    PreparedStatement pstm=null;
    CallableStatement cs=null;
    ResultSet rs=null;
    
    private int id;
    
    public IncidenteDao() {
    
}
    
    
     public String insertaIncidente (IncidenteDto incidto) throws SQLException,NumberFormatException {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String salida;
        IncidenteDto inci= new IncidenteDto();
        int resultado;
          try {
           pstm = cnn.prepareStatement("INSERT INTO `python`.`incidencia` (`idINCIDENCIA`, `fecha_hora`, `TituloIncidente`, `Descripcion`, `USUARIO_id_documento`, `Nivel_idNivel`, `Estado_idEstado`, `Asignado_idAsignado`, `Tipo_Daño_idTipo_Daño`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
           pstm.setInt(1,incidto.getIdincidente());
           pstm.setString(2, incidto.getFecha_hora());
           pstm.setString(3, incidto.getTituloIncidente());
           pstm.setString(4, incidto.getDescripcion());
           pstm.setInt(5, incidto.getIdusuario());
           pstm.setInt(6, incidto.getIdnivel());
           pstm.setInt(7, incidto.getIdEstado());
           pstm.setInt(8, incidto.getIdAsignado());
           pstm.setInt(9, incidto.getIdTipo_Daño());
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
    
   
     /** nuevo*/
     
     
     public String ModificarIncidenteDto (IncidenteDto incidto) throws SQLException {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String salida;
       int resultado;
       try{
          pstm=cnn.prepareStatement("UPDATE `python`.`incidencia` SET  `TituloIncidente` = ?, `Descripcion` = ?, `USUARIO_id_documento` = ?,`Nivel_idNivel` = ?, `Estado_idEstado` = ?, `Asignado_idAsignado` = ?, `Tipo_Daño_idTipo_Daño` = ? WHERE `incidencia`.`idINCIDENCIA` =?;" );
           //pstm.setInt(1,incidto.getIdincidente());
           pstm.setString(1, incidto.getTituloIncidente());
           pstm.setString(2, incidto.getDescripcion());
           pstm.setInt(3, incidto.getIdusuario());
           pstm.setInt(4, incidto.getIdnivel());
           pstm.setInt(5, incidto.getIdEstado());
           pstm.setInt(6, incidto.getIdAsignado());
           pstm.setInt(7, incidto.getIdTipo_Daño());
           pstm.setInt(8, incidto.getIdincidente());
          resultado=pstm.executeUpdate();
          if(resultado!=0){
         salida="Se ha modificado exitosamente el incidente";
         
       }else{
              salida="Error Incidente no modificada";
          }
           
       }
        catch (SQLException ex){
          salida=ex.getMessage();{
    }
        }
        return salida;
}

      public String EliminarIncidenteDto (String incidto)  {
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         String salida;
         int resultado;
         
         try { pstm=cnn.prepareStatement("DELETE FROM `python`.`incidencia` WHERE `incidencia`.`idINCIDENCIA` = ?");
          pstm.setString(1,incidto);
         resultado=pstm.executeUpdate();
         if(resultado>0){
             salida="QueryOk";
         } else {
             salida="Error la hoja de vida no ha sido eliminado";
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
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         ArrayList Inciden =new ArrayList();
         
         try{
             pstm=cnn.prepareStatement("SELECT `idINCIDENCIA`, `fecha_hora`, `TituloIncidente`, `Descripcion`, `USUARIO_id_documento`, `Nivel_idNivel`, `Estado_idEstado`, `Asignado_idAsignado`, `Tipo_Daño_idTipo_Daño` FROM `incidencia`");
             rs=pstm.executeQuery();
         while ( rs.next()){
             IncidenteDto Incidente=new IncidenteDto();
             Incidente.setIdincidente(rs.getInt(1));
             Incidente.setFecha_hora(rs.getString(2));
             Incidente.setTituloIncidente(rs.getString(3));
             Incidente.setDescripcion(rs.getString(4));
             Incidente.setIdusuario(rs.getInt(5));
             Incidente.setIdnivel(rs.getInt(6));
             Incidente.setIdEstado(rs.getInt(7));
             Incidente.setIdAsignado(rs.getInt(8));
             Incidente.setIdTipo_Daño(rs.getInt(9));
             Inciden.add(Incidente);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return Inciden;
     } 
    
       
       public IncidenteDto MostrarUno(int temp) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
         try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         IncidenteDto Incidente=new IncidenteDto();
         
         try{
             pstm=cnn.prepareStatement("SELECT  * FROM `incidencia` where `idINCIDENCIA` = ?");
            pstm.setInt(1, temp);
             rs=pstm.executeQuery();
             
         while ( rs.next()){
             
            
             Incidente.setIdincidente(rs.getInt(1));
             Incidente.setFecha_hora(rs.getString(2));
             Incidente.setTituloIncidente(rs.getString(3));
             Incidente.setDescripcion(rs.getString(4));
             Incidente.setIdusuario(rs.getInt(5));
             Incidente.setIdnivel(rs.getInt(6));
             Incidente.setIdEstado(rs.getInt(7));
             Incidente.setIdAsignado(rs.getInt(8));
             Incidente.setIdTipo_Daño(rs.getInt(9));
             
             
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return Incidente;
     }
    
       
       /** Mostrar incidente segun usuario */
       
       
             
          
         
         public ArrayList  listarUser(int user, int iduser) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         ArrayList Inciden =new ArrayList();
         
         try{
               if (user == 3) {
                 pstm=cnn.prepareStatement("SELECT `idINCIDENCIA`,  `fecha_hora`, `TituloIncidente`, `Descripcion`, `USUARIO_id_documento`, `Nivel_idNivel`, `Estado_idEstado`, `Asignado_idAsignado`, `Tipo_Daño_idTipo_Daño` FROM `incidencia` WHERE incidencia.USUARIO_id_documento = ? AND incidencia.Estado_idEstado = 1 AND incidencia.Asignado_idAsignado IS NOT NULL ORDER BY incidencia.Nivel_idNivel");
                 pstm.setInt(1, iduser);
                 rs=pstm.executeQuery();
             }else if (user == 2){
                 pstm=cnn.prepareStatement("SELECT `idINCIDENCIA`,  `fecha_hora`, `TituloIncidente`, `Descripcion`, `USUARIO_id_documento`, `Nivel_idNivel`, `Estado_idEstado`, `Asignado_idAsignado`, `Tipo_Daño_idTipo_Daño` FROM `incidencia` WHERE  incidencia.Estado_idEstado = 1 AND  incidencia.Asignado_idAsignado = 2 AND incidencia.Asignado_idAsignado IS NOT NULL ORDER BY incidencia.Nivel_idNivel");
                  
             rs=pstm.executeQuery();
             }else if (user == 1){
                 pstm=cnn.prepareStatement("SELECT  `idINCIDENCIA`, `fecha_hora`, `TituloIncidente`, `Descripcion`, `USUARIO_id_documento`, `Nivel_idNivel`, `Estado_idEstado`, `Asignado_idAsignado`, `Tipo_Daño_idTipo_Daño` FROM `incidencia` WHERE incidencia.Estado_idEstado = 1 AND incidencia.Asignado_idAsignado IS NOT NULL ORDER BY incidencia.Nivel_idNivel");
                
             rs=pstm.executeQuery();
             }
               
         while ( rs.next()){
             IncidenteDto Incidente=new IncidenteDto();
             Incidente.setIdincidente(rs.getInt(1));
             Incidente.setFecha_hora(rs.getString(2));
             Incidente.setTituloIncidente(rs.getString(3));
             Incidente.setDescripcion(rs.getString(4));
             Incidente.setIdusuario(rs.getInt(5));
             Incidente.setIdnivel(rs.getInt(6));
             Incidente.setIdEstado(rs.getInt(7));
             Incidente.setIdAsignado(rs.getInt(8));
             Incidente.setIdTipo_Daño(rs.getInt(9));
             Inciden.add(Incidente);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return Inciden;
     } 
    

  public ArrayList  Historial(int user, int iduser) throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
        try {       
            InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         ArrayList Inciden =new ArrayList();
         
         try{
               if (user == 3) {
                 pstm=cnn.prepareStatement("SELECT\n" +
"incidencia.idINCIDENCIA,\n" +
"incidencia.fecha_hora,\n" +
"incidencia.TituloIncidente,\n" +
"incidencia.Descripcion,\n" +
"incidencia.USUARIO_id_documento,\n" +
"incidencia.Nivel_idNivel,\n" +
"incidencia.Estado_idEstado,\n" +
"incidencia.Asignado_idAsignado,\n" +
"incidencia.`Tipo_Daño_idTipo_Daño`,\n" +
"SolucionIncidente.Reg_Solucion,\n" +
"SolucionIncidente.Comentarios,\n" +
"SolucionIncidente.Fecha_Solucion\n" +
"FROM\n" +
"incidencia\n" +
"INNER JOIN SolucionIncidente ON SolucionIncidente.incidencia_idINCIDENCIA = incidencia.idINCIDENCIA WHERE incidencia.USUARIO_id_documento = ?");
                 pstm.setInt(1, iduser);
                 rs=pstm.executeQuery();
             }else if (user == 2){
                 pstm=cnn.prepareStatement("SELECT\n" +
"incidencia.idINCIDENCIA,\n" +
"incidencia.fecha_hora,\n" +
"incidencia.TituloIncidente,\n" +
"incidencia.Descripcion,\n" +
"incidencia.USUARIO_id_documento,\n" +
"incidencia.Nivel_idNivel,\n" +
"incidencia.Estado_idEstado,\n" +
"incidencia.Asignado_idAsignado,\n" +
"incidencia.`Tipo_Daño_idTipo_Daño`,\n" +
"SolucionIncidente.Reg_Solucion,\n" +
"SolucionIncidente.Comentarios,\n" +
"SolucionIncidente.Fecha_Solucion\n" +
"FROM\n" +
"incidencia\n" +
"INNER JOIN SolucionIncidente ON SolucionIncidente.incidencia_idINCIDENCIA = incidencia.idINCIDENCIA WHERE incidencia.Asignado_idAsignado = 2");
                  
             rs=pstm.executeQuery();
             }else if (user == 1){
                 pstm=cnn.prepareStatement("SELECT\n" +
"incidencia.idINCIDENCIA,\n" +
"incidencia.fecha_hora,\n" +
"incidencia.TituloIncidente,\n" +
"incidencia.Descripcion,\n" +
"incidencia.USUARIO_id_documento,\n" +
"incidencia.Nivel_idNivel,\n" +
"incidencia.Estado_idEstado,\n" +
"incidencia.Asignado_idAsignado,\n" +
"incidencia.`Tipo_Daño_idTipo_Daño`,\n" +
"SolucionIncidente.Reg_Solucion,\n" +
"SolucionIncidente.Comentarios,\n" +
"SolucionIncidente.Fecha_Solucion\n" +
"FROM\n" +
"incidencia\n" +
"INNER JOIN SolucionIncidente ON SolucionIncidente.incidencia_idINCIDENCIA = incidencia.idINCIDENCIA");
                
             rs=pstm.executeQuery();
             }
               
         while ( rs.next()){
             IncidenteDto Incidente=new IncidenteDto();
             Incidente.setIdincidente(rs.getInt(1));
             Incidente.setFecha_hora(rs.getString(2));
             Incidente.setTituloIncidente(rs.getString(3));
             Incidente.setDescripcion(rs.getString(4));
             Incidente.setIdusuario(rs.getInt(5));
             Incidente.setIdnivel(rs.getInt(6));
             Incidente.setIdEstado(rs.getInt(7));
             Incidente.setIdAsignado(rs.getInt(8));
             Incidente.setIdTipo_Daño(rs.getInt(9));
             Incidente.setFechaSolucion(rs.getString(10));
             Incidente.setRegSolucion(rs.getString(11));
             Incidente.setComentarios(rs.getString(12));
             Inciden.add(Incidente);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return Inciden;
     } 
    


    //Listar pendientes
  
  public ArrayList pendientes() throws ArrayIndexOutOfBoundsException, ArrayStoreException, SQLException{
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
         
         ArrayList pendiente =new ArrayList();
         
         try{
             pstm=cnn.prepareStatement("SELECT\n" +
"incidencia.idINCIDENCIA,\n" +
"incidencia.fecha_hora,\n" +
"incidencia.TituloIncidente,\n" +
"incidencia.Descripcion,\n" +
"incidencia.USUARIO_id_documento,\n" +
"incidencia.Nivel_idNivel,\n" +
"incidencia.Estado_idEstado,\n" +
"incidencia.Asignado_idAsignado,\n" +
"incidencia.`Tipo_Daño_idTipo_Daño`\n" +
"FROM\n" +
"incidencia\n" +
"WHERE\n" +
"incidencia.Asignado_idAsignado  IS NULL ");
             rs=pstm.executeQuery();
         while ( rs.next()){
             IncidenteDto Pendiente=new IncidenteDto();
             Pendiente.setIdincidente(rs.getInt(1));
             Pendiente.setFecha_hora(rs.getString(2));
             Pendiente.setTituloIncidente(rs.getString(3));
             Pendiente.setDescripcion(rs.getString(4));
             Pendiente.setIdusuario(rs.getInt(5));
             Pendiente.setIdnivel(rs.getInt(6));
             Pendiente.setIdEstado(rs.getInt(7));
             Pendiente.setIdAsignado(rs.getInt(8));
             Pendiente.setIdTipo_Daño(rs.getInt(9));
             pendiente.add(Pendiente);
         }
                         
         }catch(SQLException ex){
             throw ex;
         }finally{
             if (rs!=null){
             rs.close();
         }
         }
         
         return pendiente;
     } 
  
          public int insertarIncidentePrioridad (IncidenteDto inciDto) throws SQLException {
        int salida = 0;
        try {
            cnn=Conectar.getInstance();
            cnn.setAutoCommit(false);
            cs= cnn.prepareCall("call incidente(?,?,?,?,?,?)");
            cs.setString(1,inciDto.getFecha_hora());
            cs.setString(2,inciDto.getTituloIncidente());
            cs.setString(3,inciDto.getDescripcion());
            cs.setInt(4,inciDto.getIdusuario());
            cs.setInt(5,inciDto.getIdTipo_Daño());
            cs.registerOutParameter(6,java.sql.Types.INTEGER);
            cs.executeQuery();
            salida=Integer.parseInt(cs.getObject(6).toString());
            if(salida==1){
                cnn.rollback();
                
            } else if(salida==2){
                cnn.commit();
            }
                    
        } catch (Exception e) {
            Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            if(pstm!=null){
                pstm.close();
            }
        }
        return salida;
      
   
       
          }
          
          
public int sp_solucion (SolucionDto soluDTO) throws SQLException{

             int salida = 0;

             

             try {

                 cnn=Conectar.getInstance();
                 cnn.setAutoCommit(false);
                 cs= cnn.prepareCall("call sp_solucion(?,?,?,?,?)");
                 cs.setString(1,soluDTO.getFechaSolucion());
                 cs.setString(2,soluDTO.getRegSolucion());
                 cs.setString(3,soluDTO.getComentarios());
                 cs.setInt(4,soluDTO.getIdIncidencia());
                  cs.registerOutParameter(5,java.sql.Types.INTEGER);
                  cs.executeQuery();
                  salida=Integer.parseInt(cs.getObject(5).toString());
            

                  if(salida==1){

                cnn.rollback();
             
            } else if(salida==2){

                cnn.commit();

            }
                 
                 

             } catch (NamingException e) {

                  Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, e);

             } catch (SQLException e) {
                 Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, e);
         } catch (NumberFormatException e) {
             Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, e);
         }

             finally{

            if(pstm!=null){

                pstm.close();

            }

            

             }

              return salida;
}

   public String consultaCorreo (IncidenteDto incidto){
       String salida= null;
         try {
             cnn=Conectar.getInstance();
             pstm= cnn.prepareStatement( "SELECT usuario.Email FROM usuario WHERE usuario.id_documento = ?");
             pstm.setInt(1,incidto.getIdusuario());
             rs=pstm.executeQuery();
             
             while(rs.next()){
                 salida = rs.getString(1);
             }
         } catch (NamingException ex) {
             Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return salida;
         
   
   }


public String AsignacionCorreo (IncidenteDto incidto){
       String salida= null;
         try {
             cnn=Conectar.getInstance();
             pstm= cnn.prepareStatement( "SELECT usuario.Email FROM usuario INNER JOIN asignado ON asignado.usuario_id_documento = usuario.id_documento "
                     + "WHERE "
                     + "asignado.idAsignado = ? ");

             pstm.setInt(1,incidto.getIdAsignado());
             rs=pstm.executeQuery();
             
             while(rs.next()){
                 salida = rs.getString(1);
             }
         } catch (NamingException ex) {
             Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(IncidenteDao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return salida;
         
   
   }
   
          
}
