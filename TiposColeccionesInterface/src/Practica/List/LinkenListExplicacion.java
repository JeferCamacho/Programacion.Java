package Practica.List;

import java.util.LinkedList;
import java.util.*;

public class LinkenListExplicacion {

    /*
    <LinkenList> pertenece a la colleccion de <List> donde comparte los metodos con los que heredan de list     
    
    
    Principamente es una lista eficiente en proceso de agragar y eliminar 
    
                __  ______  __
               |__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __ 
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|


    El proceso que reliza <LinkenList> en eliminar un elemento es eficiente.


                           __  ______  __
               |__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   
            →→                 →→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|→→⤵
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
            →→|__||_Dato_||__|
                 
    
    El sistema de <LinkenList> es llamado <Nodos> donde cada nodo esta enlazado con el siguiente. En el proceso de 
    eliminar un elemento hace actulizacion de los enlaces de los nodos con el siguiente nodo que fue eliminado 
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    ////////////////LISTITERATOR
    
 
    Principamente es mas eficiente procesos de recorer el la list en cual nos brindan o gran utiilidad en recorer 
    las posiciones donde nos permite recorar hay adelante y hacia atras y pararme una posicion indicada
    
    
                  LISTITERATOR
    
                __  ______  __
    ↓           |__||_Dato_||__|→→⤵     ↑
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
    ↓        →→|__||_Dato_||__|→→⤵     ↑
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
    ↓        →→|__||_Dato_||__|→→⤵     ↑ Puedo recorerlo hacia adelante y hacia atras y puedo ir a una posicion indicada
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __ 
    ↓        →→|__||_Dato_||__|→→⤵     ↑
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
    ↓        →→|__||_Dato_||__|→→⤵     ↑
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
    ↓        →→|__||_Dato_||__|→→⤵     ↑
            ↓←←←←←←←←←←←←←←↩
            ↓   __  ______  __
    ↓        →→|__||_Dato_||__|         ↑

    
    
    
    
     */
    List<String> nombre = new LinkedList();

    public void ingresarInformacion() {

        nombre.add("Jefersson");
        nombre.add("hola");
        nombre.add("Jefersson");
        nombre.add("Jefersson");
        nombre.add("Jefersson");
        nombre.add("Jefersson");

    }

    public void visualizarElementos() {

        ListIterator<String> nombres = nombre.listIterator();

        System.out.println(nombres.next());

    }

    public static void main(String[] args) {

        LinkenListExplicacion prueba = new LinkenListExplicacion();

        prueba.ingresarInformacion();
        prueba.visualizarElementos();

    }

}
