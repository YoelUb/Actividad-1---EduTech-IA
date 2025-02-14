package Actividad1;

public class Contenido {

    private int ID_contenido;
    private String titulos;
    private String descripcion;


    // Constructor
    public Contenido(int ID_contenido, String titulos, String descripcion) {
        this.ID_contenido = ID_contenido;
        this.titulos = titulos;
        this.descripcion = descripcion;
    }


    // Getters and Setters


    public int getID_contenido() {
        return ID_contenido;
    }

    public void setID_contenido(int ID_contenido) {
        this.ID_contenido = ID_contenido;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
