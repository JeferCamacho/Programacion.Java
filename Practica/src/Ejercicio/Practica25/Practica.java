package Ejercicio.Practica25;

import javax.swing.JOptionPane;

public class Practica {

    private int[] array = new int[10];
    private int numero;

    public Practica() {

    }

    public void rellanarArray() {

        for (int i = 0; i < array.length; i++) {

//            array[i] = (int) Math.round(Math.random() * 100);
            array[i] = numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));

        }

    }

    public void imprimirInversamente() {

        for (int i = (array.length - 1); i >= 0; i--) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }

    }

    public static void main(String[] args) {

        /*
        Hacer un algoritmo que pida 10 edades y mostrarla de forma inversa en que fueron ingresada
        
         */
        Practica array = new Practica();

        array.rellanarArray();
        array.imprimirInversamente();
    }

}
