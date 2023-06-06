
import BibliotecaEmi.Biblioteca;
import BibliotecaEmi.Documento;
import BibliotecaEmi.Libro;
import BibliotecaEmi.Socio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
      private Biblioteca biblioteca;

      @Test
      void agregarlibrotest() {

            //arrange prueba

            Biblioteca biblioteca = new Biblioteca("Argentina");

            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos");

            //act
            // cantidad de libros que quiero pasar con su nombre
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            // pruebo cuantos inserto
            //assert
            assertEquals(2, biblioteca.getLibros().size());


      }

      @Test
      void agregarLibrosDuplicadosShouldFailTest() {

            //arrange

            Biblioteca biblioteca = new Biblioteca("Argentina");

            Libro elPoderDelAhora = new Libro("0001", "El Poder Del Ahora");


            //act

            biblioteca.insertarLibro(elPoderDelAhora);
            biblioteca.insertarLibro(elPoderDelAhora);

            //assert
            assertEquals(1, biblioteca.getLibros().size());

      }

      @Test
      void BuscarLibros() {
            //arrange
            Biblioteca biblioteca = new Biblioteca("Argentina");

            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora", "Eckhart Tolle",
                    "psicología");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos", "Miguel Ruiz",
                    "psicologia");

            //act
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscar = biblioteca.buscarIsbn("0001");


            //assert
            assertNotNull(libroBuscar);
            assertEquals("0002", libroBuscar.getCodIsbn());

      }


      @Test
      void BuscarLibrosError() {
            //arrange

            Biblioteca biblioteca = new Biblioteca("Argentina");

            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora", "Eckhart Tolle",
                    "psicología");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos", "Miguel Ruiz",
                    "psicologia");

            //act
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscar = biblioteca.buscarIsbn("0002");

            //assert
            assertNotNull(libroBuscar);
            assertEquals("0001", libroBuscar.getCodIsbn());

      }

      @Test
      void BuscarLibrosCat() {
            //arrange

            Biblioteca biblioteca = new Biblioteca("Argentina");
            Libro ElPoderDelAhora = new Libro("0001", "El Poder Del Ahora", "Eckhart Tolle",
                    "psicología");
            Libro LosCuatroAcuerdos = new Libro("0002", "Los Cuaotro Acuerdos", "Miguel Ruiz",
                    "psicologia");

            //act
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscarCat = biblioteca.buscarCat("psicologia");


            //assert

            assertEquals("psicologia", libroBuscarCat.getCategoria());
            System.out.println(libroBuscarCat.getCategoria());

      }

      @Test
      Biblioteca IngresarSocio(Socio socio) {
            // Arrange
            Biblioteca biblioteca = new Biblioteca("Argentina");
            Socio socio1 = new Socio(new Documento("DNI", "34504576"), "Emilinoa", "Perez", "pueyrredon 3350 ");

            //ACT
            this.biblioteca = IngresarSocio(socio);


            // Assert
            Socio added = this.biblioteca.IngresasrsocioPorDocumento(new Documento("DNI", "34504575"));
            assertEquals(socio, added);
            return biblioteca;
      }
}




















