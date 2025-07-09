import java.util.*;
public class TryCatch {

    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n/m);
            
        } catch (Exception exception) {
            System.out.println("You can't divide by zero");
        }

        
    }

}
