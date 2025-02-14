package Actividad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    Scanner sc = new Scanner(System.in);
    Usuario usuario = new Usuario();
    String opcion;
    List<Cursos> listaCursos = new ArrayList<>();

    public Menu() {

        listaCursos.add(new Cursos("matematicas", "Matemáticas I", "Curso de matemáticas básicas", 10));
        listaCursos.add(new Cursos("programacion", "Programación Java", "Curso de programación en Java", 20));
        listaCursos.add(new Cursos("fisica", "Física I", "Curso de física básica", 15));
        listaCursos.add(new Cursos("literatura", "Literatura Universal", "Curso de literatura universal", 10));
        listaCursos.add(new Cursos("geografia", "Geografía Mundial", "Curso de geografía mundial", 30));
        listaCursos.add(new Cursos("matematicas", "Álgebra Avanzada", "Curso de álgebra para niveles intermedios y avanzados", 25));
        listaCursos.add(new Cursos("programacion", "Desarrollo Web con HTML, CSS y JavaScript", "Aprende a crear páginas web dinámicas", 30));
        listaCursos.add(new Cursos("programacion", "Bases de Datos con MySQL", "Curso sobre diseño y gestión de bases de datos relacionales", 20));
        listaCursos.add(new Cursos("fisica", "Física Cuántica", "Curso introductorio sobre los principios de la física cuántica", 35));
        listaCursos.add(new Cursos("literatura", "Análisis de la Literatura Contemporánea", "Exploración de autores y obras del siglo XX y XXI", 20));
        listaCursos.add(new Cursos("geografia", "Cartografía y Sistemas de Información Geográfica", "Aprende sobre mapas y análisis geoespacial", 40));
        listaCursos.add(new Cursos("programacion", "Inteligencia Artificial con Python", "Curso sobre machine learning e IA con Python", 45));
        listaCursos.add(new Cursos("programacion", "Desarrollo de Aplicaciones Móviles con Android", "Curso para crear apps móviles con Java y Kotlin", 35));
        listaCursos.add(new Cursos("matematicas", "Cálculo Diferencial e Integral", "Fundamentos de cálculo aplicado", 40));
        listaCursos.add(new Cursos("fisica", "Electromagnetismo", "Curso sobre electricidad y magnetismo", 25));
        listaCursos.add(new Cursos("literatura", "Escritura Creativa", "Técnicas para desarrollar narraciones y mejorar la escritura", 15));
        listaCursos.add(new Cursos("geografia", "Geopolítica y Relaciones Internacionales", "Análisis de conflictos y diplomacia global", 30));
        listaCursos.add(new Cursos("programacion", "Ciberseguridad y Hacking Ético", "Aprende sobre seguridad informática y protección de datos", 40));
        listaCursos.add(new Cursos("programacion", "Desarrollo de Videojuegos con Unity", "Crea videojuegos en 2D y 3D usando Unity y C#", 50));
        listaCursos.add(new Cursos("fisica", "Astronomía y Astrofísica", "Exploración del universo y sus fenómenos", 30));



        do {
            System.out.println("-----------------------------");
            System.out.println("Bienvenido a la plataforma de cursos online.");
            System.out.println("-----------------------------");
            System.out.println("1. Registrarse");
            System.out.println("2. Acceder a mi perfil");
            System.out.println("3. Listar usuarios");
            System.out.println("0. Salir");
            System.out.println("Por favor, seleccione una opción: ");

            opcion = sc.nextLine();

            switch (opcion) {

                case "1":

                    usuario.registrarUsuario();
                    break;


                case "2":

                    System.out.println("Accediendo a mi perfil...");
                    usuario.iniciarSesion();
                    break;

                case "3":

                    System.out.println("-----------------------------");
                    System.out.println("Listado de usuarios: ");
                    usuario.listarUsuarios();
                    System.out.println("-----------------------------");
                    break;


                case "0":
                    System.out.println("-----------------------------");
                    System.out.println("Saliendo de la plataforma...");

                    break;

                default:
                    System.out.println("-----------------------------");
                    System.out.println("Opción no válida.");
                    System.out.println("Por favor, seleccione una opción válida.");

                    break;

            }


        } while (!opcion.equals("0"));


    }

    public List<Cursos> getListaCursos() {
        return listaCursos;
    }
}

