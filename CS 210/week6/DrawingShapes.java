// imports
import java.util.Scanner;
import java.util.Set;

// class declaration
public class DrawingShapes{

    // instance variables
    private final static Scanner userInput = new Scanner(System.in);
    private static String shapeToDraw;
    private static int lengthOfObj;
    private static int heightOfObj;
    static Set<String> validShapes = Set.of("r", "t", "h", "o", "p");


    public static String setShape() {
        /*
         * @desc    gets string input for the shape to draw.
         *          shape is returned if found in the Set of validShapes
         *          else, program exits
         * @return  shapeToDraw (str)
         */
        System.out.println("Enter a shape: r t h o p");
        shapeToDraw = userInput.next();
        shapeToDraw = shapeToDraw.toLowerCase();
        if (!validShapes.contains(shapeToDraw)) {
            System.out.println("Invalid Shape!!");
            System.out.println("Goodbye");
            System.exit(0);
        }
        return shapeToDraw;
    }

    public static void setLength() {
        /*
         * @desc    gets int input for length of shape.
         *          length is saved if greater than 1, else program exits
         */
        System.out.println("Enter a length (greater than 1)");
        lengthOfObj = userInput.nextInt();
        if (!(lengthOfObj > 1)) {
            System.out.println("Length must be greater than 1");
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void setHeight() {
        /*
         * @desc    gets integer input for height of shape.
         *          height is saved if greater than 1, else program exits
         */
        System.out.println("Enter a height (greater than 1)");
        heightOfObj = userInput.nextInt();
        if (!(heightOfObj > 1)) {
            System.out.println("Height must be greater than 1");
            System.out.println("Goodbye");
            System.exit(0);
        }
    }

    public static void drawRectangle() {
        // Draws a rectangles based on user specified height and length
        // Since one printline corresponds to one unit of height for our shape, we must iterate height # of times with our exterior for loop
        // In the nested loop we must iterate length # of times to place the correct number of * characters on each printline
        System.out.println("Below is a " + lengthOfObj + " by " + heightOfObj + " rectangle of *");
        for (int i = 0; i < heightOfObj; i++) {
            for (int p = 0; p < lengthOfObj; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle() {
        /*
         * Draws a triangle based on user specified length
         * gap represents the number of empty spaces before our first * character on each printline, and is initialized to length - 1
         * on each printline the width of the triangle is n + 2 * characters greater than the previous, this is represented with count
         * As before, our exterior for loop must iterate length # of times for each unit of height (length in this case)
         * The first nested loop iterates gap # of times to create necessary spacing before the * characters
         * The second nested loop iterates count times and prints count + 1 * characters
         * the gap is decreased by one
         * the width (count) is increased by 2 for each new printline
         * the loop repeats
         */
        System.out.println("Below is a triangle with two side lengths of " + lengthOfObj + " *");
        int gap = lengthOfObj - 1;
        int count = 0;
        for (int i = 0; i < lengthOfObj; i++) {
            for (int p = 0; p < gap; p++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= count; c += 1) {
                System.out.print("*");
            }
            count += 2;
            gap -= 1;
            System.out.println();
        }
    }

    public static void drawHexagon() {
        /*
         * gap is init to length - 1, represnting the empty spaces on each line before the first * character
         * count represents the variation in the horizontal width of the shape
         * flipper is used to tell the program when it is building the upper half vs lower half of the shape, since the gap and count vary inversely and differ in each half
         * the exterior loop iterates 2 * length - 1 # of times, which is the height of the hexagon, the -1 ensures that each half is equal and that an exact mid point exists
         * the first nested for loop iterates gap # of times to places empty spaces before the first * character
         * the second nested for loop iterates count # of times and represents the increasing or decreasing of the width of the shape compared to the previous printline
         * the third nested for loop iterates length # of times since essentially there is a rectangle between two triangles in a hexagon
         * once the top half is completed flipper changes and count starts decreasing instead of increasing, and gap starts increasing instead of decreasing
         * the loop repeats until both halves are printed
         */
        System.out.println("Below is a hexagon with side lengths of " + lengthOfObj + " *");
        int gap = lengthOfObj - 1;
        int count = 0;
        int flipper = 0;
        for (int i = 0; i < 2 * lengthOfObj - 1; i++) {
            for (int p = 0; p < gap; p++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= count; c += 1) {
                System.out.print("*");
            }
            for (int q = 0; q < lengthOfObj - 1; q++) {
                    System.out.print("*");
            }
            if (flipper == 0) {
                count += 2;
                gap -= 1;
            } else {
                count -= 2;
                gap += 1;
            }
            if (gap == 0) {
                flipper = 1;
            }
            System.out.println();
        }
    }

    public static void drawOctagon() {
        /*
         * gap is init to length - 1, represnting the empty spaces on each line before the first * character
         * count represents the variation in the horizontal width of the shape
         * flipper is used to tell the program when it is building the upper half vs lower half of the shape, since the gap and count vary inversely and differ in each half
         * the exterior loop iterates 2 * length - 1 # of times, which is the height of the octagon (without the rectangular mid section), the -1 ensures that each half is equal and that an exact mid point exists
         * the first nested for loop iterates gap # of times to places empty spaces before the first * character
         * the second nested for loop iterates count # of times and represents the increasing or decreasing of the width of the shape compared to the previous printline
         * the third nested for loop iterates length # of times since essentially there is a rectangle between two triangles in a hexagon
         * once the top half is completed flipper changes and count starts decreasing instead of increasing, and gap starts increasing instead of decreasing
         * when flipper changes, gap = 0 and we are at the midpoint of our shape, here, since an octagon is a hexagon with a rectangle in between the top and bottom halves, we can just use our rectangle code
         * the loop repeats until both halves and the middle rectangle are printed
         */
        System.out.println("Below is a octagon with side lengths of " + lengthOfObj + " *");
        int gap = lengthOfObj - 1;
        int count = 0;
        int flipper = 0;
        for (int i = 0; i < 2 * lengthOfObj - 1; i++) {
            for (int p = 0; p < gap; p++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= count; c += 1) {
                System.out.print("*");
            }
            for (int q = 0; q < lengthOfObj - 1; q++) {
                    System.out.print("*");
            }
            System.out.println();
            if (flipper == 0) {
                count += 2;
                gap -= 1;
            } else {
                count -= 2;
                gap += 1;
            }
            if (gap == 0) {
                flipper = 1;
                for (int r = 0; r <= (lengthOfObj - 2); r ++) {
                    for (int f = 0; f < (lengthOfObj + (2 * (lengthOfObj - 1))); f ++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void drawPentagon() {
        /*
         * gap is init to length - 1, represnting the empty spaces on each line before the first * character
         * count represents the variation in the horizontal width of the shape
         * the first exterior for loop iterates length # of times, in this for loop we are essentially drawing a triangle, which will sit on top of a ractangle to create a pentagon
         * the second exterior for loop iterates length # of times for height, and 2 * length - 1 # of times for a width of the rectangular base on the pentagon
         */
        System.out.println("Below is a pentagon with 4 side lengths of " + lengthOfObj + " *");
        int gap = lengthOfObj - 1;
        int count = 0;
        for (int i = 0; i < lengthOfObj; i++) {
            for (int p = 0; p < gap; p++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= count; c += 1) {
                System.out.print("*");
            }
            count += 2;
            gap -= 1;
            System.out.println();
        }
        for (int i = 0; i < lengthOfObj - 1; i++) {
            for (int p = 0; p < 2 * lengthOfObj - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        /*
         * the shape to draw is returned if valid and ran through a switch case operator since some shapes require height and length or juts length
         */
        String shapetoDraw = setShape();
        switch (shapetoDraw) {
            case "r":
                setLength();
                setHeight();
                drawRectangle();
                break;
            case "t":
                setLength();
                drawTriangle();
                break;
            case "h":
                setLength();
                drawHexagon();
                break;
            case "o":
                setLength();
                drawOctagon();
                break;
            case "p":
                setLength();
                drawPentagon();
                break;
        }
    }
}