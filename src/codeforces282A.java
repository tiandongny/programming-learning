import java.util.Scanner;

public class codeforces282A {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        int numOperations = sc.nextInt();
        for (int i = 0; i < numOperations; i++){
            String operation = sc.next();
            if (operation.contains("++")){
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
