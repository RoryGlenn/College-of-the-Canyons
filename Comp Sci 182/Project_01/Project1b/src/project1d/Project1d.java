/* Project 1
 * Programmer: Rory Glenn
 * Section #28928
 * Class: Comp Sci 182
 * Prof: Benjamin Riveira
 */
package project1d;

import java.util.Scanner;

public class Project1d {

    public static double userAccountBalance;
    public static String userName;
    public static String userDueDate;
    public static long userAccountNumber;
    public static String userRewardPoints;

    public static void main(String[] args) {

        Scanner userSwitch = new Scanner(System.in);
        Scanner nameinput = new Scanner(System.in);
        Scanner userAccountNum = new Scanner(System.in);

        CreditCard card = new CreditCard();

        System.out.println("Hello and welcome to your new ADT credit card");
        System.out.println("Please enter your name");

        userName = nameinput.nextLine();
        card.setName(userName);

        System.out.println("Hello " + userName + "\n");

        boolean cardLoop = true;

        while (cardLoop) {

            System.out.println("Main Menu");
            System.out.println("What do you want to see?");
            System.out.println("1: Account Balance");
            System.out.println("2: Account Name");
            System.out.println("3: Reward Points");
            System.out.println("4: Account Number");
            System.out.println("5: Due Date");
            System.out.println("6: Exit");

            int userChoice = userSwitch.nextInt();

            switch (userChoice) {

                case 1: {
                    userAccountBalance = card.getAccountBalance();
                    System.out.println("Balance = $ " + userAccountBalance);

                    if (userAccountBalance == 0) {
                        System.out.println("You haven't made any purchases yet.\n"
                                + "Don't you want to be in debt?!\n");
                    } else if (userAccountBalance > 0) {
                        System.out.println("Hope the debt was worth it\n");
                    } else if (userAccountBalance < 0) {
                        System.out.println("Looks like we owe you money "
                                + "in the form of reward points!\n");
                    } else {
                        System.out.println("Not a valid input\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Name on credit card account: " + userName + "\n");
                    break;
                }
                case 3: {
                    System.out.println("Reward points are earned through 1% "
                            + "of total purchases.");
                    System.out.println("Your reward points are $ "
                            + card.getAccountBalance() + " x 0.01\n");
                    break;
                }
                case 4: {

                    System.out.println("Please set up your 16 digit account number");
                    System.out.println("Do not use spaces");

                    userAccountNumber = userAccountNum.nextLong();
                    card.setAccountNumber(userAccountNumber);
                    System.out.println("Your account number is: " + card.getAccountNumber());
                    break;
                }
                case 5: {
                    userDueDate = "30 days after initial opening of account";
                    System.out.println(userDueDate + "\n");
                    break;
                }
                case 6: {
                    cardLoop = false;
                    break;
                }
                default: {
                    System.out.println("Not a valid input\n");
                    break;
                }
            }

        }
    }
}