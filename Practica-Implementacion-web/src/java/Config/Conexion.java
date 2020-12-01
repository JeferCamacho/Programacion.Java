package Config;

import java.sql.Connection;

import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Conexion() {

        try {

            /*
            
            
            //FUNCIONAMIENTO
           
                * <LLAMADA>Implementacion para cargar el driver permiter la comunicacion con una motor 
                  de base de datos se da implementacion para cargar el driver <JDBC> y poder realizar 
                  la conexion en cual lo que realizamos es la llamada de ese metodo que realiza la   
                  Conexion.
            
            //IMPLEMENTACION
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
             */
            Class.forName("com.mysql.cj.jdbc.Driver");

            /*
            
            //FUNCIONAMIENTO 
            
                * <CONEXION>Realiza la conexion con la informacion implementada
            
            //IMPLEMENTACION
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "");

             */
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "");

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public Connection getCon() {
        return con;
    }
}
