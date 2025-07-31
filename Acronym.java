
import java.util.Scanner;

public class Acronym {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sting : ");
        String s = in.nextLine();
        s = s.toUpperCase();
        String ans = "";
        ans = s.charAt(0) + ".";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans = ans + s.charAt(i + 1) + ".";
            }
        }

        System.out.println("Acronym is : " + ans);
    }
}
