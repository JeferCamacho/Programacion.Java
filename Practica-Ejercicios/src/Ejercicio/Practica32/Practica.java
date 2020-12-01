package Ejercicio.Practica32;

import javax.swing.JOptionPane;

public class Practica {

    private String[] nombres = new String[10];
    private int[] telefono = new int[10];

    public void ingresarElementos() {

        for (int i = 0; i < 10; i++) {

            nombres[i] = JOptionPane.showInputDialog("Ingrese nombres");
            telefono[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese telefono"));

        }

    }

    public void imprimirElementos() {

        for (int i = 0; i < 10; i++) {

            System.out.println(nombres[i]);
            System.out.println(telefono[i]);

        }

    }

    public static void main(String[] args) {

        /*
    
    
    Hacer un programa que permita ingreso de nombres[x], telefono[x] donde x va desde 1 a 100 si se sabe que los 
    usuario aon del departamento de lambayeque, mostrar los que residan en distritos y que posean lineas fijas
    
    
         */
    }
}
