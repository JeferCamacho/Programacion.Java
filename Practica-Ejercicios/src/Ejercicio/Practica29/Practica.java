package Ejercicio.Practica29;

import javax.swing.JOptionPane;

public class Practica {

    private double[] array = new double[5];
    private double nota;
    private double aux;

    public void ingresarNota() {

        for (int i = 0; i < array.length; i++) {

            array[i] = nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota"));
        }

    }

    public void organizarPromedio() {

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

    public void imprimirPromedio() {

        for (int i = (array.length - 1); i >= 0; i--) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }

    }

    public static void main(String[] args) {

        ////////////////////////////EJFERCICIO///////////////////////////
        /*
        
        Mostrar alumnos de ordenamos por mayor puntaje de promedio
        
         */
        /////////////////////////////////////////////////////////////////
        Practica notas = new Practica();

        notas.ingresarNota();
        notas.organizarPromedio();
        notas.imprimirPromedio();

    }

}
