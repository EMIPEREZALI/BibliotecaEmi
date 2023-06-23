//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BibliotecaEmi;

public class Libro {
    private String titulo;
    private String CodIsbn;
    private String autor;
    private String categoria;

    public Libro(String CodIsbn, String titulo) {
        this.CodIsbn = CodIsbn;
        this.titulo = titulo;
    }

    public Libro(String CodIsbn, String titulo, String autor, String categoria) {
        this.CodIsbn = CodIsbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getCodIsbn() {
        return this.CodIsbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getCategoria() {
        return categoria;
    }
}
