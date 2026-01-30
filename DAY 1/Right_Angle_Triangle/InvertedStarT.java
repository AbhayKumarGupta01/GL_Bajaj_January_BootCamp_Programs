//package DAY 1.Right_Angle_Triangle;

public class InvertedStarT {
    public static void main(String[]args){
        int i,j;
        int n=5;
        for(i=n; i!=0; i--){
            for(j=i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
