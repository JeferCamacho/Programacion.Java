package Practica.List.Validar.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Practica {

    private List<String> userElems = new ArrayList();
    private List<String> passwordElems = new ArrayList();

    private boolean user = false;
    private boolean password = false;

    public void baseDeDatosUser() {

        userElems.add("Jefersson");
        userElems.add("Camacho");
        userElems.add("Rodriguez");
        userElems.add("Soltero");

    }

    public void baseDeDatosPassword() {

        passwordElems.add("6546546sdfs5");
        passwordElems.add("6546sdfs5");
        passwordElems.add("6546sdfs5");
        passwordElems.add("6546546s5");
        passwordElems.add("6546546s5");
        passwordElems.add("6546545");

    }

    public void validarElementos() {

        if (userElems.contains("Jefersson")) {

            user = true;

        }

        if (passwordElems.contains("6546sdfs5")) {

            password = true;

        }

    }

    public void validar() {

        if (password == true && user == true) {

            System.out.println("Bienvenido");

        } else {

            System.out.println("Datos Incorrectos");

        }

    }

    public static void main(String[] args) {

        Practica validar = new Practica();

        validar.baseDeDatosUser();
        validar.baseDeDatosPassword();

        validar.validarElementos();
        validar.validar();

    }

}
