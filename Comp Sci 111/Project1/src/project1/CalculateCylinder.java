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

public class CalculateCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your Cylinder? : ");

        double radius = input.nextDouble();

            System.out.println("What is the length of your Cylinder? : ");
        
        double length = input.nextDouble();
        
        double area = radius * radius * 3.14159; // that is pi
        double volume = area * length;
        
        System.out.println("The area of your Cylinder is: " + area);
        System.out.println("The volume of your Cylinder is: " + volume);
    }
    
}
