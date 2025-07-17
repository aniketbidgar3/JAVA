
import java.util.*;

class PotentialEncryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter String : ");

        String str = in.nextLine().toUpperCase();
        String[] words = str.split(" ");

        // list to hold word + potential
        int n = words.length;
        int[] potentials = new int[n];

        // calculate potentials
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (char ch : words[i].toCharArray()) {
                sum += ch - 'A' + 1;
            }
            potentials[i] = sum;
        }

        // sort words and potentials together
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (potentials[i] > potentials[j]) {
                    // swap potentials
                    int temp = potentials[i];
                    potentials[i] = potentials[j];
                    potentials[j] = temp;

                    // swap words
                    String tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                }
            }
        }

        // output
        System.out.print("\nSorted Version : ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
