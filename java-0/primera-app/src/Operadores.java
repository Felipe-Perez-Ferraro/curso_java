public class Operadores {
  public static void main(String[] args) {
    // OPERADORES: Simbolos que sirven para hacer operacines con variables o valores
    
    // Aritmeticos
    int a = 4;
    int b = a + 4;
    System.out.println("--- OPREADORES ARITMETICOS ---");
    System.out.println(b);

    // Asignacion
    int c = 5;
    c=10;
    c+=40;
    c-=15;
    c*=2;
    c/=10;
    c++;
    c--; 
    System.out.println("--- OPREADORES DE ASIGNACION ---");
    System.out.println(c);

    // Comparacion
    int mayor = 10;
    int menor = 5;

    boolean esMayor = mayor > menor;
    boolean esMenor = menor < mayor;
    boolean esIgual = mayor == menor;

    System.out.println("--- OPREADORES DE COMPARACION ---");
    System.out.println(esMayor);
    System.out.println(esMenor);
    System.out.println(esIgual);

    // Logica
    boolean condicion1 = true;
    boolean condicion2 = false;

    boolean resultadoAND = condicion1 && condicion2; // Ambos tienen que ser true para que de true
    boolean resultadoOR = condicion1 || condicion2; // Con que haya un solo true va a ser verdadero
    boolean resulatdoNOT = !condicion1; // Lo opuesto a lo que tenga asignado

    System.out.println("--- OPREADORES DE LOGICA  ---");
    System.out.println(resultadoAND);
    System.out.println(resultadoOR);
    System.out.println(resulatdoNOT);
  }
}
