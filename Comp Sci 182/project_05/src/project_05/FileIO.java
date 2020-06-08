package project_05;

import java.io.*;
import java.util.Scanner;

/**
 * @author RoryGlenn
 */
public class FileIO {

    File file = new File("test.txt");

    // Constructor
    public FileIO(PhoneBook phoneBook) {
        countNodesInTree(phoneBook);
    }

    public void countNodesInTree(PhoneBook phoneBook) {
        
        // 1: Count how many nodes the tree is holding
        // 2: Save name and phonenumbers of each node into an array 
        
        phoneBook.printInorder();
        
//        for (int i = 0; i < arr.length; i++) {
//            Object object = arr[i];
//
//        }
    }

    public void writeToFile(PhoneBook phonebook) {

        // Writes name and age to the file
        try {

            PrintWriter output = new PrintWriter(file);

            output.println("Mile Fudge");
            output.println(42);
            output.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(file.toString() + " not found");
        }
    }

    // Reads from the file and prints to console
    public void readFromFile() {

        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();

            System.out.println("Name: " + name + "\nAge : " + age);
        }
        catch (FileNotFoundException e) {
            System.out.println(file.toString() + " not found");
        }
    }
}
