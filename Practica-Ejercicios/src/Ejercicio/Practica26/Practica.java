package Ejercicio.Practica26;

import javax.swing.JOptionPane;

public class Practica {

    private String[] array = new String[10];
    private String nombreEliminar;

    public void rellenarArray() {

        array[0] = "Sofia";
        array[1] = "Camila";
        array[2] = "Evelin";
        array[3] = "Paula";
        array[4] = "Diany";
        array[5] = "Salome";
        array[6] = "Elena";
        array[7] = "Yanetn";
        array[8] = "Luz";
        array[9] = "Blanca";

    }

    public void imprimirInformacion() {

        for (String string : array) {

            System.out.println(string);

        }

    }

    public void validarEliminacion() {

        nombreEliminar = JOptionPane.showInputDialog("Ingrese nombre a eliminar");

        for (int i = 0; i < array.length; i++) {

            if (array[i] == nombreEliminar) {

                array[i] = "vacio";
                System.out.println("Validacion respectiva realizada y modificado el valor ");

            }

        }

    }

    public void imprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "] " + array[i]);

        }

    }

    public static void main(String[] args) {

        /*
        
        Eliminar un alumno del salon dada la posicion indicada
        
         */
        Practica array = new Practica();

        array.rellenarArray();
        array.imprimirInformacion();
        array.validarEliminacion();
        array.imprimirArray();

    }

}
