package Ejercicio.Practica45;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practica {

    private int[] list = new int[320];

    public void incorporarNumeros() {

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) Math.round(Math.random() * 100);

        }

    }

    public void visualizarElementos() {

        for (int i = 0; i < list.length; i++) {

            System.out.println("[" + (i + 1) + "]" + list[i]);
        }

    }

    public static void main(String[] args) {


        /*
        
        Metodo Primario
    
    Realizar un algoritmo que permita ingresar una lista de numeros determinados con el numero <cero> para luego 
    calcular cuantos numeros fueron ingresados
    
         */
        Practica numeros = new Practica();

        numeros.incorporarNumeros();
        numeros.visualizarElementos();

    }
}
