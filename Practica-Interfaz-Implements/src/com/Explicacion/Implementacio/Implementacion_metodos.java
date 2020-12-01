package com.Explicacion.Implementacio;

public class Implementacion_metodos implements metodo1, metodo2 {

    @Override
    public void metodo1() {

        System.out.println("Soy un metodo en el cual se implementa para que yo lo implemente en el comportamiento en la clase");
    }

    @Override
    public void metodo2() {

        System.out.println("Soy un metodo en el cual se implementa para que yo lo implemente en el comportamiento en la clase");
    }

    public static void main(String[] args) {

        Implementacion_metodos imple = new Implementacion_metodos();

        imple.metodo1();
        imple.metodo2();

    }

}
