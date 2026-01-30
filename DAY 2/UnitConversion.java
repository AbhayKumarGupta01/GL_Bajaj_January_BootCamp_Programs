import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter 1. For Kg to gm \n Enter 2. For gm to kg \n Enter 3. For cm to mtr. \n Enter 4. For mtr. to cm.");
        int Unit = sc.nextInt();
        float amount = sc.nextFloat();
        float result;
        switch(Unit){
            case 1:
                result = amount * 1000;
                System.out.println(amount + "In Kg is equal to" + result + "grams.");
                break;
            case 2:
                result = amount * 0.001f;
                System.out.println(amount + "In grams is equal to" + result + "Kg.");
                break;
            case 3:
                result = amount * 0.01f;
                System.out.println(amount + "In cm is equal to" + result + "mtr.");
                break;  
            case 4:
                result = amount * 100;
                System.out.println(amount + "In mtr is equal to" + result + "cm.");
                break;      
        }
        sc.close();
    }
}
