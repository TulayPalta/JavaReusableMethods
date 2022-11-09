package reusableMethods;

import java.util.Scanner;

public class String_IlkVeSonHarf {/*
 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
 * return eden metod yaziniz
 *
 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str = scan.next();
        System.out.print("Tekrar edilecek miktar giriniz: ");
        int tekrarSayisi = scan.nextInt();

        System.out.println(("" + str.charAt(0) + str.charAt(str.length() - 1)).repeat(Math.max(0, tekrarSayisi)));


    }
}
