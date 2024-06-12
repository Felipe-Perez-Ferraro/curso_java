public class Bucles {
  public static void main(String[] args) {
    // for
    System.out.println("-- BUCLE FOR --");
    for (int i = 0; i <= 5; i++) {
      System.out.println(i);
    }
    System.out.println("");

    // while
    System.out.println("-- BUCLE WHILE --");
    int i = 0;
    
    while (i <= 5) {
      System.out.println(i);
      i++;
    }
    System.out.println("");

    // do while
    System.out.println("-- BUCLE DO WHILE --");
    int j = 5;
    do {
      System.out.println(j);
      j++;
      
    } while(j <= 4);
    System.out.println("");
    
    // break
    System.out.println("-- SENTENCIA BREAK --");
    
    for (int k = 0; k <= 5; k++) {
      System.out.println(k);
      if (k == 3) {
        break;
      }
    }
    
    System.out.println("");
      
    // continue
    System.out.println("-- SENTENCIA CONTINUE --");
    
    for (int k = 0; k <= 5; k++) {
      if (k == 3) {
        continue;
      }
      System.out.println(k);
    
    }
    
    System.out.println("");      
    
    // return
    System.out.println("-- SENTENCIA RETURN --");
    
    for (int k = 0; k <= 5; k++) {
      if (k == 3) {
        return;
      }
      System.out.println(k);
    }
    System.out.println("");
  }
}
