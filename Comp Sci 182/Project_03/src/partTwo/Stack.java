/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partTwo;

/**
 *
 * @author RoryGlenn
 */
public class Stack {

    final int maxStackSize = 5;
    int arrayIndexPointer = -1;
    char sArray[];

    public Stack(int i) {
        sArray = new char[i];
    }
    
    public Stack(){
        sArray = new char[maxStackSize];
    }

    //pushes a new string onto the Stack 
    public void push(char x) {
    //++arrayIndexPointer will put x in the next index 
        sArray[++arrayIndexPointer] = x;
    }

    //pops a string off sArray and then looks at the previous index
    public char pop() {
        return sArray[arrayIndexPointer--];
    }

    //peek is looking at whatever arrayIndexPointer is set to
    public char peek() {
        return sArray[arrayIndexPointer];
    }

    //checks if the Stack is empty
    public boolean isEmpty() {
        return arrayIndexPointer == -1;

    }

}
