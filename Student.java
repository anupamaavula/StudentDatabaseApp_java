import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int  gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance=0;
    private static int costOfCourse =600;
    private static int id=1000;



    //Constructor :prompt to enter name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student firstname:");
        this.firstName= in.nextLine();

        System.out.print("Enter Student lastname:");
        this.lastName = in.nextLine();

        System.out.println("Choose Gradelevel from : ");
        System.out.print("1. Freshman\n2. Sophmore\n3. Junior\n4.Senior\nEnter Student Grade level:");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName+" "+lastName +" "+gradeYear+studentID);
     }

    //Generate ID

    private void setStudentID(){
        id++;
       this.studentID = gradeYear+" "+id;


    }

    //Enroll in courses
    public void enroll(){
    do{
        System.out.println("Enter course to enroll to enroll(Q to quit):");
        Scanner in = new Scanner(System.in);
        String course =in.nextLine();
        if(!course.equals("Q")){
            courses =courses + "\n " + course;
            tutionBalance = tutionBalance + costOfCourse;

        }
        else{
            break;
        }
    }while(1 != 0);
        System.out.println("Enrolled In:" + courses);
        // System.out.println("Tution Balance:"+tutionBalance);


    }
    //View balance

    public void viewBalance(){
        System.out.println("Your balance is:$" + tutionBalance);
    }

    //Pay tution
    public void payTution(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    //Show status

    public String  toString(){
        return "Name:"+ firstName +" "+lastName + 
        "\nGrade Level:" + gradeYear +
        "\nStudentID:" + studentID +
        "\nCourses Enrolled:"+courses + 
        "\nBalance: $"+ tutionBalance;
    
}

}