package Practica.Ejercicio3;

public class Password {

    private  String contraseña;
    private String validacion;

    public Password() {
    }

    public Password(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String validar() {

        return validacion
                = (this.contraseña == this.contraseña.toLowerCase() && this.contraseña.length() == 5)
                ? "Contraseña no valida" : "contraseña valida";
    }

    public void generarContraseña() {

    }

    public static void main(String[] args) {

        Password conventir = new Password();

        conventir.setContraseña("Fasdf");

        System.out.println(conventir.validar());

    }

}
