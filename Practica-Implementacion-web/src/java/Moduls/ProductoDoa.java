package Moduls;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoDoa {

    Connection con;

    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();

    public boolean add(Producto producto) {

        String sql = "INSERT INTO  	producto (codigo,nombre,cantidad) VALUED (?,?,?)";

        try {

            con = conexion.getCon();

            ps = con.prepareStatement(sql);

            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getCantidad());

            ps.executeUpdate();

        } catch (Exception e) {
        }

        return false;

    }

}
