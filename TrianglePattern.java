public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 3;

        // Print the upper triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower triangle pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


