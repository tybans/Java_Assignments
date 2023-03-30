import java.util.Scanner;

public class DistanceConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        
        do {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu - ");
            
            int menu = input.nextInt();
            
            switch(menu) {
                case 1:
                    System.out.print("\nPlease enter the CM value: ");
                    double cm = input.nextDouble();
                    double m = cm / 100;
                    System.out.printf("\n%.2f CM = %.2f M", cm, m);
                    break;
                case 2:
                    System.out.print("\nPlease enter the M value: ");
                    double m1 = input.nextDouble();
                    double km = m1 / 1000;
                    System.out.printf("\n%.2f M = %.2f KM", m1, km);
                    break;
                case 3:
                    System.out.print("\nPlease enter the KM value: ");
                    double km1 = input.nextDouble();
                    double m2 = km1 * 1000;
                    System.out.printf("\n%.2f KM = %.2f M", km1, m2);
                    break;
                case 4:
                    System.out.print("\nPlease enter the M value: ");
                    double m3 = input.nextDouble();
                    double cm1 = m3 * 100;
                    System.out.printf("\n%.2f M = %.2f CM", m3, cm1);
                    break;
                default:
                    System.out.println("\nInvalid option selected.");
                    break;
            }
            
            System.out.print("\nDo you want to Continue? (y/n): ");
            choice = input.next().charAt(0);
            System.out.println();
        } while(choice == 'y' || choice == 'Y');
        
        System.out.println("Program exited.");
        input.close();
    }

}
