package Actividad1;

import java.util.List;

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

       for (Cursos listaCursos : lista){

         if(usuario.getIntereses().contains(listaCursos.getTipo())){
             System.out.println("ID: " + listaCursos.getID_cursos());
             System.out.println("Tipo: " + listaCursos.getTipo());
             System.out.println("Titulo: " + listaCursos.getTitulo());
             System.out.println("Descripcion: " + listaCursos.getDescripcion());
             System.out.println("Duracion: " + listaCursos.getDuracion());
             System.out.println("-----------------------------");
         }

       }
    }

}
