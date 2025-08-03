
public class RandomPatterns {

    public static void main(String[] args) {
        int n = 5;
        char a;

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int count=1;
        // for (int i = 1; i < n+1 ; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" " + (count++) + " ");
        //     }
        //     System.out.println();
        // }

        // A  B  C  D  E 
        // F  G  H  I
        // J  K  L
        // M  N
        // O

        // a = 'A';
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" " + a++ + " ");
        //     }
        //     System.out.println();
        // }

        // A 
        // B  C
        // D  E  F
        // G  H  I  J
        // K  L  M  N  O

        // a = 'A';
        // for (int i = 0; i <n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" " + a++ + " ");
        //     }
        //     System.out.println();
        // }

        // A  B  C  D  E 
        // A  B  C  D
        // A  B  C
        // A  B
        // A
        
        // for (int i = n - 1; i >= 0; i--) {
        //  a = 'A';
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" " + a++ + " ");
        //     }
        //     System.out.println();
        // }





        // Difficult One But Not Impossible 

        // A  B  C  D  E 
        // B  C  D  E 
        // C  D  E 
        // D  E 
        // E

        a = 'A';
        for (int i = n - 1; i >= 0; i--) {
            char b = a++;
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + b++ + " ");
            }
            System.out.println();
        }

    }
}
