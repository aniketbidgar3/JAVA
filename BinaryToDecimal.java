
import java.util.*;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
        int bn = in.nextInt();
        int pow = 1;
        int dn = 0;
        while (bn != 0) {
            int digit = bn % 10;
            dn = dn + pow * digit;
            pow *= 2;
            bn /= 10;

        }
        
        System.out.println(dn);
    }
}
