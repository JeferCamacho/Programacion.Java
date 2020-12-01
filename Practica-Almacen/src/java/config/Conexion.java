package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection() throws ClassNotFoundException {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:myql://localhost:3306/almecen", "root", "");

            return conexion;

        } catch (SQLException e) {

            System.out.println(e);
            return null;
        }

    }

}
