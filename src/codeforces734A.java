/*
import java.util.Scanner;

public class codeforces734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGames = sc.nextInt();
        String score = sc.next();
        int countAnton = 0;
        int countDanik = 0;
        for (int i = 0; i < score.length(); i++){
            char winner = score.charAt(i);
            if (winner == 'A'){
                countAnton++;
            } else {
                countDanik++;
            }
        }
        if (countAnton > countDanik){
            System.out.println("Anton");
        } else if (countDanik > countAnton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
*/