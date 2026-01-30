public class HalfDiamondCharacterP {
  public static void main(String[] args) {
    int i, j;
    int n = 6;

    for (i = 0; i < n; i++) {
        char c = 'A';

        // left part
        for (j = 0; j < n - i; j++) {
            System.out.print(c);
            c++;
        }

        // middle spaces
        if (i > 0) {
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
        }

        // ✅ correct reset
        if (i > 0) {
            c -= 2;
        } else {
            c--;
        }

        // right part
        for (j = 0; j < n - i - 1; j++) {
            System.out.print(c);
            c--;
        }

        System.out.println();
    }
  }
}
