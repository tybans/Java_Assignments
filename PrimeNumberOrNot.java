import java.util.Scanner;

public class PrimeNumberOrNot {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        
        boolean isPrime = true;
        
        // checking if the number is divisible by any number other than 1 and itself
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) {
            System.out.println("The given number " + num + " is a Prime number");
        } else {
            System.out.println("The given number " + num + " is NOT a Prime number");
        }
        sc.close();
    }

}
