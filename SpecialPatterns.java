
public class SpecialPatterns {

    public static void main(String args[]) {
        int n = 5;
        char a;
        for (int i = n - 1; i >= 0; i--) {
            a = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + a++ + " ");
            }
            a = 'A';
            for (int j = i + 1; j < n; j++) {
                System.out.print(" " + a++ + " ");
            }
            System.out.println();
        }
    }
}
