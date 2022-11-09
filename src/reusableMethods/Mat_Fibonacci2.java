package reusableMethods;

public class Mat_Fibonacci2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int num=10;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i <=num; i++) {
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}
