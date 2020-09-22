package PracticaEjercicio1;

public class Ejercicio1 {
    
    private String titular;
    private double cantidad;
    
    public Ejercicio1() {
        
    }
    
    public Ejercicio1(String titular, double cantidad) {
        this.titular = titular;
        
        if (cantidad < 0) {
            
            this.cantidad = 0;
            
        } else {
            
            this.cantidad = cantidad;
            
        }
        
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresar(double Cantidad) {
        
        if (this.cantidad > 0) {
            
            this.cantidad += cantidad;
        }
        
    }
    
    public void retirar(double cantidad) {
        
        if (this.cantidad < 0) {
            
            this.cantidad = 0;
        } else {
            
            this.cantidad -= cantidad;
            
        }
        
    }
    
    @Override
    public String toString() {
        return "[" + "titular=" + titular + ", cantidad=" + cantidad + ']';
    }
    
    public static void main(String[] args) {
        
        Ejercicio1 cuenta_1 = new Ejercicio1("Jefersson", 3000);
        Ejercicio1 cuenta_2 = new Ejercicio1("Jefersson", 3000);
        
        cuenta_1.ingresar(6000);
        cuenta_1.retirar(4000);
        System.out.println(cuenta_1);
        
        cuenta_2.ingresar(5000);
        cuenta_2.retirar(5600);
        System.out.println(cuenta_2);
    }
    
}
