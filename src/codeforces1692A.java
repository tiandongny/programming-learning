/*
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class codeforces1692A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numTrials = sc.nextInt();
        for (int i=0; i<numTrials; i++){
            var distTumir = sc.nextInt();
            var distPersonOne = sc.nextInt();
            var distPersonTwo = sc.nextInt();
            var distPersonThree = sc.nextInt();
            List<Integer> positions = new ArrayList<>(List.of(distTumir, distPersonOne, distPersonTwo, distPersonThree));
            positions.sort(Collections.reverseOrder());
            int place = positions.indexOf(distTumir);
            System.out.println(place);
        }
    }
}
*/