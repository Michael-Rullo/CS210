import java.util.Scanner;

public class AverageOfInputs {
    public static void main(String[] args) {
        double sum, average;
        
        Scanner keystrokes = new Scanner(System.in);

        System.out.println("Enter 1st input below:");
        double num1 = keystrokes.nextDouble();
        System.out.println("Enter 2nd input below:");
        double num2 = keystrokes.nextDouble();
        System.out.println("Enter 3rd input below:");
        double num3 = keystrokes.nextDouble();
        keystrokes.close();
        sum = num1 + num2 + num3;
        average = sum/3;
        
        System.out.println("The average of the 3 numbers is: " + average);
    }
}