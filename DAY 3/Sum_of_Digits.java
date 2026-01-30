import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int digit = sc.nextInt();
        int sum = 0;
        while (digit != 0) {
            int rem = digit % 10;
            sum += rem;
            digit = digit / 10;
        }
        System.out.println("Sum of Digits is: " + sum);
        sc.close();
    }
}
