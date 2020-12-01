package Practica.OperadorTernario;

public class PracticaTernario {

    private int entero1;
    private int entero2;
    private String Mensaje;

    public PracticaTernario() {

    }

    public PracticaTernario(int entero1, int entero2) {
        this.entero1 = entero1;
        this.entero2 = entero2;
    }

    public int getEntero1() {
        return entero1;
    }

    public void setEntero1(int entero1) {
        this.entero1 = entero1;
    }

    public int getEntero2() {
        return entero2;
    }

    public void setEntero2(int entero2) {
        this.entero2 = entero2;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String validar() {

        return Mensaje = (entero1 > entero2) ? "Numero 1 es mayor" : "Numero  2 es Mayor ";

    }

    public static void main(String[] args) {

        /*
        
        < Operador Termario > es un operador condicional ralativamente un if-else en cual utliza 
        < ? > signo de interogacion y < : > dos puntos caracteres para hablitar una expresion 
        condicional con dos resultados posibles se puede usar para reemplazar bloques < if-else>
        
        {condición para evaluar} ? {instrucción-ejecutada-en-verdadero} : {declaración-ejecutada-en-falso}
        
        
         */
        PracticaTernario numeros = new PracticaTernario();

        numeros.setEntero1(1);
        numeros.setEntero2(2);

        System.out.println("[" + numeros.validar() + "]");

    }

}
