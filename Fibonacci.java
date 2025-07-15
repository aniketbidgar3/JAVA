
import java.util.Scanner;

class Fibonacci {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int n = in.nextInt();
        int prev = 0;
        int curr = 1;
        System.out.print(prev + " ");
        System.out.print(curr + " ");
        for (int i = 2; i < n; i++) {
            int next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }

    }
}
