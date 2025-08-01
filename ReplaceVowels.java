
import java.util.Scanner;

public class ReplaceVowels {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = in.nextLine();
        String ans = "";
        s = s.toLowerCase();
        String vowels = "aeiou";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (vowels.indexOf(ch) >= 0) {
                ans = ans + (char) (ch + 1);
            } else {
                ans = ans + ch;
            }
        }

        System.out.println("New String is : " + ans);

    }
}
