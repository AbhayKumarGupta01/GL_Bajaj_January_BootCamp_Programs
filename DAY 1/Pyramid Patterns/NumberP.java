//package DAY 1.Pyramid Patterns;

public class NumberP {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1; i<=n; i++){
            //int k=1;
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(j);
                //k++;
            }
            for(j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
