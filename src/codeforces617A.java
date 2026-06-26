import java.util.Scanner;

public class codeforces617A {
    public static void main(String[] args) {
        int steps = 0;
        Scanner sc = new Scanner(System.in);
        int coord = sc.nextInt();
        while (coord >= 5){
            coord -= 5;
            steps ++;
        }
        if (coord > 0) {
            steps ++;
        }
        System.out.println(steps);
    }
}
