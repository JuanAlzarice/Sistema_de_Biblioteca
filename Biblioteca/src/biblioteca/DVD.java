
package biblioteca;


public class DVD extends MaterialBiblioteca {
    
    private int duracionMinutos;

    public DVD(int duracionMinutos, String titulo, String autor, int añoPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.duracionMinutos = duracionMinutos;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Duracion: "+duracionMinutos +"min");
    }
     
}
