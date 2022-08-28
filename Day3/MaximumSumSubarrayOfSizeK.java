package Day3;

public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] array = {2,1,5,1,3,2};
        int k = 3;
        int result = 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            end = i;
            if (end - start + 1 == k) {
                if (sum > result) {
                    result = sum;
                }
                sum -= array[start];
                start++;
            }
        }
        System.out.println(result);
    }
}
