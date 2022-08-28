package Day5.TaskTimeComplexity;

public class BilanganPrima {

    public static void main(String[] args) {
        System.out.println(isPrime( 1000000007));
        System.out.println(isPrime( 13));
        System.out.println(isPrime( 17));
        System.out.println(isPrime( 20));
        System.out.println(isPrime( 35));
    }

    public static boolean isPrime(Integer n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }
}
