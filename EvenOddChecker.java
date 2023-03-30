import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner obj2 = new Scanner(System.in);
        char input;

        do {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.print("Please enter the number: ");
            int number = obj2.nextInt();

            if (number % 2 == 0) {
                System.out.println("The given number is "+ number + " and this is an EVEN Number");
            } else {
                System.out.println("The given number is "+ number + " and this is an ODD Number");
            }

            System.out.print("Do you want to Continue (y/n):");
            input = obj2.next().charAt(0);
            System.out.println("Exitting...");
        } while (input == 'y' || input == 'Y');
        //     System.out.println("Exitting...");
            // if(input=='y'|| input=='Y'){
            //     System.out.println("Enter a new number: ");
            // }else if(input=='n'|| input=='N'){
            //     System.out.println("Exitting...");

            // }else{
            //     System.out.println("invalid input...");
            
        obj2.close();

    }
}
