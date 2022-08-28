package Day3;

import java.util.HashSet;
import java.util.Set;

public class ArrayMerge {
    public static void main(String[] args) {
        String[] arrayA = {"kazuya", "jin", "lee"};
        String[] arrayB = {"kazuya", "feng"};

        Set<String> set = new HashSet<String>();

        for (String s : arrayA) {
            set.add(s);
        }

        for (String s : arrayB) {
            set.add(s);
        }

        System.out.println(set);
    }
}
