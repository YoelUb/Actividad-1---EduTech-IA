package Actividad1;

import java.util.ArrayList;

public class Usuario {

    private int ID_usuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasena;
    private int telefono;
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();


    //Constructor
    public Usuario(int ID_usuario, String nombre, String apellidos, String correo, String contrasena, int telefono) {
        this.ID_usuario = ID_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }

    //Añadir usuarios
    public static void anadirUsuarios(Usuario usuario) {

        if (!listaUsuarios.contains(usuario)) {
            listaUsuarios.add(usuario);
            System.out.println("Usuario agregado correctamente." + " ID: " + usuario.getID_usuario() + ", " + usuario.getNombre() + " " + usuario.getApellidos());
        } else {

            System.out.println("No se puede agregar a un usuario ya existente" + " ID: " + usuario.getID_usuario() + ", " + usuario.getNombre() + " " + usuario.getApellidos());
            System.out.println("Por favor intenta con otro usuario.");
        }

    }

    //Listar usuarios
    public static void listarUsuarios() {

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

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        Usuario.listaUsuarios = listaUsuarios;
    }

    //To String
    @Override
    public String toString() {
        return "Usuario{" +
                "ID_usuario=" + ID_usuario +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
