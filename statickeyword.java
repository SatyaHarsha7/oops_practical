package practial;
import java.util.Scanner;
public class statickeyword {
 

 
     static int count = 0;

     statickeyword() {
         count++;
     }

     static void displayCount() {
         System.out.println("Total objects created: " + count);
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("How many objects to create? ");
         int n = sc.nextInt();

         for (int i = 0; i < n; i++) {
             new statickeyword();
         }

         statickeyword.displayCount();
         sc.close();
     }
 }