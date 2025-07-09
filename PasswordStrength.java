import java.util.Scanner;

class PasswordStrength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                digit++;
            else
                special++;
        }

        boolean isStrong = password.length() >= 12 &&
                upper >= 4 &&
                lower >= 4 &&
                digit >= 2 &&
                special >= 2;

        if (isStrong)
            System.out.println("The password is STRONG.");
        else
            System.out.println("The password is WEAK.");

        // Necessary to Ignore Warning in Java
        sc.close();
    }
}
