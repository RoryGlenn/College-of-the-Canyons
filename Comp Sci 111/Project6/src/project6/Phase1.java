package project6;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Arrays;

public class Phase1 {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        
        SORT INTEGERS
        
         */
        File file = new File("numbers.txt");
        Scanner input = new Scanner(file);
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        selectionSort(list);

        PrintWriter output = new PrintWriter("numbersWrite.txt");
        output.println(list.length);
        for (int i = 0; i < list.length; i++) {
            output.println(list[i]);
        }

        double j = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            j += list[i];
        }

        output.println("\nThe average of these numbers is " + j / list.length + "\n");

        output.close();
    }

    /*
    
    Integer sort method
    
     */
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }
    }
}
