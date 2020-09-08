package Ejercicio.Practica5;

import javax.swing.JOptionPane;

public class Practica {

    private int[] array = new int[5];
    private int aux;
    private int numeros;

    public Practica() {

        numeros = 0;

    }

    public void setRellenoArray() {

      

        for (int i = 0; i < array.length; i++) {
            array[i] = numeros= Integer.parseInt(JOptionPane.showInputDialog("Ingrese notas"));

        }

    }

    public void setOrganizarArray() {

        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - 1); j++) {

                if (array[j] > array[j + 1]) {

                    aux = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = array[j];

                }

            }

        }

    }

    public void setImprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "] " + array[i]);

        }

        System.out.println("Nota menor 1 " + array[0]);
        System.out.println("Nota menor 1 " + array[1]);
    }

    public static void main(String[] args) {
        ////////////////////////////////////EJERCICIO//////////////////////////////////
        /*Se ingresan 5 notas de un alumno publicar 2 peores*/

        /////////////////////////////////////////////////////////////////////////////
       
        Practica array = new Practica();

        array.setRellenoArray();
        array.setOrganizarArray();
        array.setImprimirArray();

    }

}
