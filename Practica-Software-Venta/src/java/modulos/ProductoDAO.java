package modulos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Conexion cn = new Conexion();
    ProductoD producto = new ProductoD();

    public int Agregar(ProductoD producto) {
        int r = 0;
        String sql = "INSERT INTO productos (codigo, nombre, precio,existencia) VALUES (?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return r;

    }

}
