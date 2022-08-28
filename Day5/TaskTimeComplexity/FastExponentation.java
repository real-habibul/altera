package Day5.TaskTimeComplexity;

public class FastExponentation {


    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent % 2 == 0) {
            return pow(base, exponent / 2) * pow(base, exponent / 2);
        } else {
            return base * pow(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(pow(5,3));
        System.out.println(pow(10,2));
        System.out.println(pow(2,5));
        System.out.println(pow(7,3));
    }
}
