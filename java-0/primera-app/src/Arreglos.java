public class Arreglos {
  public static void main(String[] args) {
    // Forma 1
    int numeros[] = new int[5];
    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;

    // Forma 2
    int numbers[] = {10, 20, 30, 40, 50};

    // for
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Numeros array: " + numeros[i]);
    }

    // forEach
    for (int number : numbers) {
      System.out.println("Number array: " + number);
    }
  }
}
