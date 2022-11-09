package reusableMethods;

import java.util.Scanner;

public class Mat_KatBulma {
    /*
        Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar tum sayilari yazdirin.
        Ancak;
        -Sayi 3'un kati ise sayi yerine "Java" yazdirin.
        -Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
        -Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
         */

    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi giriniz: ");
    int a = scan.nextInt();


        if (a < 100 && a > 0) {
        for (int i = 1; i < a; i++) {    //5
            System.out.print(i + ",");// 1, 2, 3, 4
        }
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.print("Java guzeldir");
        } else if (a % 3 == 0) {
            System.out.println("Java");
        } else if (a % 5 == 0) {
            System.out.println("Guzeldir");
        }

    } else {
        System.out.println("Gecersiz Sayi");
    }
}
}