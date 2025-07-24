
import java.util.Scanner;

public class Array {

    static void array(Scanner in) {
        // Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        // int[] arr = {1,2,3,4,5,6};

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        array(in);

    }
}
