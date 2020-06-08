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

    public static double count;
    public static double sum;
    public static int number;

    public static void main(String[] args) {

        count = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("This program calculates the sum of the"
                + " reciprocals of the first n natural numbers.\n"
                + "Enter a number for n: ");
        number = input.nextInt();
        Recursion();
        System.out.println(" = " + sum);

    }

    public static void Recursion() {

       
        {
            if (count <= number) {
                System.out.print("(1 /" + count + ")");
                sum += (1 / count);
                count++;
                Recursion();
            }
        }
    }
}
