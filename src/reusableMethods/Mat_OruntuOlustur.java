package reusableMethods;

import java.util.Scanner;

public class Mat_OruntuOlustur {
    public static void main(String[] args) {


    //Kullanicidan baslangic , bitis ve artis miktarini alarak
// aradaki tum sayilari aralarina virgul koyarak yazdirin

    Scanner inpuy = new Scanner(System.in);
    int baslangic = 10;
    int bitis= 50;
    int artisMiktari =5;

for (int i =baslangic ; i <=bitis ; i+=artisMiktari)
    {
        if (i<bitis){
            System.out.print(i+",");
        }else
            System.out.print(i);
    }
}
}