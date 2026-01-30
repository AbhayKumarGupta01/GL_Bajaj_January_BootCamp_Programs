import java.util.Scanner;
public class Check_UC_LC_SC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("LowerCase");
        }
        else if(c >= 'A' && c <= 'Z'){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Special Character");
        }
        sc.close();        
    }
    
}
