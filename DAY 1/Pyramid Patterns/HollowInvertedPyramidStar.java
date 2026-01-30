//package DAY 1.Pyramid Patterns;

public class HollowInvertedPyramidStar {
  public static void main(String[] args) {
    int i,j;
    int n=5;
    for(i=n; i>=1; i--){
        for(j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(j=1;j<=2*i-1; j++){
            if(j==1 || j==2*i-1 || i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
  }  
}
