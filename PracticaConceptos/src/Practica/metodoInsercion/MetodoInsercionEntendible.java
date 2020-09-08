package Practica.metodoInsercion;

public class MetodoInsercionEntendible {

    private int[] array = new int[9];
    
    
    private   int[] nombre={ 1,2,};

    private int j;
    private int aux;

    public void rellenoArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);

            /*
    0++          array[0]=  //Numeros ramdom === numero
    1++          array[1]=  //Numeros ramdom === numero
    2++          array[2]=  //Numeros ramdom === numero
    3++          array[3]=  //Numeros ramdom === numero
    4++          array[4]=  //Numeros ramdom === numero
    5++          array[5]=  //Numeros ramdom === numero
    6++          array[6]=  //Numeros ramdom === numero
    7++          array[7]=  //Numeros ramdom === numero
    8++          array[8]=  //Numeros ramdom === numero
    9++          array[9]=  //Numeros ramdom === numero
            
             */
        }

    }

    public void imprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i) + "]  " + array[i]);

        }

    }

    /*
     
    private int [] array=new int[9];
    private float [] array1= new float[tamaño];
    private double [] array2= new double[tamaño];
    private char [] array3= new char[tamaño];
    private String [] array4= new String[tamaño];
   
    
   
    | 0   |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8   | 
    ----- - --- - --- - --- - --- - --- - --- - --- - ---- -  Puede almcenar informacion alfanumerica numeros y palabras 
    | 10  | 20  | 45  |  2  |  45 | 78  | 45  |  1  |  74  |
    
    
     */
    public void metodoInsercionSecundario() {

        for (int i = 1; i < array.length; i++) {

            /*
            Guardamos la  posicion 1 del numero 5     3 [5] 4 1 2  principalmente porque cuando se realiza la validacion 
            de  NUMEROACTUAL si el mayor a NUMEROIZQUIERDA  el numero 3 no realiza la validacion respectiva no tiene numero
            con quien validar en cual cuando lo colocamos en la poscion siquiente [5] se visualiza que puede realizar la 
            validacion con el numero [3]
             */
            aux = array[i];

            j = i - 1;  // empezamos a comprobar con el anterior es la posicion anterior al numero actual;

            while ((j >= 0) && (aux < array[j])) { // mientras queden posiciones y el                                
                // valor de aux sea menor que los
                array[j + 1] = array[j];   // de la izquierda, se desplaza a la derecha
                j--;
            }

            array[j + 1] = aux;       // colocamos aux en su sitio 

        }

    }

    public void imprimirMetodo() {

        System.out.println("Metodo de insercion");

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }
    }

    public static void main(String[] args) {

        MetodoInsercionEntendible metodoinsercionentendible = new MetodoInsercionEntendible();

        metodoinsercionentendible.rellenoArray();
        metodoinsercionentendible.imprimirArray();
        metodoinsercionentendible.metodoInsercionSecundario();
        metodoinsercionentendible.imprimirMetodo();

    }

}

