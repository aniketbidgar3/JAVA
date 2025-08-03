
import java.util.Scanner;

public class BeginC_EndV {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = in.nextInt();
        in.nextLine();
        int s, e;
        String vowels = "AEIOUaeiou";
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            arr[i] = in.nextLine();
        }

        System.out.println();
        System.out.println("Cities Are");
        System.out.println();
        for (int i = 0; i < n; i++) {
            s = arr[i].charAt(0);
            e = arr[i].charAt(arr[i].length() - 1);
            if (vowels.indexOf(s) == -1 && vowels.indexOf(e) >= 0) {
                System.out.println(arr[i]);
            }
        }

    }
}
