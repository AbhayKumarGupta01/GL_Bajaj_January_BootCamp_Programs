import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();
        int fib = 0;
        int initial = 0;
        int prev = 1;
        System.out.println("Fibonacci Series is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(initial + " ");
            fib = initial + prev;
            initial = prev;
            prev = fib;
            // System.out.print(fib);
        }
        sc.close();
    }

}
