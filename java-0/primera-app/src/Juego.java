import java.util.Scanner;

public class Juego {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Que queres tomar");

    System.out.println("1 - Agua");
    System.out.println("2 - Vodka");
    int opcion = scanner.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Podes manejar");
        break;
      
      case 2:
        System.out.println("No podes manejar");
        break; 
    
      default:
        System.out.println("Ingresa una bebida valida");
        break;
    }

    scanner.close();
  }
}
