package ClaseGenerica;

public class ClassGenerica<a, b> {

    a clave;
    b usuario;

    public ClassGenerica(a clave, b usuario) {
        this.clave = clave;
        this.usuario = usuario;
    }

    public a getClave() {
        return clave;
    }

    public b getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "ClassGenerica{" + "clave=" + clave + ", usuario=" + usuario + '}';
    }

    public static void main(String[] args) {

        ClassGenerica<String, String> generica = new ClassGenerica<>("3214064011", "Jefersson");

        System.out.println(generica);

    }

}
