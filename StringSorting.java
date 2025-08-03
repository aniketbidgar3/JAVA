
import java.util.Scanner;

public class StringSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size     : ");
        int n = in.nextInt();
        in.nextLine();
        String arr[] = new String[n];
        String temp;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            arr[i] = in.nextLine();
        }

        System.out.print("UnSorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Sorted Array   : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

// a.compareTo(b)
// -1 = if a<b
// 1 = if  b>a
