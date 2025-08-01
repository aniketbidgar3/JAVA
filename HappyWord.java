
import java.util.Scanner;

public class HappyWord {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = in.nextLine();
        s = s.toUpperCase();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            ans += (ch - 'A' + 1);
        }

        while (ans.length() != 1) {

            int n = 0, a;
            for (int i = 0; i < ans.length(); i++) {
                a = (int) (ans.charAt(i) - '0');
                n += (a * a);

            }
            ans = "" + n;
        }

        if (ans.equals("1")) {
            System.out.println("Happy Word");
        } else {
            System.out.println("Sad Word");
        }

    }
}
