package Polimorfismo.Entrenador;

import Polimorfismo.Seleccion.Futbol.Superclase.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    public Entrenador() {

    }

    public Entrenador(int idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenamiento() {

        System.out.println("Realiza un entrenamiento [ Clase entrenador] ");

    }

    @Override
    public void partidoFutbol() {

        System.out.println("Dirige un partido [Clase entrenador]");
    }

    public void planificarEntrenamiento() {

        System.out.println("Planificar un entrenamiento");

    }

}
