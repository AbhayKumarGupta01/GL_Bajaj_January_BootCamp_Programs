//package DAY 2;
import java.util.Scanner;
public class LargestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a , b, c: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int result = (a>b)?a:(b>c)?b:c; 
    System.out.println(result);
    sc.close();
  }  
}
