package week5;

// proudly made by
// Michael Rullo on 2/18/2025
// with the purpose of
// using loops, arrays and string formatting to calculate the output of 20 * sin(x) for an array of x values indicated by the user

import java.util.Scanner;

public class StarGraph {

    int permutationValue;
    double minimumValue;
    double stepValue;
    Scanner keyboard = new Scanner(System.in);

    public int getPermutationValue() {

        System.out.println("Please enter the number of x values to process: ");
        permutationValue = keyboard.nextInt();

        if (permutationValue < 1) {
            System.out.println("The number of x values must be an integer greater than 0.");
            System.out.println("Exiting program.");
            System.exit(0);
        }

        return 0;
    }

    public double getMinValue() {

        System.out.println("Please enter a minimum value for x: ");
        minimumValue = keyboard.nextDouble();

        return 0;
    }

    public double getStepValue() {

        System.out.println("Please enter the amount to increment x: ");
        stepValue = keyboard.nextDouble();

        if (stepValue <= 0) {
            System.out.println("The incrementation value of x must be a double greater than 0.");
            System.out.println("Exiting program.");
            System.exit(0);
        }


        return 0;
    }

    public double[] calculateXValues(double[] xArray) {
        xArray[0] = minimumValue;
        for (int i = 1; i < permutationValue; i++) {
            xArray[i] = xArray[i - 1] + stepValue;
        }
        return xArray;
    }

    public double[] calculateYValues(double[] xArray, double[] yArray) {
        for (int i = 0; i < permutationValue; i++) {
            yArray[i] = Math.abs(20.0 * (Math.sin(xArray[i])));
        }
        return yArray;
    }

    public void printResults(double[] xArray, double[]yArray) {
        System.out.println();
        System.out.println("Values");
        for (int i = 0; i < permutationValue; i++) {
            System.out.printf("x: %.3f", xArray[i]);
            System.out.printf(" y: %.3f\n", yArray[i]);
        }
    }
    public void main(String[] args) {
        
        getPermutationValue();
        getMinValue();
        getStepValue();
        
        double[] xArray = new double[permutationValue];
        double[] yArray = new double[permutationValue];

        xArray = calculateXValues(xArray);
        yArray = calculateYValues(xArray, yArray);

        printResults(xArray, yArray);
    }
}