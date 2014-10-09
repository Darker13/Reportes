/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Modelo.Conectar.cnn;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Sena
 */
public class Conectar {
    static Context context;
     static Connection cnn;

    private Conectar() {
    }

    private static void conectar() throws NamingException, SQLException {
        InitialContext initContext= new InitialContext();
            context= (Context) initContext.lookup("java:comp/env");
            DataSource ds= (DataSource) context.lookup("pool");
            cnn=ds.getConnection();
    }

    public static Connection getInstance() throws NamingException, SQLException {
        
            conectar();
        
        return cnn;
    }

    public static void desconectar() throws SQLException{
        
        if(cnn!=null){
            cnn.close();
        }
    }
    
    
}
