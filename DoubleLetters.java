
import java.util.Scanner;

public class DoubleLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sting : ");
        String s = in.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println("Count of Double Letter : " + count);

    }
}
