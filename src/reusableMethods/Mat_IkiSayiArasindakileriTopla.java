package reusableMethods;

import java.util.Scanner;

public class Mat_IkiSayiArasindakileriTopla {
    public static void main(String[] args) {
       /*
Kullanicidan iki şayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tane sayi giriniz.");
        System.out.print("1. sayi : ");
        int sayi2 = scan.nextInt();
        System.out.print("2. sayi : ");
        int sayi3 = scan.nextInt();
        int toplam1 = 0;

        if(sayi2 <= sayi3)
            toplam1 = tumSayilariTopla(sayi2, sayi3);
        else if(sayi3 < sayi2)
            toplam1 = tumSayilariTopla(sayi3, sayi2);

        System.out.println("Sayi2 + Sayi3 = " + toplam1);
    }
        private static int tumSayilariTopla(int kucukSayi, int buyukSayi)
        {
            int toplam = 0;
            for(int i = kucukSayi; i <= buyukSayi; i++)
            {
                toplam += i;
            }
            return toplam;
        }


    }

