package reusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mat_FibonacciOlustur {
/*
Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
*/

    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
        List<Integer> fibonacchi = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");//4

        int sayi = scan.nextInt();
        // 0-1-1-2-3-5-8-13-21-34.

        fibonacchi.add(0);
        fibonacchi.add(1);

        int i = 1;

        if (sayi <= 1) {
            System.out.println("Lutfen 1 'den buyuk bir sayi giriniz");
        } else {
            while (fibonacchi.get(i) < sayi) {
                fibonacchi.add(fibonacchi.get(i) + fibonacchi.get(i - 1));//bir onceki eleman ile topladik
                i++;// bir basamak ilerlesin
            }
            if (fibonacchi.get(fibonacchi.size() - 1) > sayi) {//fibonacchide yer almiyorsa
                fibonacchi.remove(fibonacchi.size() - 1);//son elemani sil
                System.out.println("Girdiginiz sayi fibonacchide yer almiyor .Girilen sayiya kadarki fibonachi " + fibonacchi);
            } else {
                System.out.println("Girdiginiz sayi bir fibonacchi sayisidir " + fibonacchi);
            }
        }
    }
}