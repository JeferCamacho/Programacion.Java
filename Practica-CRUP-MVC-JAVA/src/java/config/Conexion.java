package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Conexion() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");

        } catch (Exception e) {

            System.out.println("Error" + e);

        }

        }

    public Connection GetConnection() {

        return con;
    }
}
