package Practica.MetodosMayusculas;

public class Mayusculas {
    
    private String contraseña;
    private String contraseñ;
    private char contrase;
    
    public Mayusculas() {
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getContraseñ() {
        return contraseñ;
    }
    
    public void setContraseñ(String contraseñ) {
        this.contraseñ = contraseñ;
    }
    
    public char getContrase() {
        return contrase;
    }
    
    public void setContrase(char contrase) {
        this.contrase = contrase;
    }
    
    
    public void convertirToUpperCase() {
        
        System.out.println(contraseña.toUpperCase());
        
    }
    
    public void conventirToLowerCas() {
        
        System.out.println(contraseñ.toLowerCase());
    }
    public static void main(String[] args) {
        
        Mayusculas conventir = new Mayusculas();
        
        conventir.setContraseña("Jefersson");
        conventir.setContraseñ("ASLKFDJASLKDFJ");
        conventir.convertirToUpperCase();
        conventir.conventirToLowerCas();
        
    }
    
}
