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




    // insertar los dos libros emi
    public void insertarLibro(Libro libro) {
        // verifica que no este el libro cargado de vuelve 1 0  el contain mira el array
        if (!this.libros.contains(libro)) {
            // si no esta agrego libro
            this.libros.add(libro) ;


        }

    }

    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }
    // for recorre el vector libros, los llama A, y trae el cod isbn (que tuve generar con el generate getters
    public Libro buscarIsbn( String codIsbn) {
        for (Libro a:this.libros
             ) {
            if (a.getCodIsbn().equals(codIsbn))
                return a;

        }
            return null;
        }

    }


