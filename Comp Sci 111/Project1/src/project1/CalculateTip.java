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

public class CalculateTip {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your subtotal? : ");
        double subtotal = input.nextDouble();
        
        System.out.println("What percentage do you want to tip? : ");
        double tiprate = input.nextDouble();
        
        double tip = subtotal * tiprate;
        double total = subtotal + tip;
        
        System.out.println("Your total is: " + total);
    }
}