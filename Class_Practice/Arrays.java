package Class_Practice;

public class Arrays {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[5];
        arr[0] = 5000;
        arr[1] = 150;
        arr[2] = 50;
        arr[3] = 478;
        arr[4] = 326;
        
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length-i); j++){
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }
            
        }
        System.out.println("This is sorted:");

        for(int i = 0; i < arr.length; i++){
            System.out.println("Number at index "+ i +": "+ arr[i]);
        }
    }
}
