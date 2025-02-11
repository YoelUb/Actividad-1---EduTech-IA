package Actividad1;

public class Cursos {

    private int ID_cursos;
    private String nombre;
    private String descripcion;
    private int duracion;


    // Constructor
    public Cursos(int ID_cursos, String nombre, String descripcion, int duracion) {
        this.ID_cursos = ID_cursos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    // Getters and Setters
    public int getID_cursos() {
        return ID_cursos;
    }

    public void setID_cursos(int ID_cursos) {
        this.ID_cursos = ID_cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
