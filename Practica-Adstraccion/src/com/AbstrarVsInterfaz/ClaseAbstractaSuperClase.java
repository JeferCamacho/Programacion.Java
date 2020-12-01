package com.AbstrarVsInterfaz;

public abstract class ClaseAbstractaSuperClase {

    private int edad;
    private String nombre;

    public ClaseAbstractaSuperClase(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
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

    public abstract void descripcion();

    public void informe() {

        System.out.println("hola que hace este informe es para visualizar cual es el funcionamiento ");

    }

}
