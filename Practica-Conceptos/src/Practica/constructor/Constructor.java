package Practica.constructor;

public class Constructor {

    /*
    Estos son los atributos de mi objeto en cual recojemos datos para construir la instacia de mi objeto
    
     */
    private int edad;
    private String nombre;
    private String carrera;

    public Constructor() {
    }

    public Constructor(int edad, String nombre, String carrera) {
        this.edad = edad;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public static void main(String[] args) {

        /*
        
        
        //ESTRUCTURA
        
        Principalmente se puede inicializar el atributos con el tipo de dato especificado
        
        
        
         */
        Constructor prueba = new Constructor(4, "Jefersson", "En creacion");

        /*
        
        //FUNCIONAMIENTO
        
        
        Cuando nosotros instanciamos un objeto principalmente el que regula que los argumetos ingresados en la 
        instancia del objeto sean los que especificamos en el atributo
        
        Cuando instanciamos un objeto < NEW > lo que realiza que llama al constructor por defecto en cual vamos 
        a inicializar los atributos; El constructor regula que tipos de datos especificado en los atributos 
        sean los argumetos instanciadoa de la clase
        
        
        //FUNCIONAMIENTO SI NO SE UTLIRA
        
        Prinicapalmente si no se utlizara el < CONSTRUCTOR > en instancia del objeto pudieramos incorporar el  
        tipo de dato no indicado del atributo y no llevarimos el control y no se podria hacer la inicializacion
        de los atributos
        
        
        //
        
        
        
         */
    }

}
