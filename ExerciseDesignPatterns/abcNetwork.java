package ExerciseDesignPatterns;
import java.util.Scanner;

public class abcNetwork implements CellularPlan {
    Double rate = 0.0;
    @Override
    public void getRate(){
          rate = 0.50;
         
    }

    @Override
    public void ProcessBill(int Minutes){
        
        Scanner userInput = new Scanner(System.in);

        Double bill = (Double) (Minutes * rate);
        System.out.println("Your bill is: " + bill);
        userInput.close();


    }
}
