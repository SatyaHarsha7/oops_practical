package practial;
import java.util.Scanner;
public class thiskeyword {
 

 
     int number;

     thiskeyword(int number) {
         this.number = number; // 'this' refers to current object's variable
     }

     void display() {
         System.out.println("Number is: " + this.number);
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         thiskeyword obj = new thiskeyword(num);
         obj.display();
         sc.close();
     }
 }