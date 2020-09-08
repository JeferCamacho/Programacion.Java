package Practica.Array;

public class Array {

    private int tamaño;
    private int[] Array = new int[3];
    private float[] Array1 = new float[tamaño];
    private double[] Array2 = new double[tamaño];
    private char[] Array3 = new char[tamaño];
    private String[] Array4 = new String[tamaño];

    /*
    
    Un Array principamente son unas serie de espacios en cual se puede almacenar <Elementos> como numeros y letras
    es importante identificar esto:
   
    
    //MODELO DE ESPACIOS
    
    | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |  9 | 10 |
    ----------------------------------------------
    | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11  |
    
    
    Es importante visualizar que los espacion para almacenar los <Elementos> determinadamente comienzan en la posicion
    <0>
    
    
    //COMPORTAMIENTO A UN ARRAY 
  
    
    Siempre cuando implementa un comportamiento al Array pricipamente los hacemos con un ciclo repetitivo <for> donde
    este tiene el acceso a la informacion con le nombre del Array
        
        for (int i = 0; i < Array.length; i++) {
            
        Cuando se incorpora la palabra del nombre del <Array> tenemos el acceso donde se  va a recorer desde la posicion 
        cero 
   
    
        <int i> = Desde donde va a realizar el recorrido del Array que es la posicion <0>
        <Array.lenth> = Recorre la longitud de la cantidad de posicion que contiene el Array
        <i++> =  Lleva el control de la posiciones en cual va incorporando Elementos
    
    
        
    
        Array [0  <0++> ]=  //ESPACIO para incorporar elementos 
        Array [1  <1++> ]=  //
        Array [2  <2++> ]=  //
        Array [3  <3++> ]=  //
        Array [4  <4++> ]=  //
        Array [5  <5++> ]=  //
        Array [6  <6++> ]=  //
        Array [7  <7++> ]=  //
        Array [8  <8++> ]=  // 
    
    
    
        }
    
    //UTLIZAR CADA ELEMENTOS
    
    
    Utlizamos un ciclo repetivo <for> para ir posicion por posicion para  visualizar los datos

        for (int i = 0; i < Array.length; i++) {
         
        ventor[i];
    
    
        }
        
    


    //FORMA DE BUSCAR UN ELENTO EN EL VECTOR Y VISULIZAR SI ESTA EN LA IISTA
    
    
    
    public void validarNombre() {

        if (encuesta.contains("Jefersson")) {
            System.out.println("encontrado");

        } else {

            System.out.println("No encontrado f");

        }

    }

    
    
     */
    public void ingresarInformacionElementos() {

        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) Math.round(Math.random() * 100);

        }

    }

    public void visualizarElementos() {

        for (int i = 0; i < Array.length; i++) {

            System.out.println("[" + Array[i] + "]");

        }

    }

    public static void main(String[] args) {

        Array explicacion = new Array();

        explicacion.ingresarInformacionElementos();
        explicacion.visualizarElementos();

    }

}
