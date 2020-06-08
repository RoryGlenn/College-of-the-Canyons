/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author RoryGlenn
 */
public class Phase2 {

    public static void main(String[] args) throws FileNotFoundException {

        File fileString = new File("inputstrings.txt");
        Scanner inputString = new Scanner(fileString);

        String[] arrayString = new String[inputString.nextInt()];
        inputString.nextLine();

        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = inputString.nextLine();
        }

        sortString(arrayString);

        // write string to new document
        PrintWriter outputString = new PrintWriter("inputstringsWrite.txt");
        outputString.println(arrayString.length);
        for (int i = 0; i < arrayString.length; i++) {
            outputString.println(arrayString[i]);
        }
        outputString.println(arrayString[((arrayString.length - 1) / 2)]);
        outputString.close();
    }

    public static void sortString(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            // Find the minimum in the list[i..list.length-1]
            String currentMin = arrayString[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < arrayString.length; j++) {
                if (currentMin.compareTo(arrayString[j]) > 0) {
                    currentMin = arrayString[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                arrayString[currentMinIndex] = arrayString[i];
                arrayString[i] = currentMin;
            }

        }
    }
}
