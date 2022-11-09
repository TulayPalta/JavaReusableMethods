package reusableMethods;

public class Mat_Palindrom {
    public static void main(String[] args) {
        int num=22122;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        // Finding the reverse of the number
        int reverseNum = 0;
        int n = num;
        while (n != 0) {
            reverseNum = (reverseNum * 10) + (n % 10);
            n /= 10;
        }
        if (reverseNum == num)   {  // Checking if the number and its  // reverse is equal
            return true;
        } else
            return false;
    }
}
