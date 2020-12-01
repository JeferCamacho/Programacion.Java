package com.AbstrarVsInterfaz;

public class ImplementacionAbstrac extends ClaseAbstractaSuperClase {

    public ImplementacionAbstrac(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void descripcion() {

        System.out.println("Esta implementacion se realiza para poder visualizar cuando hay un metodo abstracto ");
    }

    /*
    
    Es implementar los metodos pero sin saber como se los van a implementar las clase hijas
    
    
     */
    public static void main(String[] args) {

        ImplementacionAbstrac imple = new ImplementacionAbstrac(5, "jefersson");

        imple.descripcion();
        imple.informe();

    }

}
