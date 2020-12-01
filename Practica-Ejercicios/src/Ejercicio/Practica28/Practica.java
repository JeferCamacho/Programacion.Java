package Ejercicio.Practica28;

public class Practica {

    private int[] array = new int[10];
    private int aux;

    public void rellenarArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);

        }

    }

    public void organizarArray() {

        /*
       Metodo Burbuja
         */
        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - 1); j++) {

                if (array[i] > array[i + 1]) {
                    aux = array[i];

                    array[i] = array[i + 1];

                    //Reasignacion de las posiciones
                    array[i + 1] = aux;

                }

            }

        }

    }

    public void imprimirArray() {

        for (int i = (array.length - 1); i >= 0; i--) {

            System.out.println("[" + (i + 1) + "]   " + array[i]);

        }

    }

    public static void main(String[] args) {

        ////////////////////////////////////EJERCICIO/////////////////////////
        /*
        
        Mostrar los numeros de un arreglo ascendentemente 
        
         */
        ///////////////////////////////////////////////////////////////////////
        Practica array = new Practica();

        array.rellenarArray();
        array.organizarArray();
        array.imprimirArray();
    }

}
