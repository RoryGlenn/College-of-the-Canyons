/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author RoryGlenn
 */
public class NthNumber {

    public static double status;
    public static double sum;
    public static int number;

    public static void main(String[] args) {

        status = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Calculates the sum of the"
                + " reciprocals of the first natural numbers.");
        System.out.println("Enter a number: ");
                
        number = input.nextInt();
        Recursion();
        System.out.println(" = " + sum);

    }

    public static void Recursion() {
        {
            if (status <= number) {
                System.out.print("(1 / " + status + ")");
                sum = sum + (1 / status);
                status = status + 1;
                Recursion();
            }

        }
    }
}
