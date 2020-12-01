package com.Abtraccion;

public class main {

    public static void main(String[] args) {

        animal ani1 = new perro(15, "perla");
        animal ani2 = new gato(12, "kira");

        ani1.tipoDeComida();
        ani2.tipoDeComida();

    }

}
