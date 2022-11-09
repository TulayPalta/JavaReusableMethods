package reusableMethods;

import java.util.Scanner;

public class Mat_IsFibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi yazınız lütfen");
        int n= scan.nextInt();
        System.out.println(isFibonacci(n));
    }

    public static boolean isFibonacci(int n) {
        if (n <= 0) {
            return false;
        }
        int num1 = 1;
        int num2 = 1;
        while (num2 < n) {
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
        return num2 == n;
    }
}
