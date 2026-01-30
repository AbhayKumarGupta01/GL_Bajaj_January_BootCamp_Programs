import java.util.Scanner;
public class String_Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String temp = str;
        String revString = Reverse_of_String(str);
        if(temp.equals(revString)){
            System.out.println("String is Palindrome");
        }
        else{System.out.println("String is not Palindrome");}
        sc.close();
    }

    public static String Reverse_of_String(String str) {
        if (str.length() == 0) {
            return str;
        }
        return Reverse_of_String(str.substring(1)) + str.charAt(0);
    }
}
