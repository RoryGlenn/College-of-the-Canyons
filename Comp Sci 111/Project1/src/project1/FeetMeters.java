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

public class FeetMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many feet? : ");
        
        double feet = input.nextDouble();

        // int feet = 1;
        // double feet = 1.1;
        double meters = feet * 0.305;
        
        System.out.println("That equals " + meters + " meters");
        
        
        //1 foot = .305 meter 
    }
}