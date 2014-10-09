/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;


import Modelo.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author darker
 */
public class IncidenteDto_old extends EstadoIncidenteDto{

    private int idincidente;
    private String  fecha_hora;
    private String fecha_final;
    private String TituloIncidente;
    private String descripcion;
    private String regsolucion;
    private String comentario;
    private int registro_partes;
    private int idhojavida;
    private int idusuario;
    private int idnivel;
    private int idEstado;
    private int idAsignado;
    private int idTipo_Daño;
  

    /**
     * @return the idincidente
     */
    public int getIdincidente() {
        return idincidente;
    }

    /**
     * @param idincidente the idincidente to set
     */
    public void setIdincidente(int idincidente) {
        this.idincidente = idincidente;
    }

    /**
     * @return the fecha_hora
     */
    public String getFecha_hora() {
        return fecha_hora;
    }

    /**
     * @param fecha_hora the fecha_hora to set
     */
    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    /**
     * @return the fecha_final
     */
    public String getFecha_final() {
        return fecha_final;
    }

    /**
     * @param fecha_final the fecha_final to set
     */
    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    /**
     * @return the TituloIncidente
     */
    public String getTituloIncidente() {
        return TituloIncidente;
    }

    /**
     * @param TituloIncidente the TituloIncidente to set
     */
    public void setTituloIncidente(String TituloIncidente) {
        this.TituloIncidente = TituloIncidente;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the regsolucion
     */
    public String getRegsolucion() {
        return regsolucion;
    }

    /**
     * @param regsolucion the regsolucion to set
     */
    public void setRegsolucion(String regsolucion) {
        this.regsolucion = regsolucion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the registro_partes
     */
    public int getRegistro_partes() {
        return registro_partes;
    }

    /**
     * @param registro_partes the registro_partes to set
     */
    public void setRegistro_partes(int registro_partes) {
        this.registro_partes = registro_partes;
    }

    /**
     * @return the idhojavida
     */
    public int getIdhojavida() {
        return idhojavida;
    }

    /**
     * @param idhojavida the idhojavida to set
     */
    public void setIdhojavida(int idhojavida) {
        this.idhojavida = idhojavida;
    }

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the idnivel
     */
    public int getIdnivel() {
        return idnivel;
    }

    /**
     * @param idnivel the idnivel to set
     */
    public void setIdnivel(int idnivel) {
        this.idnivel = idnivel;
    }

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the idAsignado
     */
    public int getIdAsignado() {
        return idAsignado;
    }

    /**
     * @param idAsignado the idAsignado to set
     */
    public void setIdAsignado(int idAsignado) {
        this.idAsignado = idAsignado;
    }

    /**
     * @return the idTipo_Daño
     */
    public int getIdTipo_Daño() {
        return idTipo_Daño;
    }

    /**
     * @param idTipo_Daño the idTipo_Daño to set
     */
    public void setIdTipo_Daño(int idTipo_Daño) {
        this.idTipo_Daño = idTipo_Daño;
    }
/**
    public String RegistroSolucion (IncidenteDto inc) throws SQLException, NamingException{
        
     Context context;
    Connection cnn;
    PreparedStatement pstm;
        
        try {
           InitialContext initcontext=new InitialContext();
            context=(Context) initcontext.lookup("java:comp/env");
            DataSource ds=(DataSource) context.lookup("pool");
            
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                throw ex;
                
            }
            
        } catch (NamingException ex){
            throw ex;
        }
        String salida;
        int resultado;
        
        try {
            pstm=cnn.prepareStatement("UPDATE `PYTHON`.`incidencia` SET `Reg_solucion` = ?"
                    + " WHERE `incidencia`.`idINCIDENCIA` = ?;" );
            
            pstm.setString(1,inc.getRegsolucion());
            pstm.setInt(2,inc.idincidente);
            resultado=pstm.executeUpdate();
            if(resultado!=0){
                salida="QueryOk";
                
            }
            else {
                salida="no se genero el registro";
            }
            
        } 
        catch (SQLException ex){
         salida=ex.getMessage();
                 }
        return salida;
        
        }

    
    public String insertIncidente(IncidenteDto indto) throws SQLException, NamingException{
         Context context;
    Connection cnn;
    PreparedStatement pstm;
   ResultSet rs=null;
    
        
        try {
           InitialContext initcontext=new InitialContext();
            context=(Context) initcontext.lookup("java:comp/env");
            DataSource ds=(DataSource) context.lookup("pool");
            
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                throw ex;
                
            }
            
        } catch (NamingException ex){
            throw ex;
        }
        String salida="";
        int resultado=0;
        cnn=Conectar.getInstace();
        pstm=cnn.prepareCall("call NIVEL_INCIDENTE(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        pstm.setInt(1, indto.getIdincidente());
        pstm.setString(2, indto.getFecha_final());
        pstm.setString(3, indto.getFecha_hora());
        pstm.setString(4, indto.getTituloIncidente());
        pstm.setString(5, indto.getDescripcion());
        pstm.setString(6, indto.getRegsolucion());
        pstm.setString(7, indto.getComentario());
        pstm.setInt(8, indto.getRegistro_partes());
        pstm.setInt(9, indto.getIdhojavida());
        pstm.setInt(10, indto.getIdusuario());
        pstm.setInt(11, indto.getIdnivel());
        pstm.setInt(12, indto.getIdEstado());
        pstm.setInt(13, getIdAsignado());
        pstm.setInt(14, indto.getIdTipo_Daño());
                
          if(resultado>0){
                salida="Incidente creado correctamente";
            }else{
                salida="fallo al ingresa el incidente";
            }
         
        return salida;
    }
      

    
    
    
    
    public ArrayList LisIncidenciasUsuario (int id) throws SQLException, NamingException{
        
      Context context;
    Connection cnn;
    PreparedStatement pstm;
   ResultSet rs=null;
    
        
        try {
           InitialContext initcontext=new InitialContext();
            context=(Context) initcontext.lookup("java:comp/env");
            DataSource ds=(DataSource) context.lookup("pool");
            
            try {
                cnn=ds.getConnection();
            } catch (SQLException ex) {
                throw ex;
                
            }
            
        } catch (NamingException ex){
            throw ex;
        }
        
        ArrayList Incidente=new ArrayList();
        
        
        
        try {
         
            pstm=cnn.prepareStatement("SELECT incidencia.USUARIO_id_documento,"
                    + "incidencia.idINCIDENCIA,"
                    + " incidencia.fecha_hora,"
                    + " incidencia.TituloIncidente,"
                    + " incidencia.Descripcion,"
                    + " incidencia.Regsolucion,"
                    + "estado.IdEstado,"
                    + "nivel.Prioridad"
                    + "FROM"
                    + "incidencia"
                    + "INNER JOIN estado ON incidencia.Estado_idEstado = estado.idEstado"
                    + "INNER JOIN nivel ON incidencia.Nivel_idNivel = nivel.idNivel"
                    + "WHERE "
                    + "incidencia.USUARIO_id_documento =?");
            
            pstm.setInt(1,id);
            rs=pstm.executeQuery();
            
            while(rs.next()){
                IncidenteDto incdto=new IncidenteDto();
                incdto.setIdusuario(rs.getInt(1));
                incdto.setIdincidente(rs.getInt(2));
                incdto.setFecha_hora(rs.getString(3));
                incdto.setTituloIncidente(rs.getString(4));
                incdto.setDescripcion(rs.getString(5));
                incdto.setRegsolucion(rs.getString(6));
                incdto.setIdEstado(rs.getInt(7));
                incdto.setIdnivel(rs.getInt(8));
                
                Incidente.add(incdto);
            }
            
            
        } catch (SQLException ex) {
            throw ex; 
        }
        
      return Incidente;
    }

    */
}

