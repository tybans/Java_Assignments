import java.util.Scanner;

public class GradeAndGpa {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the Total Marks: ");
        double totalMarks = object.nextDouble();
        System.out.print("Enter the Marks Obtained: ");
        double obtainedMarks = object.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100.0;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        double gpa = 0.0;
        if (percentage >= 90.0) {
            System.out.println("Grade A");
            gpa = 4.0;
        } else if (percentage >= 80.0) {
            System.out.println("Grade B");
            gpa = 3.0;
        } else if (percentage >= 70.0) {
            System.out.println("Grade C");
            gpa = 2.0;
        } else if (percentage >= 60.0) {
            System.out.println("Grade D");
            gpa = 1.0;
        } else {
            System.out.println("Grade F");
            gpa = 0.0;
        }

        System.out.println("GPA: " + gpa);
        object.close();
    }
    
}
