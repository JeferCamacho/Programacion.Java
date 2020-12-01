package Practica.TipoDeIniciacion;

public class MainExplicacionCasting {

    public static void main(String[] args) {


        /*
        
        UpCasting se realiza automaticamente en cual se le implementa a la subclase ser tratada como una 
        superClase 
        
        DownCasting se debe implementar un mecanismo para poder hacerlo en cual es como si fue una instacia
        o una refundicion para poder acceder a sus mismos metodos de la clase en cual se implementa eso para 
        poder tenere le acceso a la clase
        
        
        
        
        
        
         */
        //OjO solo se puede hacer <Upcasting> <Downcasting> en la dentro de la gerarquia de la herencia del objeto
        
        Animal animal = new Perro();/* Upcasting Explicito
        
        Principamente cuando queremos convertir una inferior < subclase > en < superclase > en cual anula los metodos de sus
        misma clase en cual por ende su utliza DownCasting
        
       /|\ < SuperClase > Animal
        |
        | < Upcasting > Es mirar la gerarquia de la herencia y volver a Perro ubicado en una posicion <Subclase>
        | inferior a una gerarquia de <SuperClase> converirla en una superior en cual renuncia a sus metodos 
        |
        |
        |
        |
        |
        |
        | < DownCasting > Se utiliza para convertir superior a un tipo inferior  de la gerarquia de clases esto
        | se realiza para poder acceder a los metodo de sus subclase
        |
        |   < Subclase > Perro
        
        
        
        
        
         */


        animal.mensajeAnimal();

        Perro a = (Perro) animal;/*DownCasting para poder que acceda a los metodos de su clase 
        
        
         */

        a.mensajePerro();

    }
}
