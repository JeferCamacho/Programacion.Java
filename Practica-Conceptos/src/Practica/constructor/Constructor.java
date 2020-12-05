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
        
       
     	Principalmente lo que realiza es dar un estado inicial a las variables en cual lo que realiza es llevar un control de los atributos en cual restringe para que atributo   especifico del parametro  cumpla con el tipo de dato en cual cuando se realiza la instancia del objeto como argumento es principal enterder que el reconoce el argumento y da un estado inicial al parametro lo que se consigue es tener un estado inicial de las varible. 
        
        //FUNCIONAMIENTO SI NO SE UTLIRA
               
	Principalmente no se implementara el constructor no se le podria dar un estado a los atributos del objeto donde ya se podria crear el objeto de instancia de la clase.
        
        //
        
        
        
         */
    }
}
