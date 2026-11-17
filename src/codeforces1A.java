import java.util.Scanner;

public class codeforces1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var len = sc.nextInt();
        var wid = sc.nextInt();
        var side = sc.nextInt();
        var numLen = (long) Math.ceil((double)len/side);
        var numWid = (long) Math.ceil((double)wid/side);
        System.out.println(numLen*numWid);

    }
}