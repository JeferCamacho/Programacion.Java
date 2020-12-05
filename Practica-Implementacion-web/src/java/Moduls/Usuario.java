package Moduls;

public class Usuario {

    /*
    
    //FUNCIONAMIENTO 
        
        * Principalmente en la programacion orientada a objetos se realiza una identificacion al objeto
          Caracteristicas < DATOS-ATRIBUTOS>, comportamiento <METODOS>. Lo que realizamos al identificar 
          el objeto es poder contener y almacenar la informacion del objecto cuando implementamos una clase
          es para realiza la identificacion de la informacion de ese objeto.
    
    //IMPLEMENTACION
    
    
        * ATRIBUTOS 
        * ENCAPLAMIENTO = Solo pueden ser modificados desde la misma clase en cual es una restriccion para 
                          tener control del atributo
        * VISUALIZACION DE LOS ATRIBUTOS= <Metodo (SET-GET)>
    
    
          <
    
     */
    private int id;
    private String nombre;
    private String password;
    private String correo;
    public Usuario() {
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() { return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
