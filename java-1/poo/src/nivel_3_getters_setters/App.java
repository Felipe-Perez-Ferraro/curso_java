package nivel_3_getters_setters;

public class App {
  public static void main(String[] args) {
    Person felipe = new Person("Felipe", "Perez Ferraro", 21);

    System.out.println(felipe.saludar());

    felipe.setNombre("Jorge");

    System.out.println(felipe.saludar());
  }  
}
