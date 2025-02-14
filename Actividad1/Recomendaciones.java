package Actividad1;

import java.util.List;
import java.util.Scanner;

public class Recomendaciones {

    private List<Cursos> lista;

    public Recomendaciones(Usuario usuario, List<Cursos> lista) {

        this.lista = lista;
        System.out.println("Hola, Bienvenido a tu perfil.");
        System.out.println("Aqui tienes tus datos: ");
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellidos: " + usuario.getApellidos());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Telefono: " + usuario.getTelefono());
        System.out.println("-----------------------------");
        System.out.println("Te recomendamos estos Cursos recomendados: ");
        recomendacionPersonalizada(usuario);

    }


    public void recomendacionPersonalizada(Usuario usuario) {

        for (Cursos listaCursos : lista) {

            if (usuario.getIntereses().contains(listaCursos.getTipo())) {

                System.out.println("ID: " + listaCursos.getID_cursos());
                System.out.println("Tipo: " + listaCursos.getTipo());
                System.out.println("Titulo: " + listaCursos.getTitulo());
                System.out.println("Descripcion: " + listaCursos.getDescripcion());
                System.out.println("Duracion: " + listaCursos.getDuracion());
                System.out.println("-----------------------------");
            }

        }
    }

    public void contenido() {

        Scanner sc = new Scanner(System.in);
        String opcion = "";
        while (true) {

            System.out.println("Introduce el ID del curso que deseas ver: ");
            System.out.println("(Si deseas salir, presiona 0.)");
            opcion = sc.nextLine();

            boolean encontrado = false;

            for (Cursos curso : lista) {

                if (String.valueOf(curso.getID_cursos()).equals(opcion)) {
                    System.out.println("Titulo: " + curso.getTitulo());
                    System.out.println("Descripcion: " + curso.getDescripcion());
                    System.out.println("¿Qué aprendere en el curso?: ");

                    if (!curso.getContenidos().isEmpty()) {
                        for (Contenido contenido : curso.getContenidos()) {
                            System.out.println(contenido.getTitulos() + " - " + contenido.getDescripcion());
                        }
                    }


                    System.out.println("Duracion: " + curso.getDuracion() + " horas");
                    System.out.println("-----------------------------");
                    encontrado = true;
                    break;
                }


            }

            if (!encontrado) {
                System.out.println("Curso no encontrado. Inténtalo de nuevo: ");


            }

            if (opcion.equals("0")) {
                break;
            }


        }


    }

}
