/*
 * Programmer: Benjamin Riveira
 * Description: This is a driver program which will test the
 * StackReferenceBased ADT given on pages 368 to 369 in the textbook.
 */
public class StackTester {
    public static void main(String[] args) {
        // Create an empty stack
        StackReferenceBased stack = new StackReferenceBased();
        
        // push a set of characters onto the stack
        String characters = "Hello there world!";
        for(int i = 0; i < characters.length(); i++) {
            stack.push(characters.charAt(i));
        }
        System.out.println("Characters pushed onto stack!");
        // Repeatedly pop characters off the stack and 
        // display them.
        // Precondition: Stack contains the characters
        // "Hello there world!".
        // Postcondition: Stack is empty, characters
        // "!dlrow ereht olleH" are displayed.
        for(int i = 0; i < characters.length(); i++) {
            System.out.print(stack.pop());
        }
        if(stack.isEmpty()) {
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("The stack contains extra characters!");
        }
        
        String characters2 = "Welcome to Java!";
        for(int i = 0; i < characters2.length(); i++) {
            stack.push(characters2.charAt(i));
        }
        // Test the peek() method
        // Precondition: Stack contains the characters
        // "Welcome to Java!".
        // Postcondition: The last character pushed onto the
        // stack (!) is displayed no matter how many times we
        // invoke peek().
        System.out.println("The character at the top of stack is: " 
                + stack.peek());
        System.out.println("The character at the top of stack is: " 
                + stack.peek());
        System.out.println("The character at the top of stack is: " 
                + stack.peek());
        
        // Test the popAll() method
        // Precondition: Stack contains the characters 
        // "Welcome to Java!"
        // Postcondition: The stack is empty/contains no characters.
        stack.popAll();
        System.out.println("After popAll(), is the stack empty? " 
                + stack.isEmpty());
    }
}
