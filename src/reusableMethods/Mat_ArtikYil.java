package reusableMethods;

public class Mat_ArtikYil {
    public static void main(String[] args) {

    /*
  Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
 Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
 Dört yılda bir gelen 366 günlük yil
*/

/*
Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
i)Yil 100 e bolunursa 400 e de bolunmelidir.      ==> 1600+ (artik yil) 1800-(artik yil degil)
ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)
*/


//1.YOL

    int artikYil = 2000;

if (artikYil%100==0) {
        if (artikYil%400==0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }
    } else if (artikYil%4==0) {
        System.out.println("Artik yil");
    } else {
        System.out.println("Artik yil degil");
    }


//2.YOL

    artikYil = 1990;

    String sonuc = artikYil%100==0 ? (artikYil%400==0 ? "Artik yil" : "Artik yil degil") : (artikYil%4==0 ? "Artik yil " : "Artik yil degil");

System.out.println(sonuc);
}
}