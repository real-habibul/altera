package Day3;

import java.util.ArrayList;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] array = {2, 5, 9 , 11};
        int target = 11;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        System.out.println(result);
    }
}
