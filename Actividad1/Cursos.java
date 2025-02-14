package Actividad1;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

    private int ID_cursos;
    private String tipo;
    private String titulo;
    private String descripcion;
    private int duracion;
    private static int contadorCursos = 1;
    private static List<Cursos> listaCursos = new ArrayList<>();
    private List<Contenido> contenidos;


    // Constructor
    public Cursos(String tipo, String titulo, String descripcion, int duracion) {

        this.ID_cursos = contadorCursos++;
        this.tipo = tipo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.contenidos = new ArrayList<>();


    }

    // Añadir cursos
    public void agregarContenido(Contenido contenido) {

        this.contenidos.add(contenido);
    }


    // Iniciar los cursos
    public static void iniciarCursos() {

        Cursos curso1 = new Cursos("matematicas", "Matemáticas I", "Curso de matemáticas básicas", 10);
        curso1.agregarContenido(new Contenido(1, "Números y Operaciones", "Conceptos básicos de aritmética."));
        curso1.agregarContenido(new Contenido(2, "Ecuaciones Básicas", "Resolución de ecuaciones simples."));
        listaCursos.add(curso1);
        Cursos curso2 = new Cursos("matematicas", "Álgebra Avanzada", "Curso de álgebra para niveles intermedios y avanzados", 25);
        curso2.agregarContenido(new Contenido(3, "Ecuaciones de Segundo Grado", "Resolución de ecuaciones cuadráticas."));
        curso2.agregarContenido(new Contenido(4, "Matrices y Determinantes", "Operaciones con matrices."));
        listaCursos.add(curso2);
        Cursos curso3 = new Cursos("matematicas", "Cálculo Diferencial e Integral", "Fundamentos de cálculo aplicado", 40);
        curso3.agregarContenido(new Contenido(5, "Límites y Derivadas", "Introducción a las derivadas."));
        curso3.agregarContenido(new Contenido(6, "Integrales", "Cálculo de integrales definidas e indefinidas."));
        listaCursos.add(curso3);
        // Cursos de Programación
        Cursos curso4 = new Cursos("programacion", "Programación Java", "Curso de programación en Java", 20);
        curso4.agregarContenido(new Contenido(7, "Sintaxis de Java", "Estructura básica del lenguaje Java."));
        curso4.agregarContenido(new Contenido(8, "POO en Java", "Conceptos de Programación Orientada a Objetos."));
        listaCursos.add(curso4);
        Cursos curso5 = new Cursos("programacion", "Desarrollo Web con HTML, CSS y JavaScript", "Aprende a crear páginas web dinámicas", 30);
        curso5.agregarContenido(new Contenido(9, "HTML y CSS", "Creación de estructuras y estilos."));
        curso5.agregarContenido(new Contenido(10, "JavaScript Básico", "Fundamentos de interactividad con JS."));
        listaCursos.add(curso5);
        Cursos curso6 = new Cursos("programacion", "Inteligencia Artificial con Python", "Curso sobre machine learning e IA con Python", 45);
        curso6.agregarContenido(new Contenido(11, "Introducción a IA", "Conceptos básicos de Machine Learning."));
        curso6.agregarContenido(new Contenido(12, "Redes Neuronales", "Fundamentos de redes neuronales."));
        listaCursos.add(curso6);
        // Cursos de Física
        Cursos curso7 = new Cursos("fisica", "Física I", "Curso de física básica", 15);
        curso7.agregarContenido(new Contenido(13, "Cinemática", "Estudio del movimiento."));
        curso7.agregarContenido(new Contenido(14, "Dinámica", "Leyes de Newton."));
        listaCursos.add(curso7);
        Cursos curso8 = new Cursos("fisica", "Electromagnetismo", "Curso sobre electricidad y magnetismo", 25);
        curso8.agregarContenido(new Contenido(15, "Carga y Campo Eléctrico", "Fundamentos de electrostática."));
        curso8.agregarContenido(new Contenido(16, "Ondas Electromagnéticas", "Fenómenos ondulatorios en la física."));
        listaCursos.add(curso8);
        Cursos curso9 = new Cursos("fisica", "Astronomía y Astrofísica", "Exploración del universo y sus fenómenos", 30);
        curso9.agregarContenido(new Contenido(17, "Sistema Solar", "Características de los planetas."));
        curso9.agregarContenido(new Contenido(18, "Evolución Estelar", "Nacimiento y muerte de las estrellas."));
        listaCursos.add(curso9);
        // Cursos de Literatura
        Cursos curso10 = new Cursos("literatura", "Literatura Universal", "Curso de literatura universal", 10);
        curso10.agregarContenido(new Contenido(19, "Autores Clásicos", "Exploración de obras maestras."));
        curso10.agregarContenido(new Contenido(20, "Corrientes Literarias", "Movimientos y estilos en la literatura."));
        listaCursos.add(curso10);
        Cursos curso11 = new Cursos("literatura", "Escritura Creativa", "Técnicas para desarrollar narraciones y mejorar la escritura", 15);
        curso11.agregarContenido(new Contenido(21, "Técnicas Narrativas", "Uso del lenguaje en la escritura."));
        curso11.agregarContenido(new Contenido(22, "Construcción de Personajes", "Cómo dar vida a los personajes."));
        listaCursos.add(curso11);
        // Cursos de Geografía
        Cursos curso12 = new Cursos("geografia", "Geografía Mundial", "Curso de geografía mundial", 30);
        curso12.agregarContenido(new Contenido(23, "Continentes y Países", "Características geográficas."));
        curso12.agregarContenido(new Contenido(24, "Relieves y Ecosistemas", "Tipos de paisajes naturales."));
        listaCursos.add(curso12);
        Cursos curso13 = new Cursos("geografia", "Geopolítica y Relaciones Internacionales", "Análisis de conflictos y diplomacia global", 30);
        curso13.agregarContenido(new Contenido(25, "Historia de la Geopolítica", "Orígenes y evolución."));
        curso13.agregarContenido(new Contenido(26, "Conflictos Globales", "Análisis de conflictos actuales."));
        listaCursos.add(curso13);


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

    public static List<Cursos> getListaCursos() {
        return listaCursos;
    }

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

    public List<Contenido> getContenidos() {
        return contenidos;
    }
}
