
package biblioteca;


abstract class MaterialBiblioteca {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    
    public abstract void mostrarInformacion();

}

