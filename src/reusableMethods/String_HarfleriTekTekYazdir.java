package reusableMethods;

import java.util.Scanner;

public class String_HarfleriTekTekYazdir {
    public static void main(String[] args) {
        /*
Girilen bir stringin harflerini teker teker ekrana alt alta olacak
sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz...");
        String str=input.nextLine();

        for (int i = 0; i <str.length() ; i++) {//ifadenin karakterlerine bakildi
            if (str.charAt(i) == 'a' || str.charAt(i)==' ')//ifadede 'a' yada ' bosluk gorursen atla
                continue;
            System.out.println(str.charAt(i));
        }

    }
}
