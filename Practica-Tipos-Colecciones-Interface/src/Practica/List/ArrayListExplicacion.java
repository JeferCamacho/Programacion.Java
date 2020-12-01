package Practica.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class ArrayListExplicacion {

    /*
    
    Principalmete esta <Interfaz> 
    
        * Acceso aleatorio
        * Estan ordenadas (Colection.sort()).
        * Añadir / eliminar facilmente 
        * ListIterador se modifica en cualquier direccion 
        * Sintaxis similar a arrays

    
                __  ______  __
               |__||_Dato_||__| ↺
                __  ______  __
            ↻  |__||_Dato_||__| 
                __  ______  __
               |__||_Dato_||__| ↺
                __  ______  __
            ↻  |__||_Dato_||__| 
                __  ______  __
               |__||_Dato_||__| ↺
                __  ______  __
            ↻  |__||_Dato_||__| 
    
    
    El proceso  que realiza <ArrayList> en el consumo de recursos no es tan eficiente en cual al realizar 
    una eliminacion de un elemento no es tan eficiente
    
                
                __  ______  __
               |__||_Dato_||__| ↺
                __  ______  __
            ↻  |__||_Dato_||__| 
               
                                ↺
                __  ______  __
            ↻  |__||_Dato_||__| 
                __  ______  __
               |__||_Dato_||__| ↺
                __  ______  __
            ↻  |__||_Dato_||__|
    
    
    Se realiza la eliminacion de un elemento donde se  reliza un consumo mayor. Tiene que mover todos 
    los elementos que se encuentran en la parte inferior colocandolos en la posicion del elemento eliminado
    este proceso que reliza consume mucho recursos donde hay otras <Interface> que lo relizarian mas eficiente.
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////
    
    ///////////LISTA QUE PUEDE ALMACENAR CUALQUIER TIPO DE DATO 
    
    
    
    //ESTRUCTURA
    
    
    
    
    List +  nombre +  =  +  new + ArrayList();
    
    //IMPLEMENTACION    
    
    List listaTipoDeDato= new ArrayList();
    
    
    //////////////////////////////////////////////////////////////////////////////
    
     
    ///////////LISTA DE TIPO DE DATO STRING
    
    //ESTRUCTURA PRINCIPAL
    
    List<TIPO DE DATO > + nombre + = + new + ArrayList();
    
    
    //ESTRUCTURA SECUNDARIA
    
    ArrayList<TIPO DE DATO > nombre = new ArrayList<TIPO DE DATO>();
    
    
    //IMPLEMENTACION PRINCIPAL 
    
    List<Strin>  listanombre= new ArrayList();
    
    
       
    /////////////////////////////////////////////////////////////////////////////
    
    
    //////////LISTA DE TIPO DE DATO INT
    
    
    //ESTRUCTURA
   
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
    
    //IMPLEMENTACION
    
    list<Integer> numeros= new ArrayList();
    
    
    
    
    
    /////////////////////////////////////////////////////////////////////////////
    
    
    ////////////AGREGAR UN ELEMENTO AL ARRAYLIST
    
    
    //ESTRUCTURA
    
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
    
    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }

    
    
    nombre de la instancia del OBJETO.add(INFORMACION RESPECTO AL TIPO DE DATO);
    
    
    //IMPLEMENTACION
    
    nombre.add(TIPO DE DATO);
    
    
    
    
    /////////////////////////////////////////////////////////////////////////////
    
    
    ////////////ELIMINAR UN ELEMENTO DEL ARRAY
    
    //ESTRUCTURA
    
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }

    
    
    nombre.+ remove+ (POSICION DEL ARRAY);
    
    //IMPLEMENTACION 
    
    
    nombre.remove(1);
    

    /////////////////////////////////////////////////////////////////////////////
    
    ////////////METODO PARA VISUALIZAR LA LONGITUD DEL ARRAYLIST
    
    //ESTRUCTURA 

    List<TIPO DE DATO>  + nombre + = + new + ArrayList();

    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }


    
    
    nombre.size();
    
    
    /////////////////////////////////////////////////////////////////////////////
    
    /////////////VISUALIZAR EL ARRAYLIST 
    
    
    //ESTRUCTURA
    
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }


    
    * nombre >= Nombre del arrayList 
    
    * size() >= Longitud del arrayList para poder recorer el array desde su posicion inial a su posicion final
    
    * int i = 0 >= inicia en la primera posicion
    
    * i++ >= Incrementa en 1 en 1
    
    * System.out.println(listNombre.get(i)) >= Imprime la posicion por posicion 
    
    * listNombres.get(i) - 1  >= Se puede visualizar los datos que se encuentra en cada posicion 
    
    * - 1 >= Cuando estamos recoriendo el arraylist no es necesario recorerlo toda la longitud que es de 5 en cual 
      al arraylist visual el numero interpreta que debe comenzar en la posicion inicial es 0 y va esta la posicion 
      final que es 4 en donde el numero cinco iria hasta el cuatro por ese detalle no es necesario recorer toda la 
      longitud porque estariamos recorriendo una posicion de mas.
    
    
    
    //IMPRIMIR TODO EL ARRAYLIST
        for (int i = 0; i <= nombre.size() - 1; i++) {

            System.out.println(listNombres.get(i));

        }

    
    //IMPRIMIR UNA POSICION DEL ARRAYLIST
    
        for (int i = 0; i <= nombre.size() - 1; i++) {

            System.out.println(listNombres.get(POSICION DEL ARRAYLIST));

        }

    
    
    ////////////////////////////////////////////////////////////////////////////
    
  
    /////////////METODO PARA RECORER Y IMPRIMIRLO ITERATOR
    
    
    //ESTRUCTURA
    
    
    Iterator<TIPO DE DATO DEL ARRAY LIST O OBJETO DE UNA CLASE> +  nombre = NOMBRE DEL ARRAYLIST + . iterator();
    

    
    
   
    *hasNext >=  Devuelve true si aún quedan elementos por recorrer y false en caso contrario.
    
    *next() >= La primera vez que se le llama devuelve el primer elemento. En cada llamada posterior
    devuelve el siguiente elemento del recorrido. Este método tiene como precondición que hasNext()
    devuelva true. Si no se cumple la precondición, entonces elevará la excepción NoSuchElementException.  
    
        
    
            while(NOMBRE DEL ARRAYLIST+ .hasNext()){
    
                 System.out.Println( NOMBRE DEL ARRAYLIST + . next());
    
             }
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    ///////////////SABER LA POSICION DE UN ELEMENTO
    
    //ESTRUCURA 
    
    
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }

    
    
    System.out.Println( nombre + .indexOF(POSICION A VISUALIZAR));
    
    
    
    
    
    /////////////////////////////////////////////////////////////////////////////
    
    
    ///////////////ELIMINA TODOS LOS ELEMENTOS DEL ARRAY
    
    //ESTRUCTURA
    
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }

    
    nombre  + . + clear();
    
    //IMPLEMENTACION
    
    
    nombre.clear();
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    //////////////METODO QUE INDICA SI EL ARRAY ESTA VACIO O NO 
    
    
    //ESTRUCTURA
    
    List<TIPO DE DATO>  + nombre + = + new + ArrayList();
    
   
    
    public void ingresarDatosArrayList() {

        nombre.add("Jefersson");
        nombre.add("Camacho");
        nombre.add("Rodriguez");

    }

    
    nombre.isEmpty();
    
    
    
    
    
    
    
    
    
     */
    private List<String> nombres = new ArrayList();

    public void ingresarNumeros() {

        nombres.add("jefersson");
        nombres.add("jefersson");
    }

    public void imprimir() {

        System.out.println(nombres.size());

    }

    public void imprimirArrayFor() {

        for (int i = 0; i < nombres.size() - 1; i++) {

            System.out.println(nombres.get(i));

        }

    }

    public void imprimirArrayIterator() {

        Iterator<String> nombre = nombres.iterator();

        while (nombre.hasNext()) {

            System.out.println(nombre.next());
        }

    }

    public static void main(String[] args) {

        ArrayListExplicacion nombre = new ArrayListExplicacion();

        nombre.ingresarNumeros();
        nombre.imprimirArrayFor();
        nombre.imprimirArrayIterator();
        nombre.imprimir();

    }

}
