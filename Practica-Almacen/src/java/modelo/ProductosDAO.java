package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {

    Connection conexion;

    public ProductosDAO(Connection conexion) throws ClassNotFoundException {
        Conexion con = new Conexion();
        conexion = con.getConnection();

    }

    public ProductosDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Productos> listarProductos() {

        List<Productos> list = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexion.prepareStatement("SELECT id,codigo,nombre,precio,existencia FROM productos");

            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int existencia = rs.getInt("exitencia");

                Productos producto = new Productos(id, existencia, codigo, nombre, precio);

                list.add(producto);
            }

            return list;
        } catch (SQLException e) {

            System.out.println(e);

            return null;
        }
    }

    public Productos mostrarProductos(int _id) {
        Productos producto = null;
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conexion.prepareStatement("SELECT id,codigo,nombre,precio,existencia FROM productos WHERE id=?");

            ps.setInt(1, _id);
            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int existencia = rs.getInt("exitencia");

                producto = new Productos(id, existencia, codigo, nombre, precio);

            }

            return producto;
        } catch (SQLException e) {

            System.out.println(e);

            return null;
        }
    }

    public boolean insertar(Productos productos) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSER INTO producto ( codigo,nombre,precio,existencia) VALUES (?,?,?,?)");

            ps.setString(1, productos.getCodigo());
            ps.setString(2, productos.getNombre());
            ps.setDouble(3, productos.getPrecio());
            ps.setInt(4, productos.getExistencia());
            ps.execute();

            return true;
        } catch (SQLException e) {

            System.out.println(e);

            return false;
        }
    }

    public boolean actualizar(Productos productos) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE producto SET codigo=?,nombre=?,precio=?,existencia=? WHERE id=? ");

            ps.setString(1, productos.getCodigo());
            ps.setString(2, productos.getNombre());
            ps.setDouble(3, productos.getPrecio());
            ps.setInt(4, productos.getExistencia());
            ps.setInt(5, productos.getId());
            ps.execute();

            return true;
        } catch (SQLException e) {

            System.out.println(e);

            return false;
        }
    }

    public boolean eliminar(int _id)  {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM producto VALUES (?,?,?,?) ");

            ps.setInt(4, _id);
            ps.execute();

            return true;
        } catch (SQLException e) {

            System.out.println(e);

            return false;
        }
    }

}
