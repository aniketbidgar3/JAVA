
import java.util.Scanner;

class ConsecutiveAndDouble {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toUpperCase();
        sc.close();
        int consecutive = 0, doubleSeq = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i + 1);

            if (next == current + 1) {
                consecutive++;
            }

            if (current == next) {
                doubleSeq++;
            }
        }

        System.out.println("Number of consecutive letter pairs = " + consecutive);
        System.out.println("Number of double letter sequence = " + doubleSeq);

        // Necessary to Ignore Warning in Java
        sc.close();
    }
}
