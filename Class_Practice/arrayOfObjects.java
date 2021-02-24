package Class_Practice;

class Student{

    int studentNumber;
    String studentName;

    Student(int stdNumber, String stdName){

        this.studentNumber = stdNumber;
        this.studentName = stdName;
    
    }
}
public class arrayOfObjects {
    public static void main(String[] args) {
        
        Student[] stdArr = new Student[4];

        stdArr[0] = new Student(123,"Jonah");
        stdArr[1] = new Student(456,"Sarah");
        stdArr[2] = new Student(789,"Phill");
        stdArr[3] = new Student(147,"Joaquin");

        int temp = 0;
        for(int i = 0; i < stdArr.length; i++){
            for(int j = 1; j < (stdArr.length-i); j++){
                if (stdArr[j-1].studentNumber > stdArr[j].studentNumber) {
                    temp = stdArr[j-1].studentNumber;
                    stdArr[j-1].studentNumber = stdArr[j].studentNumber;
                    stdArr[j].studentNumber = temp;

                }

            }
            
        }
        System.out.println("This is sorted by student number:");

        for(int i = 0; 1 < stdArr.length; i++){
            System.out.println("The student at index " + i + ": " + stdArr[i].studentNumber + " " + stdArr[i].studentName);

        }

    }
}
