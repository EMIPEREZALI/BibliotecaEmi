package BibliotecaEmi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {


    private String nombre;
    private List<Libro> libros;

    private final List<Socio> socios = new ArrayList<>();




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
    public Libro buscarIsbn ( String codIsbn) {
        for (Libro a:this.libros
             ) {
            if (a.getCodIsbn().equals(codIsbn))
                return a;

        }
            return null;
        }
    public Libro buscarCat( String  categoria ) {
        for (Libro a:this.libros){

        if (a.getCategoria().equals(categoria))
            return a;

        }
        return null;
    }

    public void addStudent(Socio socio) {
        if (socio == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }

        // check if student already exists
        if (socioExiste(socio)) {
            throw new IllegalArgumentException("Socio ya existe");
        }

        this.socios.add(socio);
    }

    public void IngresarSocio(Socio socio) {
        if (socio == null) {
            throw new IllegalArgumentException("Socio no puede ser null");
        }

        // check if student already exists
        if (socioExiste(socio)) {
            throw new IllegalArgumentException("Socio ya existe");
        }

        this.socios.add(socio);
    }
    private boolean socioExiste(Socio student) {
        return this.socios.stream().anyMatch(s -> s.equals(socios));
    }

    public Socio IngresasrsocioPorDocumento(Documento documento) {
        return this.socios.stream()
                .filter(s -> s.getDocument().equals(documento))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Socio no existe"));
    }

    }


