
package Ejercicio.Practica17;

import javax.swing.JOptionPane;

public class Practica {

    private int[] array = new int[10];
    private int seguir;
    private int orden;
    private int aux;

    public void rellenarArray() {
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);
        }

    }

    public void organizarCreciente() {

        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - 1); j++) {

                if (array[j] > array[j + 1]) {

                    aux = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = aux;

                }

            }
        }

    }

    public void organizar() {

        do {            
            
  
        orden = Integer.parseInt(JOptionPane.showInputDialog("ordeganizar de manera "
                + "CRECIENTE = 1\n"
                + "DECRECIENTE = 0\n"
        ));

        if (orden == 1) {

            for (int i = 0; i < array.length; i++) {

                System.out.println("["+(i+1)+"]  " + array[i]);
                
            }

        } else {
            
            for (int i = (array.length-1); i >= 0; i--) {
               
                System.out.println("["+(i+1)+"]  " + array[i]);
            }
            
        }

        
        seguir=Integer.parseInt(JOptionPane.showInputDialog("segui -- 1"+
                "No seguii --1"
                                            ));
        
        } while (seguir==1);
    }

    public static void main(String[] args) {

        ////////////////////////////////////////EJERCICIO//////////////////////////////////
        /*
    
    Se desea realizar un algoritmo que realiza las siguiente tarea:
    
    -leer una lista de numeros entero 
    -visualizar dichos numeros
    -El algoritmo debera pedir si yo deseo ordenar de sentido decreciente o creciente (burbuja)
    
    
     
         */
        /////////////////////////////////////////////////////////6////////////////////////////
        
        Practica practica=new Practica();
        
        practica.rellenarArray();
        practica.organizarCreciente();
        practica.organizar();
        
      
        
        
    }

}
