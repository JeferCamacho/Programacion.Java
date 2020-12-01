package com.Clase.Abstracta;

public class Main {

    public static void main(String[] args) {

        /*
        
        Cuando se realiza una clase abstracta no se puede crear objetos si no que utliza el objeto de la
        misma clase para poder realizar  las instancias de las SUBCLASES con solo un objeto  
        
         */
        //Polimorfirmo en accion estamos 
        SuperclaseAnimal animal = new Perro();

        animal.alimentar();

        ////////////////////////////////////////////
        SuperclaseAnimal animalAero = new Ave();

        animalAero.alimentar();

        /////////////////////////////////////////////
        SuperclaseAnimal animalAcuatico = new pez();

        animalAcuatico.alimentar();

    }

}
