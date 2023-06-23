//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package BibliotecaEmi;

import java.util.Objects;

public class Socio {
 private Documento documento;
 private String nombre;
 private String apellido;
 private String direccion;

 public Socio(Documento documento, String nombre, String apellido, String direccion) {
  this.documento = documento;
  this.nombre = nombre;
  this.apellido = apellido;
  this.direccion = direccion;
 }

 public Documento getDocument() {
  return this.documento;
 }

 public boolean equals(Object o) {
  if (this == o) {
   return true;
  } else if (o != null && this.getClass() == o.getClass()) {
   Socio socio = (Socio)o;
   return this.documento.equals(socio.documento);
  } else {
   return false;
  }
 }

 public int hashCode() {
  return Objects.hash(new Object[]{this.documento});
 }
}
