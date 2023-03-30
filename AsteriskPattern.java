public class AsteriskPattern {
    
    public static void main(String[] args) {
        int n = 5; // number of rows in the pattern
        
        // printing upper half of the pattern
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // printing lower half of the pattern
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
