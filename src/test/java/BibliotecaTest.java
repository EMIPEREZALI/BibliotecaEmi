
import BibliotecaEmi.Biblioteca;
import BibliotecaEmi.Libro;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
      @Test
      void agregarlibrotest(){

      //arrange prueba

      Biblioteca biblioteca = new Biblioteca("Argentina");

      Libro ElPoderDelAhora = new Libro("0001","El Poder Del Ahora");
      Libro LosCuatroAcuerdos = new Libro( "0002", "Los Cuaotro Acuerdos");

      //act
      // cantidad de libros que quiero pasar con su nombre
      biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
       // pruebo cuantos inserto
      //assert
      assertEquals(2,biblioteca.getLibros().size());



      }

      @Test
      void agregarLibrosDuplicadosShouldFailTest(){

            //arrange

            Biblioteca biblioteca = new Biblioteca("Argentina");

            Libro elPoderDelAhora = new Libro("0001","El Poder Del Ahora") ;


            //act

            biblioteca.insertarLibro(elPoderDelAhora);
            biblioteca.insertarLibro(elPoderDelAhora);

            //assert
            assertEquals(1, biblioteca.getLibros().size());

      }
      @Test
      void BuscarLibros(){
            //arrange
            Biblioteca biblioteca = new Biblioteca("Argentina");

            Libro ElPoderDelAhora = new Libro("0001","El Poder Del Ahora","Eckhart Tolle",
                    "psicología");
            Libro LosCuatroAcuerdos = new Libro( "0002", "Los Cuaotro Acuerdos","Miguel Ruiz",
                    "psicologia");

            //act
            biblioteca.insertarLibro(ElPoderDelAhora);
            biblioteca.insertarLibro(LosCuatroAcuerdos);
            Libro libroBuscar = biblioteca.buscarIsbn("0001");

            //assert
            assertNotNull(libroBuscar);
            assertEquals("0002", libroBuscar.getCodIsbn());









      }

      }
