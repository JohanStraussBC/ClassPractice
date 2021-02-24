package Class_Practice;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a string:");
        String myString = userInput.nextLine();
        System.out.println("Your entered string is: " + myString);

        System.out.println("Enter a number:");
        int number = userInput.nextInt();
        System.out.println("The number you entered is: "+ number);



        userInput.close();


    }
}
