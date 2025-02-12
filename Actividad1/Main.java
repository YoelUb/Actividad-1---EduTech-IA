package Actividad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        String opcion;


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
                    System.out.println("-----------------------------");
                    System.out.println("Usuario registrado con éxito.");

                    break;


                case "2":
                    System.out.println("Accediendo a mi perfil...");
                    break;

                case "3":

                    System.out.println("Listado de usuarios: ");
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
}
