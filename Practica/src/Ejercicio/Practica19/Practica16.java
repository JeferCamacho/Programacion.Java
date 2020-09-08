package Ejercicio.Practica19;

import java.util.ArrayDeque;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

public class Practica16 {

    private String[] palabras = new String[5];
    private String cadena = "hola mundo";
    private char letras;

    
    
    
    public void organizar() {

    /*
    
        Principalmente se realiza el FOR para poder recorer la palabra en cual lo recoremos de la ultima posicion 
        ( hola mund[o]) a la posicion inicial ([h]ola mundo) 
        
        
        (int i = (cadena.length() - 1); i >= 0; i--)
        
        (iniciamos =[10])   (hasta 1) (--)

        
    */    
        
        
        for (int i = (cadena.length() - 1); i >= 0; i--) {

            
            /*
            letras = cadena.charAt(i);
            
            
            Pincipamente  se realiza porque se interpreta 
            
            */
            
            letras=cadena.charAt(i);

            System.out.print(letras+"");
        }
        System.out.println("\n");
    }

    
    
    
    public static void main(String[] args) {

        /*
    
    Realizar un algoritmo que permita organizar una frase y la descomponga esta   en sus palabras inprimiendolas alreves
    
    
    
         */
        Practica16 frase = new Practica16();

        frase.organizar();

    }

}
