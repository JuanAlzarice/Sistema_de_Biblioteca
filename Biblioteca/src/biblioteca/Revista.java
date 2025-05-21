package biblioteca;

public class Revista extends MaterialBiblioteca {

    private int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, String autor, int añoPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Numero de edicion: " + numeroEdicion);
    }

}
