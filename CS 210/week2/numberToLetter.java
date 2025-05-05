import java.util.Scanner;

public class numberToLetter {
    public static char gradeConversion(int numberGrade){
        if (numberGrade >= 90) {
            return 'A';
        }
        else if (numberGrade >= 80) {
            return 'B';
        }
        else if (numberGrade >= 70) {
            return 'C';
        }
        else if (numberGrade >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner keystrokes = new Scanner(System.in);
        System.out.println("Please enter an integer number grade below");
        int numberGrade = keystrokes.nextInt();
        keystrokes.close();
        char letterGrade = gradeConversion(numberGrade);
        System.out.println("Your letter grade conversion is: " + letterGrade);
    }
}
