package reusableMethods;

public class Mat_IsTriangle {
    public static void main(String[] args) {
        int a=5;
        int b=1;
        int c=4;
        System.out.println(isTriangle(a,b,c));
    }


    public static boolean isTriangle(int a, int b, int c)
    {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
