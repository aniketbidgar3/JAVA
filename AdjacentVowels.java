
import java.util.Scanner;

public class AdjacentVowels {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch1, ch2;
        int count = 0;
        String vowels = "aeiouAEIOU";

        // My Logic
        // for(int i=0;i<s.length()-1;i++){
        //     ch=s.charAt(i);
        //     ch2=s.charAt(i+1);
        //     if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') && (ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U' )){
        //         System.out.println(""+ch+ch2);
        //         count++;
        //     }
        // }
        // Books Logic
        for (int i = 0; i < s.length() - 1; i++) {
            ch1 = s.charAt(i);
            ch2 = s.charAt(i + 1);
            if (vowels.indexOf(ch1) >= 0 && vowels.indexOf(ch2) >= 0) {
                System.out.print("" + ch1 + ch2 + " ");
                count++;
            }
        }
        System.out.println();

        System.out.println("No. of Pairs of Vowels : " + count);
    }
}
