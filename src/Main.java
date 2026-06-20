import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Homework
        System.out.print("Enter number of homework scores: ");
        int h = sc.nextInt();

        double hwSum = 0;

        for (int i = 0; i < h; i++) {
            System.out.print("Enter homework score " + (i + 1) + ": ");
            double hwScore = sc.nextDouble();
            hwSum += hwScore;
        }

        double D = Math.round((hwSum / h)*100.0)/100.0;


        // Tests
        System.out.print("Enter number of test scores: ");
        int N = sc.nextInt();

        double testSum = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            double testScore = sc.nextDouble();
            testSum += testScore;
        }

        double testAvg = Math.round((testSum / N)*100.0)/100.0;

        // Output
        System.out.println("Homework average: " + D);
        System.out.println("Test average: " + testAvg);

        //Weight

        System.out.print("Homework weight decimal: ");
        double H = sc.nextDouble();
        System.out.print("Test weight decimal: ");
        double T = sc.nextDouble();
        var finalGrade = (D * H) + (testAvg * T);
        var roundedFinalGrade = Math.round(finalGrade*100.0)/100.0;
        String letterGrade;

        if (roundedFinalGrade >= 97) {
            letterGrade = "A+";
        } else if (roundedFinalGrade >= 93) {
            letterGrade = "A";
        } else if (roundedFinalGrade >= 90) {
            letterGrade = "A-";
        } else if (roundedFinalGrade >= 87) {
            letterGrade = "B+";
        } else if (roundedFinalGrade >= 83) {
            letterGrade = "B";
        } else if (roundedFinalGrade >= 80) {
            letterGrade = "B-";
        } else if (roundedFinalGrade >= 77) {
            letterGrade = "C+";
        } else if (roundedFinalGrade >= 73) {
            letterGrade = "C";
        } else if (roundedFinalGrade >= 70) {
            letterGrade = "C-";
        } else if (roundedFinalGrade >= 67) {
            letterGrade = "D+";
        } else if (roundedFinalGrade >= 65) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        String pass;
        if (letterGrade.equals("F")) {
            pass = "failing.";
        }
        else {
            pass = "passing.";
        }
        System.out.print("Final grade: " + roundedFinalGrade + "(" + letterGrade +"). \nYou are " + pass);

        sc.close();
    }
}