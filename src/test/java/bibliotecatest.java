
import BibliotecaEmi.Biblioteca;
import BibliotecaEmi.Libro;
import org.junit.jupiter.api.Test;
import BibliotecaEmi.Biblioteca;

import static org.testng.AssertJUnit.assertEquals;

public class bibliotecatest {
      @Test
      void agregarlibrotest(){

      //arrange

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

}