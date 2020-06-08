package project_02_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinkedString {

    static Scanner input;

    private CharacterNode head;
    private int numberOfCharacters;

    public LinkedString() {
        head = null;
        numberOfCharacters = 0;
    }

    public LinkedString(char[] value) {
        if (value.length == 0) {
            return;
        }

        CharacterNode node = new CharacterNode(value[0]);

        head = node;
        numberOfCharacters++;
        CharacterNode current = head;

        for (int nodeIndex = 1; nodeIndex < value.length; nodeIndex++) {

            node = new CharacterNode(value[nodeIndex]);
            current.nextCharacter = node;
            current = current.nextCharacter;
            numberOfCharacters++;
        }
    }

    public LinkedString(String original) {
        if (original.length() == 0) {
            return;
        }

        CharacterNode node = new CharacterNode(original.charAt(0));
        head = node;
        numberOfCharacters++;
        CharacterNode current = head;

        for (int nodeIndex = 1; nodeIndex < original.length(); nodeIndex++) {
            node = new CharacterNode(original.charAt(nodeIndex));
            current.nextCharacter = node;
            current = current.nextCharacter;
            numberOfCharacters++;
        }
    }

    public char charAt(int index) {
        CharacterNode current = head;

        for (int nodeIndex = 0; nodeIndex < numberOfCharacters; nodeIndex++) {
            if (nodeIndex == index) {
                return current.character;
            } else {
                current = current.nextCharacter;
            }
        }
        throw new InputMismatchException();
    }

    public LinkedString concat(LinkedString str) {
        if (str.head == null) {
            return this;
        } else if (head == null) {
            numberOfCharacters = str.length();
            return str;
        } else {
            CharacterNode current = head;
            while (current.nextCharacter != null) {
                current = current.nextCharacter;
            }

            current.nextCharacter = str.head;
            numberOfCharacters += str.length();
            System.out.println(current);
        }
        return this;
    }

    public void isEmpty() {

        if (numberOfCharacters == 0) {
            System.out.println("True: List is empty");
        } else {
            System.out.println("False: List is not empty");
        }
    }

    public int length() {
        return numberOfCharacters;
    }

    public LinkedString substring(int beginIndex, int endIndex) {
        String substr = "";

        for (int nodeIndex = beginIndex; nodeIndex <= endIndex; nodeIndex++) {
            substr += charAt(nodeIndex);
        }

        LinkedString linkedSubstring = new LinkedString(substr);

        return linkedSubstring;
    }

    @Override
    public String toString() {
        String result = "";
        CharacterNode current = head;

        for (int i = 0; i < numberOfCharacters; i++) {
            result += current.character + "";
            current = current.nextCharacter;
        }
        return result;
    }

}
