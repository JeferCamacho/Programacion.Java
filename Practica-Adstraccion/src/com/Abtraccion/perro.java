package com.Abtraccion;

public class perro extends animal {

    public perro(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void tipoDeComida() {

        System.out.println("El tipo de alimento del perro es : purina e otras cosas");

    }

}
