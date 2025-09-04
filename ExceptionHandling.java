
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter Age : ");
            int age = in.nextInt();
            System.out.println(age);

        } catch (Exception e) {
            System.out.println("Cant Divide by Zero");
        }
    }
}

// import java.util.Scanner;
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         try {
//             int arr[] = {2, 3, 4};
//             System.out.println(arr[8]);
//         } catch (Exception e) {
//             System.out.println("Something Went Wrong");
//         }
//     }
// }
