package Main;

import AnimalSuperClase.Animal;
import GatoSubclase.Gato;
import PerroSubclase.Perro;

public class MainObjetos {

    public static void main(String[] args) {

        Animal soundPerro = new Perro();

        soundPerro.makesound();

        Animal soundGato = new Gato();

        soundGato.makesound();

    }

}
