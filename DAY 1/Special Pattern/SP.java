class SP {
    public static void main(String[] args) {
//CHATGPT CODE
        int N = 3;

        for (int block = 0; block < N; block++) {          // how many times
            for (int i = 1; i <= N; i++) {                 // rows
                for (int space = 0; space < block; space++) {
                    System.out.print("  ");                // shift right
                }
                for (int star = 1; star <= i; star++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
