package practial;
import java.util.Scanner;

public class arithmetic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter value for a: ");
    int a = scanner.nextInt();

    System.out.print("Enter value for b: ");
    int b = scanner.nextInt();

    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    scanner.close();
  }
}