package ExerciseDesignPatterns;
import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {

        SelectNetworFactory sNetFactory = new SelectNetworFactory();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Select a network:");
        String myString = userInput.nextLine();

        CellularPlan cellularPlan = sNetFactory.getPlan(myString);
        cellularPlan.getRate();

        System.out.println("Calculate for how many minutes?");
        int myMinutes = userInput.nextInt();

        cellularPlan.ProcessBill(myMinutes);
        userInput.close();


    }
}
