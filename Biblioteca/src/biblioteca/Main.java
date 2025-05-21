package biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();

        materiales.add(new Libro("1984", "George Orwell", 1949, "1234567890"));
        materiales.add(new Revista(45, "National Geographic", "John Smith", 2021));
        materiales.add(new DVD(136, "Matrix", "Wachowski", 1999));

        for (MaterialBiblioteca m : materiales) {
            m.mostrarInformacion();
        }
    }
}
