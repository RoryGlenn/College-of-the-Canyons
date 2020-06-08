/*
 * ComputeFactorial.java
 * Programmer: Benjamin Riveira
 * Description: This program demonstrates use of a recursive
 * method, factorial(), which invokes itself repeatedly.
 */

import java.util.Scanner; 

public class ComputeFactorial {
   public static void main(String[] args) {
      // Create a ComputeFactorial object
      ComputeFactorial cf = new ComputeFactorial();
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a non-negative integer: ");
      int n = input.nextInt();
      
      // Display factorial
      System.out.println("Factorial of " + n + " is " + cf.factorial(n));
   }

   /** Method returns the factorial for a specified number */
   public long factorial(int n) {
      if (n == 0) // Base case
         return 1;
      else
         return n * factorial(n - 1); // Recursive call
   }
}