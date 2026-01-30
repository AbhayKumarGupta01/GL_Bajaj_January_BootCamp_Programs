import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int flag = 1;
        if (n <= 1) {
            flag = 0;
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime number");
        }
        sc.close();
    }
}
