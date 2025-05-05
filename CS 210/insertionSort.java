public class insertionSort {

    public static void main(String[] args) {
        
        int[] array = new int[10];
        int n = array.length - 1;
        int temp;

        for (int i = 0; i <= n; i++) {
            temp = array[i];

            for (int k = i - 1; k >= 0; k--) {
                if (array[i] > array[k]) {
                    
                    array[k + 1] = temp;
                }
            }
        }
    }
}