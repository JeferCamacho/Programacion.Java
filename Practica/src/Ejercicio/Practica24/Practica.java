package Ejercicio.Practica24;

import java.util.Scanner;

public class Practica {

    private int numero;
    private int exponente;
    private int exp;

    public Practica() {

        numero = 0;
        exponente = 0;

    }

    public Practica(int numero, int exponente) {
        this.numero = numero;
        this.exponente = exponente;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public int getExp() {
        return exp;
    }

    public void numeroExponente() {

        exp = (int) Math.pow(numero, exponente);

        int resultado = (int) Math.pow(numero, exponente);

        System.out.println(numero + " elevado a la " + exponente + " es igual a " + resultado);

    }

    public static void main(String[] args) {

        /*
    
   Mostrar  las 30 primeras potencia de 3  y la suma de ellos
    
         */
        Practica exponente = new Practica(5, 4);

        exponente.numeroExponente();

    }

}
