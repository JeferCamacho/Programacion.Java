package com.Abtraccion;

public class gato extends animal {

    public gato(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void tipoDeComida() {

        System.out.println("Mi tipo de comida es : purina ");
    } 

}
