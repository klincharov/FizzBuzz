public class buzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5)==0 && (i % 7)==0) {
                System.out.print("FIZZBUZZ");
            }
            else if (i % 5 == 0) System.out.print("FIZZ");
            else if (i % 7 == 0) System.out.print("BUZZ");
            else System.out.print(i);
            System.out.print(" ");
        }

    }
}
