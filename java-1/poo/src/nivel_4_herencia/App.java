package nivel_4_herencia;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal class", 10, 4);
        Gato gato = new Gato("Gato class", 10, 4, "Siames");
        Perro perro = new Perro("Perro class", 10, 4);

        System.out.println("La clase: " + animal.nombre + " hace: " + animal.hacerRuido());
        System.out.println("La clase: " + gato.nombre + " hace: " + gato.hacerRuido());
        System.out.println("La clase: " + perro.nombre + " hace: " + perro.hacerRuido());

        System.out.println(Animal.getContadorAnimales());
    }
}
