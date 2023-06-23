

import BibliotecaEmi.Biblioteca;
import BibliotecaEmi.Documento;
import BibliotecaEmi.Libro;
import BibliotecaEmi.Socio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
      private Biblioteca biblioteca;

      public BibliotecaTest() {
      }

      @Test
      void agregarlibrotest() {
            Biblioteca biblioteca = new Biblioteca("Argentina");
            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos");
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Assertions.assertEquals(2, biblioteca.getLibros().size());
      }

      @Test
      void agregarLibrosDuplicadosShouldFailTest() {
            Biblioteca biblioteca = new Biblioteca("Argentina");
            Libro elPoderDelAhora = new Libro("0001", "El Poder Del Ahora");
            biblioteca.insertarLibro(elPoderDelAhora);
            biblioteca.insertarLibro(elPoderDelAhora);
            Assertions.assertEquals(1, biblioteca.getLibros().size());
      }

      @Test
      void BuscarLibros() {
            Biblioteca biblioteca = new Biblioteca("Argentina");
            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora", "Eckhart Tolle", "psicología");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos", "Miguel Ruiz", "psicologia");
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscar = biblioteca.buscarIsbn("0001");
            Assertions.assertNotNull(libroBuscar);
            Assertions.assertEquals("0002", libroBuscar.getCodIsbn());
      }

      @Test
      void BuscarLibrosError() {
            Biblioteca biblioteca = new Biblioteca("Argentina");
            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora", "Eckhart Tolle", "psicología");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos", "Miguel Ruiz", "psicologia");
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscar = biblioteca.buscarIsbn("0002");
            Assertions.assertNotNull(libroBuscar);
            Assertions.assertEquals("0001", libroBuscar.getCodIsbn());
      }

      @Test
      void BuscarLibrosCat() {
            Biblioteca biblioteca = new Biblioteca("Argentina");
            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora", "Eckhart Tolle", "psicología");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos", "Miguel Ruiz", "psicologia");
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscarCat = biblioteca.buscarCat("psicologia");
            Assertions.assertEquals("psicologia", libroBuscarCat.getCategoria());
            System.out.println(libroBuscarCat.getCategoria());
      }

      @Test
      Biblioteca IngresarSocio(Socio socio) {
            Biblioteca biblioteca = new Biblioteca("Argentina");
            new Socio(new Documento("DNI", "34504576"), "Emilinoa", "Perez", "pueyrredon 3350 ");
            this.biblioteca = this.IngresarSocio(socio);
            Socio added = this.biblioteca.IngresasrsocioPorDocumento(new Documento("DNI", "34504575"));
            Assertions.assertEquals(socio, added);
            return biblioteca;
      }
}
