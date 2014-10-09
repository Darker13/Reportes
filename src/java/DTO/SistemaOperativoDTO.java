/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Erika
 */
public class SistemaOperativoDTO {
    private int idSistema_operativo;
    private String Sistema;
    private String version;

    /**
     * @return the idSistema_operativo
     */
    public int getIdSistema_operativo() {
        return idSistema_operativo;
    }

    /**
     * @param idSistema_operativo the idSistema_operativo to set
     */
    public void setIdSistema_operativo(int idSistema_operativo) {
        this.idSistema_operativo = idSistema_operativo;
    }

    /**
     * @return the Sistema
     */
    public String getSistema() {
        return Sistema;
    }

    /**
     * @param Sistema the Sistema to set
     */
    public void setSistema(String Sistema) {
        this.Sistema = Sistema;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
}
