
import java.util.Scanner;

public class Functions {

    public void prime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter NUmber : ");
        int n = in.nextInt();
        int flag = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("The Number is Prime");
        } else {
            System.out.println("The Number is Not Prime");

        }
    }

    public void fibonacci() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter NUmber : ");
        int n = in.nextInt();
        int p = 0;
        int c = 1;
        System.out.print(p + " " + c + " ");
        for (int i = 2; i <= n; i++) {
            int next = p + c;
            System.out.print(next + " ");
            p = c;
            c = next;

        }

    }

}
