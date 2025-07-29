
import java.util.Scanner;

public class AscendingDescending {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter Size : ");
        n = in.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < mid - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = mid; i < n; i++) {
            for (int j = mid; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
