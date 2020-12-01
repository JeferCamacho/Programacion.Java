package Ejercicio.Practica16;

public class Practica {

    private int cont1;
    private int cont2;
    private int cont3;

    public Practica() {
        cont1 = 0;
        cont2 = 0;
        cont2 = 0;
    }

    private double [] array = new double[10];

    public int getCont1() {
        return cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public int getCont3() {
        return cont3;
    }

    public void rellarArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 30);

        }

    }

    public void imprimirNumeros() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]" + "Numero" + "[" + array[i] + "]");

        }

    }

    public void compacionNumeros() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 9.99) {

                cont1++;
            } else if (array[i] == 10.5) {

                cont2++;

            } else if (array[i] > 10.5) {

                cont3++;

            }
        }

    }

    public static void main(String[] args) {
        /////////////////////////////////////EJERCICIO///////////////////////////
        /*
        De una lista de numeros calcular  la media 
        
        -Determinar cuantos son mayores que 10.5
        - Cuantos son iguales que 10.5
        - Cuantos son menore
        
        
         */

        ///////////////////////////////////////////////////////////////////////
        Practica numeros = new Practica();

        numeros.rellarArray();
        numeros.imprimirNumeros();
        numeros.compacionNumeros();
        System.out.println("Numeros menores a 10.5   " + "[" + numeros.getCont1() + "]");
        System.out.println("Numeros igual a 10.5  " + "[" + numeros.getCont2() + "]");
        System.out.println("Numeros mayores a 10.5   " + "[" + numeros.getCont3() + "]");

    }

}
