package Practica.constructor;


/*
Principalmente lo que realiza es poder utizar los atributos y metodos de la clase


 */
public class ConstructoSubClase extends ConstructorHerenciaSuperClase {

    /*
    
    
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
