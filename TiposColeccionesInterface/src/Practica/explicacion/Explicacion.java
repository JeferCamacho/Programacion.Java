package Practica.explicacion;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class Explicacion {

    /*
    
    Principalmente son tipo de interface se utlizan de acuerdo especificamente al rendimiento y el funcionamiento
    en cual manejan grandes tipos de cademas de datos a continuacion se ralizara un descripcion 
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    ///////////////////COLLECTION
    
    
    //////////////////////////<LIST> CLASES UTLIZADAS
    
    ///////////////////////////VENTAJAS
    
    
        * Acceso aleatorio
        * Estan ordenadas (Colection.sort()).
        * Añadir / eliminar facilmente 
        * ListIterador se modifica en cualquier direccion 
        * Sintaxis similar a arrays
    
    
    //////////////////////////DESVENTAJAS
    
    
        * Bajo rendimiento en operaciones concretas se resolveria mejor con otros interfaces
    
    
    
    /////////////////////////
    
    
    //ArrayList
    
            * Muy rapido accediendo a los elementos
            * Se adapta a un gran numero de escenarios
    
    //LinkList 
    
            * Lista enlazadas
            * Gran eficiencia en agragar y eliminando elementos
    
    
    //Vector
    
            * Considerado como coleccion obsoleta
    
    
    //CopyOnWriteArrayList
    
    
            * Utlizado en programas concurrentes 
            * Eficiente en operaciones de lectura pero no eficiente en proceso escritura 
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    ///////////////////////<SET> CLASES UTLIZADAS 
    
   
   ////////////////////////VENTAJAS 
    
    
        * No permiten elementos duplicados
        * uso sencillo del metodo add  que ademas no asegura elementos duplicados 
    
    
    //////////////////////DESVENTAJAS
    
        * No tiene acceso aletorio 
        * Poca eficiencia en ordenar elementos < y no siempre se puede >
    
    
    
    //////////////////////
    
    
    //HashSet
    
            * Rapida 
            * No duplicados
            * No ordenacion
            * No acceso aletorio 
    
    //LinkedHashSet
    
            * Orcenacion por entrada
            * Eficiente al acceder
            * No eficiente en agregar 
            
    //TreeSet
    
            * Es ordenado
            * Poco eficiente
    
    //EnumSet
    
            * La mejor para tipos enumerodos
            
    //CopyWriteArraySet 
    
            * Especifico concurrecia
            * Eficiente lectura
            * Poco eficiente escritura
            * Poco eficiente al eliminar
    
    //ConcurretSkitListSet
    
            * Especifico para concurrencia
            * Admite ordenamiento
            * con muchos elementos no es eficiente
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
     ///////////////////////<Queue>
    
     //////////////////////VENTAJAS
    
        * Muy rapido al acceder al primero y ultimo elemento
    
        * permite crear colas de elementos de elementos eficiente <LIFO / FIFO >
    
     ///////////////////////DESVENTAJAS
    
        * Accede lentos a loa elementos intermedios
            
    
     */
    public static void main(String[] args) {

        List<String> pais = new LinkedList();

        pais.add("Colombia");
        pais.add("España");
        pais.add("Mexico");

        List<String> capital = new LinkedList();

        capital.add("Bogota");
        capital.add("Msdrid");
        capital.add("Ciudad de Mexico");

        ListIterator<String> paises = pais.listIterator();
        ListIterator<String> capitales = capital.listIterator();

        while (capitales.hasNext()) {

            if (paises.hasNext()) {

                paises.next();

            }

            paises.add(capitales.next());

        }

        System.out.println(pais + "=");

    }

}
