package nivel_1;

public class Estudiante {
  // Atributos
  String name;
  String lastName;
  int age;
  Carrera carrera;

  // Metodos
  public String devloverPersona() {
    return name + ", " + lastName + ", " + age + ", estudia: " + carrera.nombre;
  }

  public String saludo(String persona) {
    return "Hola " + persona;
  }
}
