package Actividad1;

public class Cursos {

    private int ID_cursos;
    private String tipo;
    private String titulo;
    private String descripcion;
    private int duracion;
    private static int contadorCursos = 1;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Constructor
    public Cursos(String tipo, String titulo, String descripcion, int duracion) {
        this.ID_cursos = contadorCursos++;
        this.tipo = tipo;
        this.titulo = titulo;
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
