package Practica.Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListiterator {

    List<String> nombre = new LinkedList();

    public void agregarElementos() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");
        nombre.add("Programacion");

    }

    public void recorrerColeccionIterator() {

        Iterator<String> nombres = nombre.iterator();
        System.out.println("[" + "Metodo Iterator" + "]");

        while (nombres.hasNext()) {

            System.out.println(nombres.next());

        }
    }

    public void recorrerColeccionListIterator() {

        ListIterator<String> nombres = nombre.listIterator();
        System.out.println("[" + "Metodo ListIterator" + "]");

        while (nombres.hasNext()) {

            System.out.println(nombres.next());
            
            nombre.add("soy lucas");
        }

    }

    public static void main(String[] args) {

        IteratorVsListiterator diferencia = new IteratorVsListiterator();

        diferencia.agregarElementos();
        diferencia.recorrerColeccionIterator();
        diferencia.recorrerColeccionListIterator();

        /*
        Principalmente <Iterator> y <ListIterator> estan definidos por  <COLLECTION > el paqute <Java.util> abarcan
        y  van por la misma linea la cuestion que <Iterator> recorre los elementos de la coleccion solo en la direccion
        hacia adelante 
        


                  <Iterator>    
                __  ______  __
               |__||_Dato_||__|→→⤵                                    
            ↓←←←←←←←←←←←←←←↩             ↓↓          
            ↓   __  ______  __                      
            →→|__||_Dato_||__|→→⤵             
            ↓←←←←←←←←←←←←←←↩             ↓↓
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵                   Recorre la collecion hacia <Adelante>
            ↓←←←←←←←←←←←←←←↩             ↓↓
            ↓   __  ______  __ 
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩             ↓↓
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩             ↓↓
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩             ↓↓
            ↓   __  ______  __
            →→|__||_Dato_||__|


           
        
                                                    <ListIterator>    
                                                  __  ______  __
                                                 |__||_Dato_||__|→→⤵                                    
                                ↑↑            ↓←←←←←←←←←←←←←←↩             ↓↓      
                                              ↓   __  ______  __                      
                                              →→|__||_Dato_||__|→→⤵             
                                ↑↑            ↓←←←←←←←←←←←←←←↩             ↓↓
                                              ↓   __  ______  __
                                              →→|__||_Dato_||__|→→⤵                   Recorre la colleccion hacia <Adelante> <Atras>
                                ↑↑            ↓←←←←←←←←←←←←←←↩             ↓↓
                                              ↓   __  ______  __ 
                                              →→|__||_Dato_||__|→→⤵
                                ↑↑            ↓←←←←←←←←←←←←←←↩             ↓↓
                                              ↓   __  ______  __
                                              →→|__||_Dato_||__|→→⤵
                                ↑↑            ↓←←←←←←←←←←←←←←↩             ↓↓
                                              ↓   __  ______  __
                                ↑↑              →→|__||_Dato_||__|→→⤵
                                              ↓←←←←←←←←←←←←←←↩             ↓↓
                                              ↓   __  ______  __
                                ↑↑            →→|__||_Dato_||__|


        La cuestion es que las dos recorren la elementos de la collection pero la gran diferencia esque cada una 
        corre los elementos diferente <Iterator> reccorre en un direccion hacia abajo y <ListIterator> recorre en 
        ambas direcciones tanto hacia <Abajo> <Arriba> en cual brinda un dominio mayor de la collecion
        
        
        
        ///PRINCIPALES DIFERENCIAS FUNCIONALIDADES
        
        
        //BASES DE LA COMPARACION
        
        /BASICO
        
                        <Iterator>                                                      <ListIterator>
    ---------------------------------------------------------------- --------------------------------------       
   |                 | Solo puede atravesar los elemetos             | Puede atravesar los elementos de una |
   | Basico          | de una coleccion  sola en una direccion       | coleccion tanto como hacia adelante  |
   |                 | haacia adelante                               | como hacia atras                     |
    -------------------------------------------------------------------------------------------------------
   |                 | No puede agregar elementos a una coleccion    | Puede agregar elementos a una colecio|
   |Añadir elementos |                                               |                                      |
   |                 |                                               |                                      |
    -------------------------------------------------------------------------------------------------------
   |                 | No puede modificar elementos de una coleccion | Puede modificar un elemento usando   |
   |Modificar        |                                               | set()                                |
   |                 |                                               |                                      |
    -------------------------------------------------------------------------------------------------------
   |                 | No puede eliminar un elemento de una coleccion|                                      |
   |Eliminar         |                                               |                                      |
   |                 |                                               |                                      |
    -------------------------------------------------------------------------------------------------------
   |                 | El iterador puede atravesar Mapa y listas,    | Solo puede atravesar objetos de una  |
   |Atravesar        | conjuntos                                     | lista                                |
   |                 |                                               |                                      |
    -------------------------------------------------------------------------------------------------------
   |                 | No tiene un metodo para obtener un indice del | Pued obtener un indice de un elemento|
   |Indice           | elemeto de una coleccion                      | de una coleccion                     |
   |                 |                                               |                                      |
    -------------------------------------------------------------------------------------------------------
        
     
        
         */
    }

}
