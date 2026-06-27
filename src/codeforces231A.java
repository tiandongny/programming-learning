import java.util.Scanner;

public class codeforces231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numProblems = sc.nextInt();
        int numSolutions = 0;
        for (int i=0; i<numProblems; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a==b || a==c) && a==1){
                numSolutions++;
            } else{
                if (b==c && b==1){
                    numSolutions++;
                }
            }
        }
        System.out.println(numSolutions);
    }
}
