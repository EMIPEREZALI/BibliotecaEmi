package BibliotecaEmi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {


    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }




    // insertar los dos libros
    public void insertarLibro(Libro libro) {
        // verifica que no este el libro cargado de vuelve 1 0 1 el contain mira el array
        if (!this.libros.contains(libro)) {
            // si no esta agrego libro
            this.libros.add(libro) ;


        }

    }

    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }
}
