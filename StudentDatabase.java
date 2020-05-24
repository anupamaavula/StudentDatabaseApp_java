import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.enroll();
        stud1.payTution();
        System.out.println(stud1.toString());

        //Ask how many students to add
        System.out.print("Enter number of new students to enroll:");
        Scanner in = new  Scanner(System.in);
        int numOfStudents  = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n=0;n<numOfStudents;n++){

            students[n] = new Student();
            students[n].enroll();
            students[n].payTution();
            // System.out.println(students[n].toString());
           
        }
        for (int n=0;n<numOfStudents;n++){
            System.out.println(students[n].toString());
        }
    
    }
}
