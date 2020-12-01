package Implementacion.Clase.Generica;

public class mainImplements {

    public static void main(String[] args) {

        /* Principamente la clase generica <implemenst> lo que realiza es poder que reciba especifimente cualquier
           tipo de dato en cual podemos convertir la clase multitipo de dato en cual podemos recibir cualquier tipo
           de dato 
           
         */
        //String
        Implemest<String> objString = new Implemest<String>("hola");

        /*
        
        Principalemente se adapta al tipo de dato en cual instanciamos
        
         */
        System.out.println(objString.getDato());
        //Integer
        Implemest<Integer> objInteger = new Implemest<>(3);

        System.out.println(objInteger.getDato());

        //Double
        Implemest<Double> objDouble = new Implemest<>(785.0);

        System.out.println(objDouble.getDato());

        //Object
        Implemest<Object> objObject = new Implemest<>(45.0);

    }

}
