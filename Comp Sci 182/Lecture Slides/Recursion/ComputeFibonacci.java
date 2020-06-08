/*
 * ComputeFibonacci.java
 * Programmer: Benjamin Riveira
 * Description: This program demonstrates use of a recursive
 * method, fibonacci(), which invokes itself repeatedly.
 */
 
import java.util.Scanner;

public class ComputeFibonacci {
   public static void main(String[] args) {
      // Create a ComputeFibonacci object
      ComputeFibonacci cf = new ComputeFibonacci();
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a non-negative integer: ");
      int n = input.nextInt();
      
      // Display fibonacci number
      System.out.println("Fibonacci number for " + n + " is " + cf.fibonacci(n));
   
   }
   public long fibonacci(int n) {
      if((n == 0) || (n == 1)) // base cases
         return n;
      else
         // recurse
         return fibonacci(n - 1) + fibonacci(n - 2);         
   }

}