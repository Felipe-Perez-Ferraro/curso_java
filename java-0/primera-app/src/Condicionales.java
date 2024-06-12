public class Condicionales {
  public static void main(String[] args) {
    int edad = 61; 

    System.out.println("-- IF, ELSE IF, ELSE --");
    if (edad >= 18 && edad <= 60) {
      System.out.println("Podes entrar al bolo");
    } else if (edad > 60) {
      System.out.println("Sos muy grande");
    } else {
      System.out.println("No podes pasar ");
    }
    System.out.println("");

    System.out.println("-- SWITCH --");
    String bebida = "Agua";
    
    switch (bebida) {
      case "Agua":
        System.out.println("Podes manejar");
        break;
      
      case "Vodka":
        System.out.println("No podes manejar");
        break; 
    
      default:
        System.out.println("Ingresa una bebida valida");
        break;
    }
  }
}
