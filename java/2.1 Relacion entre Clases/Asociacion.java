import java.util.ArrayList;
import java.util.List;
// La Asociación es una relación existente entre dos clases. 
// Prácticamente todas las clases de un programa están relacionadas.

class MascotaP {
  private String animal;
  private String raza;
  private String nombre;
  
  public MascotaP(String animal, String raza, String nombre) {
    this.animal = animal;
    this.raza = raza;
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "{" +
      "animal='" + animal + "'" +
      ", raza='" + raza + "'" +
      ", nombre='" + nombre + "'" +
      "}";
  }

}

class Persona {
  private String nombre;
  private List<MascotaP> mascotas = new ArrayList<>();
  
  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public void addMascota(MascotaP mascota) {
    mascotas.add(mascota);
  }

  @Override
  public String toString() {
    return "{" +
      "nombre='" + nombre + "'" +
      ", mascotas='" + mascotas + "'" +
      "}";
  }
}
  
public class Asociacion {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Persona yo = new Persona("René Cruz");
    yo.addMascota(new MascotaP("Perro", "Schnauzer", "Cydia"));
    System.out.println(yo); //{nombre='René Cruz', mascotas='[{animal='Perro', raza='Schnauzer', nombre='Cydia'}]'}

    Persona tu = new Persona("Ana Ruíz");
    tu.addMascota(new MascotaP("Perro", "Pug", "Pinky"));
    tu.addMascota(new MascotaP("Gato", "Persa", "Lu"));
    System.out.println(tu); 
    //{nombre='Ana Ruíz', mascotas='[{animal='Perro', raza='Pug', nombre='Pinky'}, {animal='Gato', raza='Persa', nombre='Lu'}]'}

    Persona el = new Persona("Rosa Durán");
    System.out.println(el); //{nombre='Rosa Durán Hernández', mascotas='[]'}
  }
}