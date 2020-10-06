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

    /*
    Principalmente el constructor se llama automaticamente < SIEMPRE > que se deracle ese objeto de esa clase
    y sirve para asegurarnos que los objetos siempre contengan los valores validos
    
    
     */
    
    
    public static void main(String[] args) {
        
        /*
        
        Cuando instanciamos un objeto < NEW > lo que realiza que llama al constructor por defecto en cual vamos 
        a inicializar los atributos; El constructor regula que tipos de datos especificado en los atributos 
        sean los argumetos instanciadoa de la clase
        
        */
        
        
    }
    
    
}
