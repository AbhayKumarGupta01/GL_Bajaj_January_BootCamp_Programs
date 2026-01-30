//package DAY 1.Pyramid Patterns;

public class DiamondStarP {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n-1; i>=1; i--){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
