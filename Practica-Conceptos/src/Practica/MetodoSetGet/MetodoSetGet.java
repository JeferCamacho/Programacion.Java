package Practica.MetodoSetGet;

public class MetodoSetGet {

    public String nombre;

    private String nombrePrueba;

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    /* 

    //FUNCIOMIENTO

    Algo que toca entender que limita el acceso  de la varibles cuando utilizamos los atributos debe incorporar 
    el < ENCAPSULAMIENTO > lo que realiza es ocultar algunos datos y NO puedan modicarlos a su antojo si no que 
    puedan ser modificados a travez metodos de la misma clase son < SET-GET > 
    
    
    //ESTRUCTURA

    
    El metodo getNombrePrueba()lo que realiza es poder visualizar el atributo 
    
    
    public String getNombrePrueba() {
        return nombrePrueba;
    }

    
    El metodo setNombrePrueba(String nombrePrueba)  lo que realia es poder inicilizar el atributo con el dato
    especifico 
    
    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    //FUNCIONAMIENTO METODOS
    
    
    Lo que realizan es poder que el atributos < ENCAPSULADOS PRIVATE > no puedan ser accedidos desde cualquier 
    clase si no que puedan ser accedidos solo desde los metodos de la clase en cual se hace la utlizacion 
    de los metodos < SET-GET > en debe tener un canal de comunicacion para poder cambiar el estado del atributo
    
    
    //FUNCIMIENTO SI NO SE INCORPORA
    
    Lo que realizaria es que cualquier clase puediera cambiar el estado del dato y poderlo modificar eso generaria 
    un problematica puede tomasr el atributo datos invalidos
    
    
    
    
    
    
    
    
    

     */
}
