package practial;

public class accessspecifiers {
 
     private void privateMethod() {
         System.out.println("Private method: only in same class");
     }

     void defaultMethod() {
         System.out.println("Default method: same package");
     }

     protected void protectedMethod() {
         System.out.println("Protected method: subclasses + same package");
     }

     public void publicMethod() {
         System.out.println("Public method: everywhere");
     }

     public static void main(String[] args) {
         accessspecifiers obj = new accessspecifiers();
         obj.privateMethod();
         obj.defaultMethod();
         obj.protectedMethod();
         obj.publicMethod();
     }
 }