
import java.util.Scanner;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    /*	10. Napisz program, który konwertuje wszystkie znaki we wprowadzonym ciągu na małe litery:
    - Program przyjmuje łańcuch znaków wprowadzony przez użytkownika.
    - Konwertuje wszystkie znaki w łańcuchu na małe litery.
    - Przetworzony łańcuch jest wyświetlany na ekranie.
      */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj ciąg znaków: ");
    String input = scanner.nextLine();
    System.out.println(input.toLowerCase());
    
  }


}