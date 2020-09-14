package Practica.List.Iterator;

public class Persona {

    private int edad;
    private String nombre;
    private String cargo;

    public Persona() {

    }

    public Persona(int edad, String nombre, String cargo) {
        this.edad = edad;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Iterator{" + "edad=" + edad + ", nombre=" + nombre + ", cargo=" + cargo + '}';
    }

}
