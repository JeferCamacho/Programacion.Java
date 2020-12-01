package Implementacion.Clase.Generica;

public class Implemest<T> {

    
    T dato;

    public Implemest(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }


    
    
}
