public class CadenaDeTexto {
  public static void main(String[] args) {
    String texto = "Este es el mejor texto del mundo";
    String espaciado = "   Mucho espacio sacado    ";

    int longitud = texto.length();
    System.out.println(longitud);

    char caracter = texto.charAt(0);
    System.out.println(caracter);

    String subCadena = texto.substring(0, 4);
    System.out.println(subCadena);

    String minusucula = texto.toLowerCase();
    System.out.println(minusucula);

    String mayuscula = texto.toUpperCase();
    System.out.println(mayuscula);

    int indice = texto.indexOf("Este");
    System.out.println(indice);

    String remplazar = texto.replace("mundo", "planeta");
    System.out.println(remplazar);

    boolean contiene = texto.contains("planeta");
    System.out.println(contiene);

    String sinEspacio = espaciado.trim();
    System.out.println(sinEspacio);
  }
}
