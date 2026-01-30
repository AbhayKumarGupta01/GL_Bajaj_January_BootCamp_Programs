//package DAY 2;
import java.util.Scanner;
public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Input: ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Input number is zero");
        }
        else if(n>=1){
            System.out.println("Input number is positive");
        }
        else{
            System.out.println("Input Number is Negative");
        }
        sc.close();
    }
    
}
