package Ejercicio.Practica3;

public class Practica {

    private int[] array = new int[10];
    private int aux;

    public Practica() {

        aux = 0;

    }

    public void setIngresarNumeros() {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);

        }
    }

    public void setImprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "] " + " Numeros" + array[i]);

        }
    }

    public void setNumeroMayor() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] > aux) {

                aux = array[i];

            }

        }

    }

    public int getMayor() {

        return aux;
    }

    public static void main(String[] args) {

        ////////////////////////////////////EJERCICIO////////////////////////////
        /*Calcualr el numero mayor de una lista de numeros*/
        ////////////////////////////////////////////////////////////////////////
        Practica numeros = new Practica();

        numeros.setIngresarNumeros();
        numeros.setImprimirArray();
        numeros.setNumeroMayor();
        System.out.println("Numeros mayor     " + "[" + numeros.getMayor() + "]");

    }

}
