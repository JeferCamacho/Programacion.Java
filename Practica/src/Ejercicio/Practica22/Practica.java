package Ejercicio.Practica22;

public class Practica {

    private int[] array = new int[20];

    public Practica() {

    }

    public void rellenarArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 60);

        }

    }

    public void ImprimirNumeros() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }

    }

    public void validarNumero() {

            System.out.println("Numeros menores o iguales a 25");
        for (int i = 0; i < array.length; i++) {


            if (array[i] <= 25) {

                System.out.println("[" + (i + 1) + "] " + array[i]);

            }

        }

    }

    public static void main(String[] args) {
        /*
        
        Eloborar un algoritmo que permita ingresar 20 numeros y muestre todos los numeros 
        menores y iguales a 25
        
         */

        Practica numeros = new Practica();

        numeros.rellenarArray();
        numeros.ImprimirNumeros();
        numeros.validarNumero();

    }

}
