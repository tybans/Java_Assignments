import java.util.Scanner;

public class SmallestLargestAverage{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, smallest, largest;
        float average;
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        num3 = input.nextInt();
        
        smallest = num1;
        if(num2 < smallest) {
            smallest = num2;
        }
        if(num3 < smallest) {
            smallest = num3;
        }
        System.out.println("The Smallest Number: " + smallest);
        
        largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }
        System.out.println("The Largest Number: " + largest);
        
        average = (float)(num1 + num2 + num3) / 3;
        System.out.println("Average of all three numbers: " + average);
        
        input.close();
    }

}
