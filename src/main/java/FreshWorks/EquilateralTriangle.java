package FreshWorks;

public class EquilateralTriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        for (int i = 0; i <rows; i++) {
            // Print spaces for each row
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
                System.out.print(" ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
