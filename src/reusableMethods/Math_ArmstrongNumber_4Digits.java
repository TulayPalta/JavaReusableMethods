package reusableMethods;

import java.util.Scanner;

public class Math_ArmstrongNumber_4Digits {
    public static void main(String[] args) {
        /*
 Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi
 Armstrong sayidir
     (0, 1, 153, 370, 371, 407, 1634)
     153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
     370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
     16 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634  */

         Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : " );

       String sayi = scan.next().replaceAll("\\D","");
       String [] str = sayi.split("");
       int toplam = 0;
        for (String each: str
             ) { toplam+=(int)Math.pow(Double.parseDouble(each), str.length);

        }
       if ((Integer.parseInt(sayi)) == toplam){
           System.out.println("bu bir armstrong sayidir ");

       }else System.out.println("bu bir amstrong sayi değildir ");




    }

   }