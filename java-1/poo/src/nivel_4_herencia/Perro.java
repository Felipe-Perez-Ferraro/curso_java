package nivel_4_herencia;

public class Perro extends Animal{
    public Perro(String nombre, int edad, int cantPatas) {
        super(nombre, edad, cantPatas);
    }

    @Override
    public String hacerRuido() {
        return "guau";
    }
}
