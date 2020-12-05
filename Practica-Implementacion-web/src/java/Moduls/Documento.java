package Moduls;

public class Documento {

    private int id;
    private int codigo;
    private String nombreDocumento;

    public Documento() {
    }

    public Documento(int codigo, String nombreDocumento) {
        this.codigo = codigo;
        this.nombreDocumento = nombreDocumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

}
