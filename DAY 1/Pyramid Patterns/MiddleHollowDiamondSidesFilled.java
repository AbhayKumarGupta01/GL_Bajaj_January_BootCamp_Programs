public class MiddleHollowDiamondSidesFilled {
    public static void main(String[] args) {
        int n = 5;

        // upper half
        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            // left stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
