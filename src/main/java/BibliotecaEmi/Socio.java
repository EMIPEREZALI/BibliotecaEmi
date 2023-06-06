package BibliotecaEmi;
import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Objects;

public class Socio {

 private  Documento documento;
 private  String nombre;
 private  String apellido;
 private  String direccion;

 public Socio(Documento documento, String nombre, String apellido, String direccion ) {
  this.documento = documento;
  this.nombre = nombre;
  this.apellido = apellido;
  this.direccion = direccion;
 }

 public Documento getDocument() {
  return this.documento;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Socio socio = (Socio) o;
  return documento.equals(socio.documento);
 }

 @Override
 public int hashCode() {
  return Objects.hash(documento);
 }


 }



