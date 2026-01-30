import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int digit = 0;
        int result = 0;
        int temp = n;
        int temp2 = n;
        while (temp != 0) {
            digit++;
            temp = temp / 10;
        }
        while (temp2 != 0) {
            int rem = temp2 % 10;
            result += Math.pow(rem, digit);
            temp2 = temp2 / 10;
        }
        if (result == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
