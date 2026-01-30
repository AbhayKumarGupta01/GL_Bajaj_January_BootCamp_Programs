import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int fact = 1;
        int temp = n;
        if (n == 0 || n == 1) {
            System.out.println("Factorial of " + n + " is: 1");
        } else {
            while (n > 1) {
                fact = fact * n;
                n--;
            }
            System.out.println("Factorial of " + temp + " is: " + fact);
        }
        sc.close();
    }

}
