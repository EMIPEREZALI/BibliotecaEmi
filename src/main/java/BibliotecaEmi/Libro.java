package BibliotecaEmi;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class Libro {


    private String titulo;
    private String CodIsbn;
    private String autor;
    private String categoria;


    public Libro(String CodIsbn,String titulo)
    {this.CodIsbn = CodIsbn;
    this.titulo = titulo;}

    public Libro(String CodIsbn,String titulo,String autor,String categoria)
    {this.CodIsbn = CodIsbn;
     this.titulo = titulo;
     this.autor = autor;
     this.categoria = categoria; }

    public String getCodIsbn() {
        return CodIsbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {

        return titulo;
    }


}

