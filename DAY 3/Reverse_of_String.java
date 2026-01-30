import java.util.Scanner;

public class Reverse_of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String revString = reverse_of_String(str);
        System.out.println("Reversed String is: " + revString);
        sc.close();
    }

    public static String reverse_of_String(String str) {
        if (str.length() == 0) {
            return str;
        }
        return reverse_of_String(str.substring(1)) + str.charAt(0);
    }
}
