import java.util.Scanner;

public class codeforces467a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRooms = sc.nextInt();
        int numRoomsAvailable = 0;
        for (int i = 0; i < numRooms; i++){
            int numStudents =  sc.nextInt();
            int maxStudents = sc.nextInt();
            if (maxStudents - numStudents < 2){
            } else {
                numRoomsAvailable++;
            }
        }
        System.out.println(numRoomsAvailable);
    }
}
