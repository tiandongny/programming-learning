import java.util.Scanner;

public class codeforces411a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        if (pass.length() >= 5) {
            for (int i = 0; i < pass.length(); i++) {
                char c = pass.charAt(i);

                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                }
                if (Character.isLowerCase(c)) {
                    hasLower = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasUpper && hasLower && hasDigit) {
                System.out.println("Correct");
            } else {
                System.out.println("Too weak");
            }
        } else {
            System.out.println("Too weak");
        }
    }
}