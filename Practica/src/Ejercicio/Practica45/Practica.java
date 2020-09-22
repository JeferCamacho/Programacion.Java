package Ejercicio.Practica45;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practica {

    private List<Integer> numeros = new ArrayList();

    public Practica() {
    }

    public void agragarNumeros(int numero) {

        numeros.add(numero);
    }

    public void visualizarElementos() {

        ListIterator<Integer> numero = numeros.listIterator();

        while (numero.hasNext()) {

            System.out.println("[" + numero.next() + "]");
        }

    }

    public void longitudElementos() {

        System.out.println("Elementos " + "  [" + numeros.size() + "]");

    }

    public static void main(String[] args) {


        /*
        
        Metodo Primario
    
    Realizar un algoritmo que permita ingresar una lista de numeros determinados con el numero <cero> para luego 
    calcular cuantos numeros fueron ingresados
    
         */
        Practica numeros = new Practica();

        numeros.agragarNumeros(555);
        numeros.agragarNumeros(555);
        numeros.agragarNumeros(555);
        numeros.agragarNumeros(555);
        numeros.agragarNumeros(555);
        numeros.agragarNumeros(555);
        numeros.agragarNumeros(555);

        numeros.visualizarElementos();
        numeros.longitudElementos();
    }
}
