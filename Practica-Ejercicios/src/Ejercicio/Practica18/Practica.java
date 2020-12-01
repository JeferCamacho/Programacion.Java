package Ejercicio.Practica18;

import javax.swing.JOptionPane;

public class Practica {

    private int[] array = new int[10];
    private int aux;
    private int numero;

    public void rellenarArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);

        }

    }

//    public void ingresarNumero() {
//
//        for (int i = 0; i < array.length; i++) {
//          array[i] = numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero a organizar de manera descente"));
//
//        }
//
//    }
    public void organizarAscendente() {
        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - 1); j++) {

                if (array[j] > array[j + 1]) {
                    aux = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = aux;
                }

            }

        }

    }

    public void imprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]" + array[i]);

        }

    }

    public static void main(String[] args) {

        /*
      
        
        
        Se tiene un arreglo "A" donse se encuentra 10 numeros ordenados en forma asdente y se pide
        que el algoritmo me permita el ingrese de un numero y lo coloque en la pocision donde deberia 
        de estar con respecto al orden del arreglo 
        
         */
        Practica array = new Practica();

        array.rellenarArray();
//        array.ingresarNumero();
        array.organizarAscendente();
        array.imprimirArray();

    }

}
