/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author RoryGlenn
 */

import java.util.Scanner;

public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = 1.0;
        System.out.println("Please enter the temperature in celsius: ");
        double celsius = input.nextDouble();
        
        // Conversion formula
        fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        
        System.out.println("temperature in fahrenheit is:  " + fahrenheit);
  }
}
