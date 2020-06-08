package project_02_03;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Project_02_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] chars = {'H', 'e', 'l', 'l', 'o'};

        LinkedString list1 = new LinkedString(chars);

        System.out.println("Original characters in the list: " + list1);

        System.out.print("\nIs list empty? ");
        list1.isEmpty();

        System.out.println("\nThe length of the characters: " + list1.length());

        System.out.println("\nEnter the position of a character to display: ");
        int userIndex = input.nextInt();

        System.out.println("The character for index " + userIndex + " is: " + (list1.charAt(userIndex)));

//        int userIndex;
//        boolean loop = true;
//
//        while (loop = true) {
//            try {
//                userIndex = input.nextInt();
//                System.out.println("The character for index " + userIndex + " is: " + (list1.charAt(userIndex)));
//                loop = false;
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println(e.toString());
//                System.out.println("Index out of bounds. Please try again: ");
//                userIndex = input.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println(e.toString());
//                System.out.println("Not a valid input. Please try again: ");
//                userIndex = input.nextInt();
//            }
//
//        }
        //Checks if user input is within bounds
//        boolean loop = true;        
//
//        while (loop == true) {
//            if ((userIndex < 0) || (userIndex > list1.length() - 1)) {
//                System.out.println("\nThat position does not exist");
//                System.out.println("Please enter a number from 0 to " + (list1.length() - 1));
//                userIndex = input.nextInt();
//            } else if ((list1.length() >= userIndex) && (userIndex >= 0)) {
//                loop = false;
//            } else {
//                System.out.println("\nThat is not a valid input. Try again");
//                userIndex = input.nextInt();
//            }
//        }
        System.out.println("\nEnter the string: ");

        String s1 = input.next();

        LinkedString list2 = new LinkedString(s1);

        System.out.println("Second string: " + list2);

        System.out.println("Concatenated string: " + list1.concat(list2));

        System.out.println("\nEnter the starting and ending index for a substring");

        int start = input.nextInt();
        int end = input.nextInt();

//        int listTotal = list1.length() + list2.length();
//        boolean loop2 = true;
//
//        while (loop2 == true) {
//            if ((start + end < 0) || (listTotal + 10 < start + end)) {
//                System.out.println("\nThat position does not exist");
//                System.out.println("Please enter a number for the starting and ending index "
//                        + "from 0 to  " + listTotal);
//                start = input.nextInt();
//                end = input.nextInt();
//            } else if ((listTotal + 10 >= start + end) && (start + end >= 0)) {
//                loop2 = false;
//            } else {
//                System.out.println("\nThat is not a valid input. Try again");
//                start = input.nextInt();
//                end = input.nextInt();
//            }
//        }
        System.out.println("substring from the positions " + start + " to "
                + end + " is: " + list1.substring(start, end));
    }

}
