import java.util.Scanner;

public class Power_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int result = power_of_two(n);
        System.out.println("Two to the power " + n + " is: " + result);
        sc.close();
    }

    public static int power_of_two(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * power_of_two(n - 1);
        }
    }

}
