package Actividad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Usuario {

    private int ID_usuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasena;
    private int telefono;
    private List<String> intereses;
    private int contadorUsuarios = 1;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private List<String> ListaIntereses = Arrays.asList("matematicas", "programacion", "fisica", "literatura", "geografia");


    //Constructor por defecto
    public Usuario() {
    }


    //Constructor con valores
    public Usuario(List<String> intereses, int telefono, String contrasena, String correo, String apellidos, String nombre) {
        this.intereses = intereses;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.correo = correo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.ID_usuario = contadorUsuarios++;
    }

    //Añadir usuarios
    public Usuario registrarUsuario() {

        Scanner sc = new Scanner(System.in);

        String nombre = "";

        while (true) {
            System.out.println("Escriba su nombre: ");
            nombre = sc.nextLine();
            if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {

                System.out.println("Nombre inválido. Intente nuevamente.");
            } else {

                break;
            }
        }

        String apellidos = "";

        while (true) {

            System.out.println("Escriba sus apellidos: ");
            apellidos = sc.nextLine();
            if (!apellidos.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {

                System.out.println("Apellidos inválidos. Intente nuevamente.");

            } else {

                break;
            }
        }


        while (true) {

            System.out.println("Escriba su correo: ");
            String correoTemp = sc.nextLine();

            boolean correoExiste = listaUsuarios.stream().anyMatch(usuario -> usuario.getCorreo().equals(correo));

            if (!correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                System.out.println("Correo inválido. Intente nuevamente.");
            } else if (correoExiste) {

                System.out.println("Correo ya introducido");

            } else {

                correo = correoTemp;
                break;
            }

        }

        while (true) {

            System.out.println("Escriba su contraseña: ");
            String contrasena = sc.nextLine();

            if (contrasena.isEmpty()) {

                System.out.println("Contraseña inválida. Intente nuevamente.");
            } else {

                break;
            }


        }


        while (true) {
            System.out.println("Escriba su telefono: ");
            int telefonoTemporal = sc.nextInt();
            sc.nextLine();

            boolean telefonoExiste = listaUsuarios.stream().anyMatch(usuario -> usuario.getTelefono() == telefono);

            if (String.valueOf(telefono).length() != 9 && !String.valueOf(telefono).matches("[0-9]+")) {
                System.out.println("Número de teléfono inválido. Intente nuevamente.");

            } else if (telefonoExiste) {

                System.out.println("Telefono ya introducido");

            } else {

                telefono = telefonoTemporal;
                break;
            }

        }

        List<String> intereses = new ArrayList<String>();
        System.out.println("\nElija sus intereses (máximo 2). Opciones disponibles: " + ListaIntereses);


        while (intereses.size() < 2) {

            System.out.print("Ingrese un interés: ");
            String interes = sc.nextLine().toLowerCase();

            if (ListaIntereses.contains(interes.toLowerCase()) && !intereses.contains(interes.toLowerCase())) {

                intereses.add(interes);

            } else {
                System.out.println("Interés inválido o ya elegido. Intente nuevamente.");
            }
        }


        Usuario usuario = new Usuario(intereses, telefono, contrasena, correo, apellidos, nombre);
        listaUsuarios.add(usuario);
        return usuario;


    }

    //Listar usuarios
    public void listarUsuarios() {

        System.out.println("Lista de usuarios: ");

        for (Usuario usuarios : listaUsuarios) {

            System.out.println(usuarios.toString());
        }

    }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setIntereses(List<String> intereses) {
        this.intereses = intereses;
    }

    public List<String> getIntereses() {
        return intereses;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //To String
    @Override
    public String toString() {
        return "Usuario{" + "ID_usuario=" + ID_usuario + ", nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", correo='" + correo + '\'' + ", contrasena='" + contrasena + '\'' + ", telefono=" + telefono + ", intereses=" + intereses + '}';
    }
}
