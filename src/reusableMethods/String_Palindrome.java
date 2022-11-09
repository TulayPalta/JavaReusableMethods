package reusableMethods;

public class String_Palindrome {
    public static void main(String[] args) {
        String word="ada";
        System.out.println(isPalindrome1(word));
        System.out.println(isPalindrome2(word));
    }
    public static boolean isPalindrome1(String str) {
        if(str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str); }

    public static boolean isPalindrome2(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true; }
}
