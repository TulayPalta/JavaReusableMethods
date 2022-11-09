package reusableMethods;

public class Mat_PrimeNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(checkPrime(n));
    }
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; }
}
