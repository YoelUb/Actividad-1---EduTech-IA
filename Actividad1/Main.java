package Actividad1;
public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(1, "Paco", "Perez", "pacoperez1@gmail.com", "1234", 123456789);
        Usuario usuario2 = new Usuario(2, "Maria", "Lopez", "marialopez@gmail.com", "4321", 987654321);
        Usuario usuario3 = new Usuario(3, "Juan", "Garcia", "juangarcia@gmail.com", "5678", 123789456);


        //Añadir usuarios
        Usuario.anadirUsuarios(usuario1);
        Usuario.anadirUsuarios(usuario2);
        Usuario.anadirUsuarios(usuario3);
        //Usuario repetido
        Usuario.anadirUsuarios(usuario1);

        //Listar usuarios
        Usuario.listarUsuarios();




    }
}
