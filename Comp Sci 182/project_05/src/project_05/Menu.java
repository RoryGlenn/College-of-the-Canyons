package project_05;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    PhoneBook phoneBook = new PhoneBook();

    public Menu() throws IOException {

        System.out.println("Hello and welcome to the phone book application");
        System.out.println("Options: ");
        System.out.println("1: Adds a person’s name and phone number to the phone book.");
        System.out.println("2: Deletes a given person’s name and phone number from the phone book, given only the name.");
        System.out.println("3: Locates a person’s phone number, given only the person’s name.");
        System.out.println("4: Changes a person’s phone number, given the person’s name and new phone number.");
        System.out.println("5: Quits the application after first saving the phone book in a text file.");

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        switch (x) {

            // addNode
            case 1: {



                Scanner inputName = new Scanner(System.in);
                Scanner inputPhoneNumber = new Scanner(System.in);
                String name;
                long phoneNumber;

                System.out.println("Type the person's name to add to the phone book");
                name = inputName.nextLine();

                System.out.println("Type the person's phone number to add to the phone book");
                phoneNumber = inputPhoneNumber.nextLong();

                phoneBook.addNode(name, phoneNumber);

                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Added");

                break;
            }

            // deleteNode
            case 2: {

                Scanner inputName = new Scanner(System.in);
                String name;

                System.out.println("Type the person's name to delete from the phone book");
                name = inputName.nextLine();

                phoneBook.deleteNode(name);

                System.out.println(name + " Deleted");

                break;
            }

            // findNode
            case 3: {
                Scanner inputName = new Scanner(System.in);
                String name;

                System.out.println("Type the person's name that you are looking for ");

                name = inputName.nextLine();

                System.out.println(phoneBook.findNode(name));

                break;
            }

            // changeNode
            case 4: {
                // Changes a person’s phone number, given the person’s name and new phone number

                long phoneNumber;
                String name;
                Scanner inputU = new Scanner(System.in);

                System.out.println("Type the person's name that you want to change");
                name = inputU.nextLine();

                System.out.println("Type their new phone number");
                phoneNumber = inputU.nextLong();

                phoneBook.changeNode(name, phoneNumber);

                System.out.println(name + "'s new phone number is " + phoneNumber);

                break;
            }

            // quit
            case 5: {

                //String[] phoneBookArray = new String[phoneBook.printInorder()];
                //phoneBook.printInorder()
                //FileIO fileio = new FileIO(phoneBook);
            
                
                phoneBook.quit();
                break;
            }
            default: {

                break;
            }
        }
    }
}
