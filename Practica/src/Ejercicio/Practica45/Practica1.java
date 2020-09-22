package Ejercicio.Practica45;

public class Practica1 {

    private int[] numeros = new int[30];
    private int contador;

    public Practica1() {
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void ingresarNumeros() {

        for (int i = 0; i < (numeros.length - 1); i++) {

            numeros[i] = (int) Math.round(Math.random() * 100);
            contador++;

        }

    }

    public void visualizarElementos() {

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("[" + (i + 1) + "]" + "=" + "[" + numeros[i] + "]");

        }

    }

    public static void main(String[] args) {

        /*
        
        Metodo secundario
        
        
        Realizar una algoritmo que permita ingresar una lista de numeros y determinados con el numero <cero> para
        luego calcular cuantos fueron ingresados 
        
         */
        Practica1 numeros = new Practica1();

        numeros.ingresarNumeros();
        numeros.visualizarElementos();
        System.out.println("Elementos" + "[" + numeros.getContador() + "]");

    }

}
