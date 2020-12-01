package Ejercicio.Practica21;

import javax.swing.JOptionPane;

public class Practica {

    private String nombre;
    private String[] nombres = new String[10];

    public Practica() {

    }

    public void ingresarNombres() {

        for (int i = 0; i < nombres.length; i++) {

            nombres[i] = nombre = JOptionPane.showInputDialog("ingrese nombre");

        }

    }

    public void imprimirInversamente() {

        for (int i = (nombres.length-1); i >= 0; i--) {

            System.out.println("[" + (i + 1) + "]" + nombres[i]);

        }

    }

    public static void main(String[] args) {
        /*
        Hacer un programa que registre 10 y que le muestre de forma inversa la orden en el que fueron 
        ingresado
        
         */

        Practica nombre = new Practica();

        nombre.ingresarNombres();
        nombre.imprimirInversamente();

    }

}
