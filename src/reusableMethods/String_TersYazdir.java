package reusableMethods;

public class String_TersYazdir {
    public static void main(String[] args) {

        String str = "Team 10 Geliyor";
        //1.	Yol :  Reverse String – For Loop
        System.out.println("1. yol : " + reverseString(str));

        //2. Yol :StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("2. yol : " + reversed);
        int num1=0;
        Integer num=0;
    }

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}