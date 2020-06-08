package RecursiveGrammars;

import java.util.Scanner;

/*
 * Programmer: Benjamin Riveira
 * Source Code File: Palindrome.java
 * Description: The isPal() method in this program 
 * is a Java implementation of the recursive
 * recognition algorithm for palindromes shown on 
 * page 325 of the textbook.
 */
public class Palindrome {
    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        String userInput = "";
        
        while(loop) {
            System.out.print("Enter a string and I will "
                    + "tell you if it is a palindrome: ");
            userInput = input.nextLine();
            if(pal.isPal(userInput)) {
                System.out.println("Yes, " 
                        + userInput + " is a palindrome!");
            }
            else {
                System.out.println("No, " + userInput 
                        + " is not a palindrome.");
            }
            System.out.print("Check another string?> ");
            userInput = input.nextLine();
            if(userInput.toUpperCase().startsWith("N") 
                    || userInput.equalsIgnoreCase("No")) {
                loop = false;
            }
        }
    }
    /**
     * Method: isPal()
     * Precondition: w is a String
     * @return true if w is a palindrome, false if w is 
     * not a palindrome
     */
    public boolean isPal(String w) {
        // if (w is the empty string or w is of length 1
        if(w.isEmpty() || w.length() == 1) {
            return true;
        }
        // if (w's first and last characters are the same letter
        else if(w.charAt(0) == w.charAt(w.length() - 1)) {
            // return w minus its first and last characters
            return isPal(w.substring(1, w.length() - 1));
        }
        else {
            return false;
        }
    }
}
