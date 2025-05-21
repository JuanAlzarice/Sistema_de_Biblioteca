package biblioteca;

public class Libro extends MaterialBiblioteca {

    private String ISBN;

    public Libro(String titulo, String autor, int añoPublicacion, String ISBN) {
        super(titulo, autor, añoPublicacion);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("ISBN: " + ISBN);

    }

}
