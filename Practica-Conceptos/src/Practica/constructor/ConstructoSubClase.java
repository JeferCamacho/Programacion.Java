package Practica.constructor;


/*
Principalmente lo que realiza es poder utizar los atributos y metodos de la clase


 */
public class ConstructoSubClase extends ConstructorHerenciaSuperClase {

    /*

    Principamente Se realiza la reutilizacion de codigo en cual podemos hacer uso de los 
    < Atributos e Metodos > los que se realiza es cuando se instancia el objeto se realiza 
    el llamado del constructor y utilizamos el constructor de la < SUPERCLASE> donde podemos 
    instanciar el objetos con el tipo de dato especifico  en donde podemos hacer el modelo del 
    objeto
   

    
    
     */
    public ConstructoSubClase(int edad, String nombre, String univerdad, char sexo) {
        super(edad, nombre, univerdad, sexo);
    }

    public static void main(String[] args) {

        
        
        
        ConstructoSubClase herenciaCostructor = new ConstructoSubClase(45, "Jefersson", "Nacional", 'm');

        herenciaCostructor.hola();
        System.out.println(herenciaCostructor);

    }

}
