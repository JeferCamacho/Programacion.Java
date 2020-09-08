package Ejercicio.Practica23;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica {

    private int i;

    private int numeros;
    private int numerosLongitud;
    private int multiplosSuma;

    public int getMultiplosSuma() {
        return multiplosSuma;
    }

    
    /*
    Principamente cuando se realiza la validacion 
    
    
    */
    
    public void numerosMultiplos() {

        numeros = Integer.parseInt(JOptionPane.showInputDialog("De que numero quieres los multiplos"));
        numerosLongitud = Integer.parseInt(JOptionPane.showInputDialog("Hasta que numero quieres la lista"));
    }

    public void multiplos() {

        for (i = 1; i <= numerosLongitud; i++) {

            if (i % numeros == 0) {
                System.out.println("[" + (i + 1) + "]" + i);

                multiplosSuma += i;
                ;

            }

        }

    }

    public static void main(String[] args) {

        /*
        Elaborar un algoritmo que permita ingresar 100 numeros enteros.programa de suma todos los 
        numeros que sean multiplos de 3
        
        
         */
        Practica multiplo = new Practica();

        multiplo.numerosMultiplos();
        multiplo.multiplos();
        System.out.println("Suma de los multiplos de 3  " + "[" + multiplo.getMultiplosSuma() + "]");
    }

}
