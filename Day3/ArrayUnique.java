package Day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] arrayA = {3, 8};
        int[] arrayB = {2, 8};

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arrayA.length; i++) {
            set.add(arrayA[i]);
        }
        for (int i = 0; i < arrayB.length; i++) {
            if (set.contains(arrayB[i])) {
                set.remove(arrayB[i]);
            }
        }
        System.out.println(set);
    }
}
