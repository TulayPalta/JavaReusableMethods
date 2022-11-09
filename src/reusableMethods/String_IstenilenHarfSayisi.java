package reusableMethods;

import java.util.Scanner;

public class String_IstenilenHarfSayisi {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin

     * ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i)==harf){
                sayac++;
            }
        } System.out.println("girdiginz cumlede \""+harf+"\" harfi "+sayac+" kere kullanilmis.");
    }
}
