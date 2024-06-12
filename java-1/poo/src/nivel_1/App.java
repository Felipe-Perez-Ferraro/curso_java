package nivel_1;

public class App {
    public static void main(String[] args) throws Exception {
        // instance de persona
        Estudiante persona = new Estudiante();
        persona.name = "Mati";
        persona.lastName = "Perez";
        persona.age = 21;

        // instancia de carrera
        Carrera ingInformatica = new Carrera();
        ingInformatica.nombre = "Ingenieria en informatica";
        ingInformatica.duracion = 6;
        ingInformatica.enCurso = true;

        // sumar la carrera a la persona
        persona.carrera = ingInformatica;

        System.out.println(persona.devloverPersona());
        System.out.println(persona.saludo("Messi"));

    }
}
