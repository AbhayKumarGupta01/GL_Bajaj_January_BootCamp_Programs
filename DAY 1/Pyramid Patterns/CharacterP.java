//package DAY 1.Pyramid Patterns;

public class CharacterP {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1; i<=n; i++){
            char c='A';
            for(j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(c);
                c++;
            }
            c-=2;
            for(j=1; j<i; j++){
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
    
}
