public class variables {
  public static void main(String[] args) {
    /*
    VARIABLES
      * Espacio en la memoria que tiene un nombre asociado y un valor cambiante
    DECLARACION
      * Asignar el tipo de dato y el nombre de la variable sin valor inicial
    DEFINICION
      * Asignar el tipo de dato y el nombre de la variable dandole o no un valor inicial
    ASIGNACION
      * Darle un valor a la variable ya declarada
    */ 

    /* 
    TIPOS DE VARIABLES
      * Variales Primitivas: Almacenan valores basicos
      * Variables de referencia: Almacenan direcciones de memoria que apuntan a objetos 
    */

    // VARIABLES PRIMITIVAS

    // Tipos de datos enteros byte, short, int, long
    byte numeroChico = 5;
    int numero = 50000; 
    
    // Tipos de datos reales: float y double
    double decimal = 3.2;

    // Caracter
    char caracter = 'c';

    // Booleanos
    boolean valor = false;

    // String
    String cadena = "Cadena de texto";

    System.out.println(numeroChico);
    System.out.println(numero);
    System.out.println(decimal);
    System.out.println(caracter);
    System.out.println(valor);
    System.out.println(cadena);
  }
}
