package Practica.metodoBurbuja;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

    private int numeros;
    private int aux;

    //OJO CUANDO SE REALIZA UN COMPORTAMIENTO EN UN ARRAY SE UTLIZA UN FOR
    /*
    Pricipalmente se realiza la inicializacion del array  para poder almacenar en cada una de la posiciones del array
    un valor predeterminado 
    
     */
    private int[] array = new int[20];// 20 va ser las posiciones en cual se van poder guardar numeros 

    /*
    Cuando se incorpora la informacion al array se puede realizar de dos maneras 


    La primera forma se realiza para rellenar el array de numeros ramdom en cual va posicion por posicion incorporando 
    un numero
     */
    public void rellenarArrayRamdom() {

        for (int i = 0; i < array.length; i++) {

            /*
   EL for reliza el relleno de cada una de la posiciones en cual el iterrador i++ llevo el control de las posiciones 
            
            
    0++          array[1]=  //Numeros ramdom === numero
    1++          array[2]=  //Numeros ramdom === numero
    2++          array[3]=  //Numeros ramdom === numero
    3++          array[4]=  //Numeros ramdom === numero
    4++          array[5]=  //Numeros ramdom === numero
    5++          array[6]=  //Numeros ramdom === numero
    6++          array[7]=  //Numeros ramdom === numero
    7++          array[8]=  //Numeros ramdom === numero
    8++          array[9]=  //Numeros ramdom === numero
    9++          array[10]=  //Numeros ramdom === numero
            
             */
            array[i] = (int) Math.round(Math.random() * 100);

        }

    }

    public void rellenarArrayTeclado() {

        for (int i = 0; i < array.length; i++) {

            /*
   EL for reliza el relleno de cada una de la posiciones en cual el iterrador i++ llevo el control de las posiciones 
            
            
    0++          array[1]=  //Numero Teclado
    1++          array[2]=  //Numero Teclado
    2++          array[3]=  //Numero Teclado
    3++          array[4]=  //Numero Teclado
    4++          array[5]=  //Numero Teclado
    5++          array[6]=  //Numero Teclado
    6++          array[7]=  //Numero Teclado
    7++          array[8]=  //Numero Teclado
    8++          array[9]=  //Numero Teclado
    9++          array[10]=  //Numero Teclado            
             */
            array[i] = numeros = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMEROS"));

        }
    }

    /*
    Para generar un comportamiento al array se utiliza un FOR para que recora el array() y poder realizar
     */
    public void OrganizarCreciente() {

        for (int i = 0; i < (array.length - 1); i++) {

            /*
            Este proceso que realiza el FOR primeria es poder recorer la longitud del array
            
             */
            for (int j = 0; j < (array.length); j++) {

                /*
                
            Este proceso de que realiza el FOR secundario es validar la POSICIONACTUAL si el mayor a la POSICIONSIGUIENTE 
            y son mayores se relializa el cambio de posiciones    
                
                 */
                if (array[i] > array[i + 1]) {

                    //La varible aux principalmente guarda la POSICIONACTUAL en cual se pierde despues al asignarle la posicion siguiente  
                    aux = array[i];

                    //Realizamos el cambio de la POSICIONSIGUIENTE  a la POSICIONACTUAL si al validar se evidencia que es mayor 
                    array[i] = array[i + 1];

                    /*Se realiza el cambio siguiente de la POSICIONACTUAL a la POSICIONSIGUIENTE  en cual AUX  guardo en la variable  que se 
    perdion en el proceso de la asignacion de la posicion SIGUIENTE
                    
                     */
                    array[i + 1] = aux;

                }

            }

        }

    }

    /*
    Este metodo se orgamiza de manera decreciente en cual va desde la ultima posicion imprimiendo
    
     */
    public void organizarDecreciente() {

        for (int i = (array.length - 1); i >= 0; i++) {

            System.out.println("[" + (i + 1) + "]" + array[i]);

        }

    }

    public void imprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);
            /*
        
        Este metodo va a imprimir posicion por posiccion en cual se encuentran en el array
        
        
        
        
    0++          array[1]=  //Numero Teclado
    1++          array[2]=  //Numero Teclado
    2++          array[3]=  //Numero Teclado
    3++          array[4]=  //Numero Teclado
    4++          array[5]=  //Numero Teclado
    5++          array[6]=  //Numero Teclado
    6++          array[7]=  //Numero Teclado
    7++          array[8]=  //Numero Teclado
    8++          array[9]=  //Numero Teclado
    9++          array[10]=  //Numero Teclado    
             */

        }

    }

    public static void main(String[] args) {

        /*
        Pricipalmente el metodo burbuja va realizando el proceso de ir comparadando cada (La posion actual si es > a la posicion 
        siguiente y al validar  se que es valido se relializa el intercambio de las posiciones )
         */
    }

}
