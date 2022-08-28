package Day3;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String angka = "76523752";
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < angka.length(); i++) {
            int count = 0;
            for (int j = 0; j < angka.length(); j++) {
                if (angka.charAt(i) == angka.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result.add(angka.charAt(i) - '0');
            }
        }
        System.out.println(result);
    }
}
