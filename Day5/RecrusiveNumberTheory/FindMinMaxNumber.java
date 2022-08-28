package Day5.RecrusiveNumberTheory;

import java.util.Arrays;

public class FindMinMaxNumber {
    public static void main(String[] args) {
        int[] arr = { 5,7,4,-2, 1, 8 };
        System.out.println(findMinMax(arr));
    }

    public static String findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return "Min: " + min + " at index: " + minIndex + " Max: " + max + " at index: " + maxIndex;
    }
}
