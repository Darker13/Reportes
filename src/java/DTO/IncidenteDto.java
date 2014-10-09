/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author darker
 */
public class IncidenteDto extends SolucionDto{

    public int getIdincidente() {
        return idincidente;
    }

    public void setIdincidente(int idincidente) {
        this.idincidente = idincidente;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getTituloIncidente() {
        return TituloIncidente;
    }

    public void setTituloIncidente(String TituloIncidente) {
        this.TituloIncidente = TituloIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRegsolucion() {
        return regsolucion;
    }

    public void setRegsolucion(String regsolucion) {
        this.regsolucion = regsolucion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getRegistro_partes() {
        return registro_partes;
    }

    public void setRegistro_partes(int registro_partes) {
        this.registro_partes = registro_partes;
    }

    public int getIdhojavida() {
        return idhojavida;
    }

    public void setIdhojavida(int idhojavida) {
        this.idhojavida = idhojavida;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdnivel() {
        return idnivel;
    }

    public void setIdnivel(int idnivel) {
        this.idnivel = idnivel;
    }

    @Override
    public int getIdEstado() {
        return idEstado;
    }

    @Override
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdAsignado() {
        return idAsignado;
    }

    public void setIdAsignado(int idAsignado) {
        this.idAsignado = idAsignado;
    }

    public int getIdTipo_Daño() {
        return idTipo_Daño;
    }

    public void setIdTipo_Daño(int idTipo_Daño) {
        this.idTipo_Daño = idTipo_Daño;
    }
    
    
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

    @Override
    public String getFechaSolucion() {
        return super.getFechaSolucion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaSolucion(String fechaSolucion) {
        super.setFechaSolucion(fechaSolucion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getComentarios() {
        return super.getComentarios(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setComentarios(String comentarios) {
        super.setComentarios(comentarios); //To change body of generated methods, choose Tools | Templates.
    }
     
    

    @Override
    public void setRegSolucion(String regSolucion) {
        super.setRegSolucion(regSolucion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRegSolucion() {
        return super.getRegSolucion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFechaFinal() {
        return super.getFechaFinal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaFinal(int fechaFinal) {
        super.setFechaFinal(fechaFinal); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
