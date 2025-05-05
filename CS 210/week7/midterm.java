public class midterm {
    public static void main(String[] args) {
        // Primitive types
        // Boolean, Int, Byte, Short, long, Float, double, char

        // Reference or Class types
        // String, objects

        //Loops
        // For loop, while loop, do-while

        // Logic
        // If, if-else, if-else if-else, switch case,
        // break, continue
        int i = 10;
        switch (i) {
            case 1:
                System.out.println("correct");
                break;
            case 2:
                System.out.println("how");
                break;
            default:
                System.out.println("no");
                break;
        }

        //ternary operator
        int p = 2;
        int q = 1;
        int test = (q > p) ? 1 : 0;
        System.out.println(test);

        //arrays
        int[] loop= new int[5];
        System.out.println(loop);
        for (i = 0; i < loop.length; i++) {
            System.out.println(loop[i]);
        }

        
    }
}
