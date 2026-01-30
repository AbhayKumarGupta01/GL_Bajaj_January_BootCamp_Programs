import java.util.Scanner;

public class No_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit = sc.nextInt();
        int result = digit_Count(digit);
        System.out.println("No of Digits in the Input number " + digit + " is: " + result);
        sc.close();
    }

    public static int digit_Count(int digit) {
        int count = 0;
        if (digit == 0) {
            return 1;
        }
        while (digit != 0) {
            digit = digit / 10;
            count++;
        }
        return count;
    }
}
