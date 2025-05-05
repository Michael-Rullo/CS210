package week10;
public class selectionSort {

    public static void main(String[] args) {
        
        int[] array = new int[10];
        int min = 100000000;
        int temp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            
        }
    }
}