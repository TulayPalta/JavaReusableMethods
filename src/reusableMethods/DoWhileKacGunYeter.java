package reusableMethods;

public class DoWhileKacGunYeter {
    public static void main(String[] args) {
        /*
Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var
Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
int MuzSayısı =165, hayatta kalmaDays = 0;
 boolean maymunAlive = true;
*/

//Maymunun kac gun hayatta kalacagini gosteren kod
//Hayatta kaldigi suerece muz vermelisin
//(DO While)
//eger 4 ten az muz kalirsa maymunlar olur


        int muzSayisi =165;
        boolean maymunAlive = true;
        int survivalDays = 1;

        do {
            muzSayisi -= 4; //her gun 4 muz eksiltir
            survivalDays++;

            if(muzSayisi<4){
                maymunAlive = false;
                System.out.println("bugun  "+(survivalDays)+ " gun yasayamadi muz kalmadi.Maymun oldu");
            } else System.out.println("bugun "+survivalDays+" gun yasadi Muz bitmedi.Maymun hayatta");

        }while(maymunAlive);
        System.out.println("Toplam maymunun yasadigi gun sayisi "+(survivalDays-1));


    }
}
