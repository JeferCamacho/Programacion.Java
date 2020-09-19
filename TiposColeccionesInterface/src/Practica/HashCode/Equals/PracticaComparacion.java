package Practica.HashCode.Equals;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class PracticaComparacion {

    /*
    
    Principamente <HashCode> <Equals> se raaliza para coleccion que no admiten elemetos iguales con cual noa ayuda 
    en el proceso de identificar 
    
    
    
    //FORMA DE ASIGNAR EN LA MEMORIA UNA VARIABLE
    
    
    <Stack> Cuando realizamos una expresion < x = 4>
     
    ------------------------ 
    |  ...................  |
    | |        z          | |  
    |  ...................  |                            
    | |                   | |                         
    | |        5          | | Se reserva un espacio en el cual no denominamos z se almacena el numero 5                         
    | |                   | |                         
    |  ...................  |                         
    |                       |                         
    |                       |                         
    |                       |                         
    |                       |                         
    |                       |                         
    |                       |                         
    -------------------------    
    
    //FORMA ASIGANAR EN LA MEMORIA UN OBJETO DE INSTACIA DE LA CLASE
    
    Principamente este es el proceso cuando se instancia un objeto de la clase Libro libro1= < new Libro(); > 
    cuando lee la instruccion  < new Libro(); > accede  a la memoria del ordenador pero no a la misma de la 
    anterior si no a la < Heap > cuando es un objeto lo que hace es reservar un espacio para los objetos de 
    tipo y luego lee esta instrucion <Libro libro1> donde realiza una referencia de enlace y la coloca en el 
    <Stank> para realizar una vinculacion hacia el objeto ya instaciado 
    
    
    Libro libro1= new Libro();
    Libro libro2= new Libro();
    Libro libro3= new Libro();
    
    
    <Stack>                     <Heap>
    ------------------------ -------------------------
    |  ...................  |  ...................... |
    | | libro1            | | |                      ||
    | |...................|.|.| Objeto Libro         ||
    | | Referecia         | | |                      ||
    |  ...................  |  ...................... | 
    |  ...................  |  ...................... |
    | | libro2            | | |                      ||
    | |...................|.|.| Objeto Libro         ||
    | | Referecia         | | |                      ||
    |  ...................  |  ...................... | 
    |  ...................  |  ...................... |
    | | libro3            | | |                      ||
    | |...................|.|.| Objeto Libro         ||
    | | Referecia         | | |                      ||
    |  ...................  |  ...................... | 
    |                       |                         |
    |                       |                         |
    --------------------------------------------------
    





    //Hashcode 
    
    Hace referencia a la localizacion del objeto que temenos almencenados en la memoria < Head > en cual le asigna 
    un numero bastante largo 
    
    
        <Stack>                     <Heap>
    ------------------------ -------------------------
    |  ...................  |  ...................... |
    | | libro1            | | |                      ||
    | |...................|.|.| Objeto Libro         ||..........< Hubicacion > = (64654654654);
    | | Referecia         | | |                      ||
    |  ...................  |  ...................... | 
    |  ...................  |  ...................... |
    | | libro2            | | |                      ||
    | |...................|.|.| Objeto Libro         ||..........< Hubicacion > = (2655646546546);
    | | Referecia         |   |                      ||
    |  ...................  |  ...................... | 
    |  ...................  |  ...................... |
    | | libro3            | | |                      ||
    | |...................|.|.| Objeto Libro         ||..........< Hubicacion > = (565465456456456);
    | | Referecia         | | |                      ||
    |  ...................  |  ...................... | 
    |                       |                         |
    |                       |                         |
    --------------------------------------------------

     */
    List<String> nombre;

    public PracticaComparacion() {
        nombre = new LinkedList();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
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
        final PracticaComparacion other = (PracticaComparacion) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public void addNumero(String nombres) {

        nombre.add(nombres);

    }

    public void imprimirElementos() {

        ListIterator<String> numero = nombre.listIterator();

        while (numero.hasNext()) {

            System.out.println(numero.next());

        }

    }

    public static void main(String[] args) {

        PracticaComparacion prueba = new PracticaComparacion();

        prueba.addNumero("Jefersson");
        prueba.addNumero("efersson");

        prueba.imprimirElementos();

    }

}
