package reusableMethods;

import java.util.Scanner;

public class DoWhileToplamakadar {
    public static void main(String[] args) {
        /*
Kullanicidan toplanmak uzere sayilar isteyin.
Sayi adedi 10'u gecerse yada toplami 500'u gecerse " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
 */

        Scanner imput = new Scanner(System.in);
        int sayi =0;
        int toplam=0;
        int sayac=0;

        while (sayac<11 && toplam<500){
            System.out.println("lutfen toplanmak uzere sayı giriniz");
            sayi=imput.nextInt();
            toplam+=sayi;
            sayac++;

        }
        if (toplam>500){
            System.out.println(sayac+"adet sayi girdiniz .toplami"+toplam);
        }else System.out.println("bu kadar sayi yeter ."+sayac+"adet sayi girdiniz"+toplam);
    }

}

