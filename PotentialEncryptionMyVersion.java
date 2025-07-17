
import java.util.Scanner;
// THE SKY IS THE LIMIT
// 33 55 28 33 63
// IS THE THE SKY LIMIT

class PotentialEncryptionMyVersion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] index = new int[20];
        int[] Potential = new int[20];
        System.out.print("\nEnter String : ");
        String str = in.nextLine();
        int sum = 0;
        int i, j = 0;

        index[j] = -1;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                Potential[j] = sum;
                j++;
                index[j] = i;
                sum = 0;
            } else {
                sum += str.charAt(i) - 64;
            }
        }
        Potential[j] = sum;
        j++;
        index[j] = i;

        i = 0;
        while (i < j) {
            System.out.print(index[i] + " ");
            System.out.println(Potential[i]);
            i++;
        }

    }
}
