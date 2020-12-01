package Practica.metodoInsercion;

public class MetodoInsercion {

    private int[] array = new int[10];
    private int aux;
    private int pos;

    /*
 
    si 
    
    numeroIzquierda > numeroActual
    
            CAMBIA
    
    3 5 4 1 2 
    
    
    
    
     */
    public void numerosRamdon() {

        /*
        
        Metodo para rellenar el array de numeros 
         */
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);
        }

    }

    public void imprimirNumeros() {

        System.out.println("Numeros ramdon");

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }

        System.out.println("//////////////////////////////////////////////////////////////////");
    }

    public void organizarCreciente() {

        for (int i = 0; i < array.length; i++) {

            /*
        Pricipalmente POS es la posicion donde inicia el array     
            
            
             */
            pos = i;

            /*
    Se le asigna el valor de la podicion NUMEROACTUAL porque al reasignale el valor de la POSICIONIZQUIERDA se pierde el valor
            
             */
            aux = array[i];

            /*
        
            Principalmente la primera validacion (pos > 0) porque el primer  numero [3] 5 4 1 2 no tiene con quien validar
            en cual se realiza eso para poder colocarlo en la segunda posicion 3 [5] 4 1 2  y realizar la comparacion 
            
            La segunda validacion (array[pos - 1] > aux) es para determinar si la POSICIONACTUAL es mayor a la POSICIONIZQUIERDA
            y realizar el cambio    
            
            
            
             */
            while ((pos > 0) && (array[pos - 1] > aux)) {

                /*
            Ralizamos el cambio de las posicion  de la POSICIONIZQUIERDA a la POSICIONACTUAL   
                
                 */
                array[pos] = array[pos - 1];
                /*
                
            pos--; Se realiza para haga la comparacion  sentido IZQUIERDO hata que el Numero quede en su posicion
            correspodiente 
                 */

                pos--;

            }

            /*
            
            Realizamos el cambio de las posicion  de POSICIONACTUAL a la POSICIONIZQUIERDA
            
             */
            array[pos] = aux;

        }

    }

    /*
    Imprimimos cada posicion del array organizado 
    
     */
    public void imprimirArray() {

        System.out.println("Numeros organizados de manera creciente ");
        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]" + array[i]);
        }
        System.out.println("////////////////////////////////////////////");
    }

    public static void main(String[] args) {

        MetodoInsercion metodoinsercion = new MetodoInsercion();

        metodoinsercion.numerosRamdon();
        metodoinsercion.imprimirArray();
        metodoinsercion.organizarCreciente();
        metodoinsercion.imprimirArray();

    }

}
