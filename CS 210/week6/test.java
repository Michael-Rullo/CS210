public class test {
    // Recatangle
    // public static void main(String[] args) {
    //     int height = 5;
    //     int length = 5;
    //     for (int i = 0; i < height; i++) {
    //         for (int p = 0; p < length; p++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // Triangle
    public static void main(String[] args) {
        int length = 10;
        int gap = length - 1;
        String lineSpace;
        String lineStar;
        while(gap >= 0) {
            lineSpace = new String(new char[gap]).replace("\0", " ");
            lineStar = new String(new char[2 * (length - gap) - 1]).replace("\0", "*");
            gap -= 1;
            System.out.println(lineSpace + lineStar);
        }
    }

    // Hexagon
    // public static void main(String[] args) {
    //     int length = 10;
    //     int gap = length - 1;
    //     int count = 0;
    //     String lineSpace;
    //     String lineStar;
    //     while (gap >= 0) {
    //         lineSpace = new String(new char[gap]).replace("\0", " ");
    //         lineStar = new String(new char[length + count]).replace("\0", "*");
    //         count += 2;
    //         gap -= 1;
    //         System.out.println(lineSpace + lineStar);
    //     }
    //     gap = 1;
    //     count -= 4;
    //     while (gap < length) {
    //         lineSpace = new String(new char[gap]).replace("\0", " ");
    //         lineStar = new String(new char[length + count]).replace("\0", "*");
    //         count -= 2;
    //         gap += 1;
    //         System.out.println(lineSpace + lineStar);
    //     }
    // }

    // Octagon
    // public static void main(String[] args) {
    //     int length = 9;
    //     int gap = length - 1;
    //     int count = 0;
    //     int middleCount = 1;
    //     String lineSpace;
    //     String lineStar;
    //     while (gap >= 0) {
    //         lineSpace = new String(new char[gap]).replace("\0", " ");
    //         lineStar = new String(new char[length + count]).replace("\0", "*");
    //         count += 2;
    //         gap -= 1;
    //         System.out.println(lineSpace + lineStar);
    //     }
    //     count -= 2;
    //     while (middleCount < length){
    //         lineStar = new String(new char[length + count]).replace("\0", "*");
    //         middleCount += 1;
    //         System.out.println(lineStar);
    //     }
    //     gap = 1;
    //     count -= 2;
    //     while (gap < length) {
    //         lineSpace = new String(new char[gap]).replace("\0", " ");
    //         lineStar = new String(new char[length + count]).replace("\0", "*");
    //         count -= 2;
    //         gap += 1;
    //         System.out.println(lineSpace + lineStar);
    //     }
    // }

    // Pentagon
    // public static void main(String[] args) {
    //     int length = 9;
    //     int gap = length - 1;
    //     String lineSpace;
    //     String lineStar;
    //     while(gap >= 0) {
    //         lineSpace = new String(new char[gap]).replace("\0", " ");
    //         lineStar = new String(new char[2 * (length - gap) - 1]).replace("\0", "*");
    //         gap -= 1;
    //         System.out.println(lineSpace + lineStar);
    //     }
    //     for (int operand = length - 1; operand > 0; operand --) {
    //         lineStar = new String(new char[2 * length - 1]).replace("\0", "*");
    //         System.out.println(lineStar);
    //     }
    // }
}