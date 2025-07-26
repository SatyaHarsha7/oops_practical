package practial;
import java.util.Scanner;
public class relationaloperator {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter value for a: ");
         int a = input.nextInt();
         System.out.print("Enter value for b: ");
         int b = input.nextInt();
         System.out.println("a is " + a + " and b is " + b);
         System.out.println("a == b: " + (a == b));
         System.out.println("a != b: " + (a != b));
         System.out.println("a > b: " + (a > b));
         System.out.println("a < b: " + (a < b));
         System.out.println("a >= b: " + (a >= b));
         System.out.println("a <= b: " + (a <= b));
     }
 }