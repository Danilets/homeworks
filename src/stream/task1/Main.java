package stream.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] result = getFilteredArray(intArray);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getFilteredArray(int[] intArray) {
        int size = getSize(intArray);
        int[] arr = new int[size];
        int i = 0;

        for(int e:intArray) {
            if (e > 0 && e % 2 == 0) {
                arr[i] = e;
                i++;
            }
        }
        return arr;
    }

    private static int getSize(int[] intArray) {
        int k = 0;
        for(int e:intArray) {
            if (e > 0 && e % 2 == 0) k++;
        }
        return k;
    }
}