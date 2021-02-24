package Class_Practice;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        
        List<String> arrList = new ArrayList<String>();

        arrList.add("Johan");
        arrList.add("Bean");
        arrList.add("Sarah");
        arrList.add("Ragnar");

        //System.out.println(arrList);
        arrList.remove("Johan");

        Iterator itr = arrList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
