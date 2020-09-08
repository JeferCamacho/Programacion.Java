package Practica.Polimorfismo.Explicacion;

public class Explicacion {

    private int entero;
    private String alfaNumeros;

    /*
    
    En el espacio no se puede guardar otro tipo de dato que no sea int(Entero > Numeros);
    
    
    numeros 
    
    letras 
    
    
    String >(Alfanumericos);
    
    Puede contener numeros y letras juntos 
    
    
    hola1526
    
    
    
     */
    public Explicacion() {

    }

    public String getAlfaNumeros() {
        return alfaNumeros;
    }

    public void setAlfaNumeros(String alfaNumeros) {
        this.alfaNumeros = alfaNumeros;
    }

    public Explicacion(int entero) {
        this.entero = entero;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    /*
    
    
    $hombre 
                   //Lenguajes devilmente tipados >(php , javascrip )
    $apellido 
    
    
    int >(longitud)   + nombre de la varible  ;
    String ,char 
    
    
    
    programas mas complejos

    
    
    
    Instanciando 
    
    Instacio de la clase
    
    
    
    Objeto miObjeto =new Objeto ();
    
    
    
    Identifico el plano de mi  Objeto animal 
    


    
    El polimorfismo y las abstraccion son conceptos que van totalmente ligados podemos identicar que el
    polimorfismo se interpreta con un concepto que el objeto toma muchas formas se refiere a la propiedad 
    en la es posible enviar mensajes sintacticamente iguales pero a objetos de tipos distintos
    
    
    
    
     */
    public static void main(String[] args) {

        /*
        
        
        Instaciar
         */
        Explicacion explicacion = new Explicacion();

        ///NUMEROS
        explicacion.setEntero(5);

        System.out.println("Numero  " + "[" + explicacion.getEntero() + "]");

        ///ALFANUMERICOS 
        explicacion.setAlfaNumeros(" 123456789hola como esta estamos programando SISTEMA DE TIPOS llevo revisando este concepto 1 mes y consegi una nota de 40");
        System.out.println(explicacion.getAlfaNumeros());

    }
}
