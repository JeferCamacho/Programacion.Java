package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUP;
import Modelo.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUP {

    Conexion cn = new Conexion();
    Connection con;

    PreparedStatement ps;
    ResultSet rs;

    Persona p = new Persona();

    @Override
    public List listar() {

        ArrayList<Persona> list = new ArrayList<>();
        String sql = "SELECT  * FROM persona ";

        try {
            con = cn.GetConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Persona per = new Persona();

                per.setId(rs.getInt("ID"));
                per.setDni(rs.getString("DNI"));
                per.setNom(rs.getString("Nombres"));
                list.add(per);
            }

        } catch (Exception e) {
        }

        return list;

    }

    @Override
    public Persona list(int id) {

        String sql = "SELECT  * FROM persona WHERE id=" + id;

        try {
            con = cn.GetConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                p.setId(rs.getInt("Id"));
                p.setDni(rs.getString("DNI"));
                p.setNom(rs.getString("Nombres"));
            }

        } catch (Exception e) {
        }

        return p;

    }

    @Override

    public boolean add(Persona per) {

        String sql = "INSERT INTO persona (DNI,Nombres) values ('" + per.getDni() + "','" + per.getNom() + "')";

        try {

            con = cn.GetConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }

        return false;

    }

    @Override
    public boolean edit(Persona per) {

        String sql = "UPDATE persona  SET DNI='" + per.getDni() + "',Nombres='" + per.getNom() + "' WHERE Id=" + per.getId();

        try {

            con = cn.GetConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }

        return false;
    }

    @Override
    public boolean eliminar(int id) {

        String sql = "DELETE  FROM persona  WHERE Id=" + id;

        try {
            con = cn.GetConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }

        return false;
    }

}
