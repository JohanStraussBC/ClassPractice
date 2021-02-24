package Factory_Design;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
        CatFactory catFactory = new CatFactory();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the catalogue you want:");
        String myString = userInput.nextLine();

        Catalogue catalogue = catFactory.GetCategory(myString);
        catalogue.DisplayCatalogue();  
        userInput.close(); 
     }
    
}
