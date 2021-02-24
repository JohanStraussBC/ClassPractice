package Factory_Design;

public class CatFactory {

    Catalogue catalogue;

    public Catalogue GetCategory(String type){

        switch (type) {
            case "shirt":
                catalogue = new Shirt();
                break;
        
            case "trousers":
                catalogue = new Trousers();
                break;
        
            default:
                System.out.println("Does not exist");
                break;    
        }
        return catalogue;

    }
    
}
