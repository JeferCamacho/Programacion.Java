package Ejercicio.Practica20;

public class Practica {

    
    private int numeropar;
    
    
    
    public void numerosPares(){
        
        for (int i = 0; i < 100; i++) {
            
            if (numeropar%2==0) {
                
                
                System.out.println("2");

                
            }
            
        }
        
        
    }
    
    
    
    public static void main(String[] args) {

        /*
        
        Disenar un algoritmo que calcule y almacene en un arreglo los primeros 105 numeros pares anteriores
        a un numero dado N ( N es mayor que 51 y menor a 100) para posteriormente a ordenar en sentido 
        creciente
         */
        
        
        Practica pares=new Practica();
        
        pares.numerosPares();
    }

}
