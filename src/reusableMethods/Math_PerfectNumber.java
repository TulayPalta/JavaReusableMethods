package reusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("\nCikmak icin --> X <--" +
                        "\nPerfect number kontrolu icin bir sayi giriniz: ");
                int sayi = scan.nextInt();
                System.out.println("Girilen sayi: " + sayi);
                perfectNumberControl(sayi);
                girilenSayiyaKadarOlanPerfectNumber(sayi);
            } catch (Exception e) {
                e.printStackTrace();
                String girilenHarf = scan.next();
                if (girilenHarf.equalsIgnoreCase("x")) {
                    break;
                }
            }
        }
    }
    private static void girilenSayiyaKadarOlanPerfectNumber(int sayi) {
        List<Integer> perfectNumberListesi = new ArrayList<>();
        for (int i = 1; i < sayi; i++) {
            int toplam = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    toplam += j;
                }
            }
            if (i == toplam) {
                perfectNumberListesi.add(i);
            }
        }
        System.out.println(sayi + " sayisina kadar olan mukemmel sayilar: " + perfectNumberListesi);
    }
    private static void perfectNumberControl(int sayi) {
        List<Integer> bolenlerinListesi = new ArrayList<>();
        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
                bolenlerinListesi.add(i);
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " is a perfect number");
            System.out.println("Girilen sayiyi tam bolenlerin listesi: " + bolenlerinListesi);
        } else {
            System.out.println(sayi + " is not a perfect number");
            System.out.println("Girilen sayiyi tam bolenlerin listesi: " + bolenlerinListesi);
        }

}



}
