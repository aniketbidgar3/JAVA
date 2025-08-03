
import java.util.*;

public class CountryAndCapital {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = in.nextInt();
        in.nextLine();
        String country[] = new String[n];
        String capital[] = new String[n];
        String vowels = "AEIOUaeiou";
        char ch;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Country : ");
            country[i] = in.nextLine();
            System.out.print("Enter Capital : ");
            capital[i] = in.nextLine();
        }

        System.out.println();
        System.out.println("Country and Their Capitals");

        for (int i = 0; i < n; i++) {
            ch = country[i].charAt(0);
            if (vowels.indexOf(ch) >= 0) {
                System.out.println(country[i] + " : " + capital[i]);

            }
        }

    }
}
