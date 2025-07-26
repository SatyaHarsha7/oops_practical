package practial;
import java.util.Scanner;
public class bitwise {
 public static void main(String args[]) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter value of a:");
  int a = scanner.nextInt();
  System.out.println("enter value of b:");
  int b = scanner.nextInt();
  int c = a&b;
  System.out.println("a&b = "+c);
  int d=a|b;
  System.out.println("a|b = "+d);
 }

}