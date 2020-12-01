package Ejercicio.Practica27;

import javax.swing.JOptionPane;

public class Practica {

    private int[] array = new int[10];
    private int numero;
    private int seguir;

    public void ingresarInformacion() {

        /*
        
        Principamente lo que hace el Do repertir lo que esta contenido dentro de ello hasta que la
        validacion sea negativa
        
         */
        do {

            for (int i = 0; i < array.length; i++) {

                array[i] = numero = Integer.parseInt(JOptionPane.showInputDialog("[" + (i + 1) + "]" + "Ingrese numero"));

            }

            seguir = Integer.parseInt(JOptionPane.showInputDialog("Desea seguir si = 1 \n  " + "no =0"));

        } while (seguir == 1);

    }

    public void imprmirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }

    }

    public static void main(String[] args) {

        ////////////////////////////////////EJERCICIO////////////////////////
        /*
        
        Ingresar un elemento en una posicion indicada  en un arreglo de N elementos (NUMEROS),hasta que
        el ususario desee salir 
        
        
         */
        ////////////////////////////////////////////////////////////////////
        Practica array = new Practica();

        array.ingresarInformacion();
        array.imprmirArray();

    }

}
