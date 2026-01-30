//package DAY 1.Special Pattern;

public class NumberPattern18 {
    //CHATGPT CODE
  public static void main(String[] args) {
    int i,j;
    int n=5;
    int size = 2*n-1;
    for(i=0; i<size; i++){
        for(j=0; j<size; j++){
            int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = top;
                if (left < min) min = left;
                if (right < min) min = right;
                if (bottom < min) min = bottom;

                System.out.print((n - min) + " ");
            }
             System.out.println();
        }
    }
  }  

