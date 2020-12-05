package Moduls;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentoDao {

    Connection con;

    PreparedStatement ps;

    ResultSet rs;

    Conexion conexion = new Conexion();

    public boolean add(Documento documento) {
        String sql = "INSER INTO documento (codigo , nombreDocumento) VALUES ( ? , ? )";

        try {

            con = conexion.getCon();

            ps = con.prepareStatement(sql);

            ps.setInt(1, documento.getCodigo());
            ps.setString(2, documento.getNombreDocumento());

            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e);

        }

        return false;

    }

}
