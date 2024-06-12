package nivel_3_getters_setters;

public class Person {
  private String nombre;
  private String apellido;
  private int edad;

  public Person(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public String saludar() {
    return "Hola " + getNombre() + " " + getApellido() + ", tenes " + getEdad() + " años.";
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}
