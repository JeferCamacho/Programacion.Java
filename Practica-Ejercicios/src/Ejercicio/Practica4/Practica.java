package Ejercicio.Practica4;

public class Practica {

    private int[] array = new int[100];
    private int aux;

    public Practica() {

        aux = 0;

    }

    public void setRellenarArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 1000);
        }

    }

    public void setOrganizarArray() {

        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - 1); j++) {

                if (array[j] > array[j + 1]) {

                    aux = array[j];

                    array[i] = array[j + 1];

                    array[j + 1] = aux;

                } 

            }

        }

    }

    public void setImprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]   " + array[i]);

        }

        System.out.println(" Numero menor  " + array[0]);
        System.out.println("Numero mayor   " + array[99]);
    }

    public static void main(String[] args) {

        ////////////////////////////////////EJERCICIO//////////////////////////////
        /*De una lista de numeros 100 determinar simultaneamente el maximo y el minimo*/
        ///////////////////////////////////////////////////////////////////////////
        Practica array = new Practica();

        array.setRellenarArray();
        array.setOrganizarArray();
        array.setImprimirArray();

    }

}
