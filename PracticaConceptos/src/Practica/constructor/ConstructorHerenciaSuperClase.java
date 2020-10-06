package Practica.constructor;

public class ConstructorHerenciaSuperClase {

    private int edad;
    private String nombre;
    private String univerdad;
    private char sexo;

    public ConstructorHerenciaSuperClase(int edad, String nombre, String univerdad, char sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.univerdad = univerdad;
        this.sexo = sexo;
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

    public String getUniverdad() {
        return univerdad;
    }

    public void setUniverdad(String univerdad) {
        this.univerdad = univerdad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "ConstructorHerenciaSuperClase{" + "edad=" + edad + ", nombre=" + nombre + ", univerdad=" + univerdad + ", sexo=" + sexo + '}';
    }

    public void hola() {

        System.out.println("hola");
        
    }

}
