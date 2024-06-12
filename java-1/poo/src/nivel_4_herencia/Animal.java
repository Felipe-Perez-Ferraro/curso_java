package nivel_4_herencia;

public class Animal {
    String nombre;
    int edad;
    int cantPatas;
    // Para acceder desde cualquier parte se usa static
    static int contadorAnimales;

    public Animal(String nombre, int edad, int cantPatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantPatas = cantPatas;
        contadorAnimales++;
    }

    public String hacerRuido() {
        return "Ruido general";
    }
    
    public static String getContadorAnimales() {
        return "La cantidad de animales es de: " + contadorAnimales;
    }
}
