package Modulos;

import Config.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDao {
    

    Statement stm;
    boolean estado = false;

    Conexion conexion = new Conexion();

    public boolean registro(Articulo a) {

        String SQL = ("INSER INTO articulos VALUES (NULL,'"
                + a.getNombre() + "','"
                + a.getDescripcion() + "',"
                + a.getPrecio());

        try {
            conexion.Conexion();
            estado = true;

            stm = conexion.Conexion().createStatement();
            stm.executeUpdate(SQL);
            stm.close();

        } catch (SQLException e) {
            System.out.println("erro" + e);
            estado = false;
        }

        return estado;

    }

}
