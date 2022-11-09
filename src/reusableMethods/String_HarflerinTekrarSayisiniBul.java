package reusableMethods;

import java.util.Arrays;
import java.util.Scanner;

public class String_HarflerinTekrarSayisiniBul {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
*/
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = input.nextLine();
        //split()
        String arr[] = str.split("");//her bir karakteri ayirir
        System.out.println(Arrays.toString(arr));
        //sort()
        Arrays.sort(arr);//siralar
        System.out.println(Arrays.toString(arr));
        //[a, a, c, i, l, n]
        int counter = 0;//karakterleri saydir
        for (int i = 1; i < arr.length; i++) {
            //i=0 yazarsak son indexde sorun cikariyor.
            // son indexdekini neyle karsilastiracagiz
            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni  harflerse bir artir
            } else {
                System.out.println(arr[i - 1] + " karakter sayisi " + (counter + 1));
//a ile a yi karsilastirdi counter 0 di 1 yapti //halbuki 2 tane a var bu yuzden counter+1

                counter = 0;
//farkli karaktere gectigi icin counteri sifirla
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " karakterinin sayisi " + (counter + 1));
            }
        }
    }
}
