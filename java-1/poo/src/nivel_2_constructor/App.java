package nivel_2_constructor;

public class App {
  public static void main(String[] args) throws Exception {
    Persona messi = new Persona("Leo", "Messi", 37, "Fulvo", 6, false);

    System.out.println(messi.presentacion());
  }
}
