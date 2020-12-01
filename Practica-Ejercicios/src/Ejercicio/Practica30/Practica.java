package Ejercicio.Practica30;

import javax.swing.JOptionPane;

public class Practica {

    private int[] array = new int[10];
    private int precio;
    private int aux;

    public Practica() {

    }

    public Practica(int precio) {
        this.precio = precio;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void ingresarPrecio() {

        //Comportamiento de ingreso de informacion 
        for (int i = 0; i < array.length; i++) {

//            array[i] = precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del abarrote"));
            array[i] = (int) Math.round(Math.random() * 10000000);

        }

    }

    public void organizarPrecio() {

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

    public void imprimirPrecios() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }

    }

    public static void main(String[] args) {

        //////////////////////////////////////EJERCICIO//////////////////////
        /*
        
        
        Mostrar articulos abarratores ordenados por mayor precio y mostrar los articulos de mejor precio 
        
         */
        ///////////////////////////////////////////////////////////////
        Practica precio = new Practica();

        precio.ingresarPrecio();
        precio.organizarPrecio();
        precio.imprimirPrecios();
    }

}
