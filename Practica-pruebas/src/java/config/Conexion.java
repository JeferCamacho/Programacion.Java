package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306:mibdventas";

    private Connection conex;

    public Connection conexion() {

        try {

            /*
            
            //LIBRERIA
            
            Principalmente llama al libreria para realizar la conexion a mysql
            
             */
            Class.forName("com.mysql.cj.jdbc.Driver");

            /*
            
            //DriverManager.getConnection

                * Estable una conexion en base a los datos espeficidos crear un objeto <Connection> en cual lo que 
                  realiza es especificamente llama al gerarquia en el cual se encutra el metodo y hace la creacion
                  del metodo 
            
            
            //DriverManager
            
                * Maneja solicitudes de conexione entre controladores adecuados <bases de datos-servidores de 
                  de bases de datos>
            
            //getConnection
            
                * Especifica la lista de propiedades para realizar la vinculacion a los parametros respectivos s
            
            
             */
            conex = DriverManager.getConnection(user, password, url);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conex;

    }

}
