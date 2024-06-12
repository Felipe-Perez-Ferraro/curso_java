package nivel_4_herencia;

// extends = Heredar la clase
public class Gato extends Animal{
    String razaGato;

    public Gato(String nombre, int edad, int cantPatas, String razaGato) {
        super(nombre, edad, cantPatas); // Super = heredar los atributos y comportamientos de la clase
        this.razaGato = razaGato;
    }

    @Override
    public String hacerRuido() {
        return "miau";
    }
}
