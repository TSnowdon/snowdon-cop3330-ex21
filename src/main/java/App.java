import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    public static void main(String[] args) {
        int number;
        String outputState = "default";
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        try {
            number = reader.nextInt();
            switch (number) {
                case 1:
                    outputState = "January";
                    break;
                case 2:
                    outputState = "February";
                    break;
                case 3:
                    outputState = "March";
                    break;
                case 4:
                    outputState = "April";
                    break;
                case 5:
                    outputState = "May";
                    break;
                case 6:
                    outputState = "June";
                    break;
                case 7:
                    outputState = "July";
                    break;
                case 8:
                    outputState = "August";
                    break;
                case 9:
                    outputState = "September";
                    break;
                case 10:
                    outputState = "October";
                    break;
                case 11:
                    outputState = "November";
                    break;
                case 12:
                    outputState = "December";
                    break;
                default:
                    outputState = "Unknown Month";
            }
            System.out.println("The name of the month is " + outputState + ".");
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
