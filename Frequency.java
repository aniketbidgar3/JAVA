
import java.util.Scanner;

public class Frequency {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans = "";
        int upper = 0, lower = 0;
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == ',') {
                continue;
            }
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else {
                ans += ch;
            }

        }

        System.out.println("Uppercase Letters : " + upper);
        System.out.println("Lowercase Letters : " + lower);
        System.out.println("Other Letters : " + ans);

    }
}
