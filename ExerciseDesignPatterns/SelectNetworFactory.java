package ExerciseDesignPatterns;


public class SelectNetworFactory {

    CellularPlan cellularPlan;
    
    public CellularPlan getPlan(String network){

        switch (network) {
            case "abc":
                cellularPlan = new abcNetwork();
                break;
        
            case "pqr":
                cellularPlan = new pqrNetwork();
                break;

            case "xyz":
                cellularPlan = new xyzNetwork();
                break;
        
            default:
                System.out.println("Does not exist");
                break;    
        }
        return cellularPlan;

    }
}
