public class FindTheSums {

    public static String arrayToString(int[][] array) {
        String stringArray = new String();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= array.length -1 && j < array[i].length -1) {
                    stringArray += array[i][j] + " ";
                } else if (i < array.length -1 && j == array[i].length -1) {
                    stringArray += array[i][j] + "\n";
                } else if (i == array.length -1 && j == array[i].length -1) {
                    stringArray += array[i][j];
                    break;
                }
            }
        }
        return stringArray;
    }

    public static int[][] horizontalSums(int[][] array, int sumToFind) {
        int[][] returnArray = new int[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            int ptr = 0;
            while (ptr < array[i].length) {
                int sum = 0;
                int n = ptr;
    
                while (n < array[i].length) {
                    sum += array[i][n];
    
                    if (sum == sumToFind) {
                        for (int j = ptr; j <= n; j++) {
                            returnArray[i][j] = array[i][j];
                        }
                        break;
                    } else if (sum > sumToFind) {
                        break;
                    }
    
                    n++;
                }
    
                ptr++;
            }
        }
    
        return returnArray;
    }
    
    public static int[][] verticalSums(int[][] array, int sumToFind) {
        int[][] returnArray = new int[array.length][array[0].length];

        for (int i = 0; i < array[0].length; i++) {
            int ptr = 0;
            while (ptr < array.length) {
                int sum = 0;
                int m = ptr;
    
                while (m < array.length) {
                    sum += array[m][i];
    
                    if (sum == sumToFind) {
                        for (int j = ptr; j <= m; j++) {
                            returnArray[j][i] = array[j][i];
                        }
                        break;
                    } else if (sum > sumToFind) {
                        break;
                    }
    
                    m++;
                }
    
                ptr++;
            }
        }
    
        return returnArray;
    }
}