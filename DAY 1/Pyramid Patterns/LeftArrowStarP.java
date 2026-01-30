public class LeftArrowStarP {
    public static void main(String[] args) {
        int i, j;
        int n=5;
        for(i=0; i<n; i++){
            for(j=i; j<n; j++){
                System.out.print(" ");
            }
            for(j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
         for(i=1; i<n; i++){
            for(j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
