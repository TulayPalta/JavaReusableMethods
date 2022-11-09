package reusableMethods;

import java.util.Scanner;

public class Math_ArmstrongNumber {
    public static void main(String[] args) {
/*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi
    Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */


        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen 3 basmakli bir sayi giriniz :");
        int sayi=scan.nextInt();

        int toplam=0;
        int basamak=0;
        int sayi1=sayi;
        while (sayi1>0){
            basamak=sayi1%10;
            toplam+=Math.pow(basamak,3);
            //toplam+=basamak*basamak*basamak;
            sayi1=sayi1/10;
        }
        System.out.println(toplam);
        if (sayi==toplam) {
            System.out.println("girilen sayi amstrong sayidir");
        }
        else{ System.out.println("amstrong sayi degildir");}

        // soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
//      gösteren program yazınız */

        System.out.println("sayi giriniz");
        int sayi2=scan.nextInt();
        int toplam2=0;
        int basamak2=0;
        for (int i = 1; i <=sayi2; i++){
            toplam2=0;
            int container=i;
            while(container>0){
                basamak2=container%10;
                toplam2+=Math.pow(basamak2,3);
                container=container/10;
            }
            if (i==toplam2)
                System.out.print(i+ " ");
        }

    }




}
