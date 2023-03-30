import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int numA = obj1.nextInt();
        System.out.print("Enter the Second number: ");
        int numB = obj1.nextInt();
        int swap = numA;
        numA = numB;
        numB = swap;
        System.out.println("numA = "+ numA);
        System.out.println("numB = "+ numB);
        
        obj1.close();
    }
    
}