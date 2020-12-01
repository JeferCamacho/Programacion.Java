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
    List<String> actores;
    Set<Integer> numeros;

    public LinkenListExplicacion() {

        actores = new LinkedList();
        numeros = new HashSet();

    }

    public void addActor(String actor) {

        actores.add(actor);

    }

    public void addNumeros(int numero) {

        numeros.add(numero);

    }

    public void visualizarElementosNombres() {

        ListIterator<String> actoresIterator = actores.listIterator();

        while (actoresIterator.hasNext()) {

            System.out.println(actoresIterator.next());

        }

    }

    public void visualizarElementosNumeros() {

        Iterator<Integer> numerosIterator = numeros.iterator();

        while (numerosIterator.hasNext()) {

            System.out.println(numerosIterator.next());
  
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.numeros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LinkenListExplicacion other = (LinkenListExplicacion) obj;
        if (!Objects.equals(this.numeros, other.numeros)) {
            return false;
        }
        return true;
    }

    
    
    
    public void validar(String nombre) {

        if (actores.contains(nombre)) {

            System.out.println("[" + "Encontrado" + "]");

        } else {

            System.out.println("No encontrado");

        }

    }

    public static void main(String[] args) {

        LinkenListExplicacion prueba = new LinkenListExplicacion();

        prueba.addNumeros(1212);
        prueba.addNumeros(1212);
        prueba.addNumeros(1212);
        prueba.addNumeros(1212);
        prueba.addNumeros(1212);

        prueba.visualizarElementosNumeros();

        prueba.addActor("Jefersson");
        prueba.addActor("Rodriguez");
        prueba.addActor("Camacho");

        prueba.visualizarElementosNombres();

    }

}
