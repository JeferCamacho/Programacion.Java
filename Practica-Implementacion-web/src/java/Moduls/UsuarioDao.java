  package Moduls;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDao {

    /*
    
    //FUNCIONAMIENTO
    
        *<Connection con> : Principalmente se realiza para poder realizar un vinculo entre la base de datos
                            y la aplicacion java en cual se utiza el metodo < Connect() > para ejecutar
                            SQL. 
    //IMPLEMENTACION
    
    Connection con;
     */
    Connection con;

    /*
    
    //FUNCIONAMIENTO
    
        *<PreparedStatement> : Sirve para preparar sentencias <SQL> Nos sirve para <Buscar-Insertar-Buscar> principalmente tiene un paremetro de entrada cuyo valor es especificado en la sentencia  como un interrogante <?> por cada interrogante es un dato de entrada en cual si en totalidad la cantidad de datos son 4 lo que se realiza es poder un interrogante por cada dato se implementaria de la siguiente manera VALUES <?,?,?,?> Antes de ejecutarse la sentencia se debe sumistrar un valor para cada interrogante mediante los metodos apriados <SET  

    private int id;
    private String nombre;
    private String password;
    private String correo;
	
    
    
    
     */
    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();

    public boolean add(Usuario usuario) {

        String sql = "INSERT INTO loginusuario(nombre,password,correo) VALUES (?,?,?) ";

        try {

            con = conexion.getCon();

            ps = con.prepareStatement(sql);

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getCorreo());

            ps.executeUpdate();

        } catch (Exception e) {
        }

        return false;

    }

    public void insert() {
    }
}
