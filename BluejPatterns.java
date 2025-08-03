
public class BluejPatterns {

    public static void main(String args[]) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter : ");
        // String s = in.nextLine();
        String s = "BLUEJ";
        int n = s.length();

        // B 
        // L  L 
        // U  U  U 
        // E  E  E  E 
        // J  J  J  J  J 
        
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print(" " + s.charAt(i) + " ");
        //     }
        //     System.out.println();
        // }

        // J  J  J  J  J
        // E  E  E  E
        // U  U  U
        // L  L
        // B

        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print(" " + s.charAt(i) + " ");
        //     }
        //     System.out.println();
        // }

        // B  L  U  E  J
        // B  L  U  E
        // B  L  U
        // B  L
        // B

        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print(" " + s.charAt(j) + " ");
        //     }
        //     System.out.println();
        // }

        // J 
        // E  E
        // U  U  U
        // L  L  L  L
        // B  B  B  B  B

        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print(" " + s.charAt(i) + " ");
        //     }
        //     System.out.println();
        // }

        // B  L  U  E  J 
        // L  U  E  J
        // U  E  J
        // E  J
        // J

        for (int i = 0; i < n; i++) {
            for (int j = 0 + i; j < n; j++) {
                System.out.print(" " + s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
