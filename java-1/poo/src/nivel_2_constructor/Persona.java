package nivel_2_constructor;

public class Persona {
  String nombre;
  String apellido;
  int edad;
  Profesion carrera;

  // Constructor
  public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera, Boolean enCurso) {
    carrera = new Profesion(nombreCarrera, duracionCarrera, enCurso);
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public String presentacion() {
    return this.nombre + " | " + this.apellido + " | " + this.edad + " | " + carrera.nombre;
  }
}
