
import java.util.*;

public class PrintPalindromeOnly {

    static void palindrome(String s) {
        int n = s.length();
        String rev = "";
        char ch;
        for (int i = n - 1; i >= 0; i--) {
            ch = s.charAt(i);
            rev = rev + ch;
        }
        if (s.equals(rev)) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = in.nextInt();
        in.nextLine();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            arr[i] = in.nextLine();
        }

        System.out.println();
        System.out.println("Palindromes");
        for (int i = 0; i < n; i++) {
            palindrome(arr[i]);
        }

    }
}
