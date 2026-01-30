import java.util.Scanner;

public class Prime_Number_from_1toN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("No prime numbers");
        } else {
            System.out.println("Prime numbers from 1 to " + n + ":");

            for (int num = 2; num <= n; num++) {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }

        sc.close();
    }
}
