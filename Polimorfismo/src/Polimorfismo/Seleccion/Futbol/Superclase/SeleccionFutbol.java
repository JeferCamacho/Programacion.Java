package Polimorfismo.Seleccion.Futbol.Superclase;

public abstract class SeleccionFutbol {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public SeleccionFutbol() {

    }

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void viajar() {

    }

    public void consentrarse() {

    }

    /*
    Principamente este metodo va a tomar diferentes formas con las subclases al heredar
    
     */
    public abstract void entrenamiento();

    public void partidoFutbol() {

    }

    public static void main(String[] args) {

    }

}
