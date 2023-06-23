//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BibliotecaEmi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private final List<Socio> socios = new ArrayList();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList();
    }

    public void insertarLibro(Libro libro) {
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
        }

    }

    public List<Libro> getLibros() {
        return new ArrayList(this.libros);
    }

    public Libro buscarIsbn(String codIsbn) {
        Iterator var2 = this.libros.iterator();

        Libro a;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            a = (Libro)var2.next();
        } while(!a.getCodIsbn().equals(codIsbn));

        return a;
    }

    public Libro buscarCat(String categoria) {
        Iterator var2 = this.libros.iterator();

        Libro a;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            a = (Libro)var2.next();
        } while(!a.getCategoria().equals(categoria));

        return a;
    }

    public void addStudent(Socio socio) {
        if (socio == null) {
            throw new IllegalArgumentException("Student cannot be null");
        } else if (this.socioExiste(socio)) {
            throw new IllegalArgumentException("Socio ya existe");
        } else {
            this.socios.add(socio);
        }
    }

    public void IngresarSocio(Socio socio) {
        if (socio == null) {
            throw new IllegalArgumentException("Socio no puede ser null");
        } else if (this.socioExiste(socio)) {
            throw new IllegalArgumentException("Socio ya existe");
        } else {
            this.socios.add(socio);
        }
    }

    private boolean socioExiste(Socio student) {
        return this.socios.stream().anyMatch((s) -> {
            return s.equals(this.socios);
        });
    }

    public Socio IngresasrsocioPorDocumento(Documento documento) {
        return (Socio)this.socios.stream().filter((s) -> {
            return s.getDocument().equals(documento);
        }).findFirst().orElseThrow(() -> {
            return new RuntimeException("Socio no existe");
        });
    }
}
