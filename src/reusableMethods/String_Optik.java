package reusableMethods;

import java.util.Arrays;
import java.util.Scanner;

public class String_Optik {
        /*
Ogrencilerin test sonuclarini degerlendiren Java kodunu  yaziniz
//10 sorumuz var
//ogrencilerin cevaplari
char[][] answers ={
{‘B’,‘B’,‘E’,‘C’,‘C’,‘D’,‘E’,‘E’,‘A’,‘D’},
{‘B’,‘B’,‘A’,‘C’,‘C’,‘D’,‘E’,‘E’,‘A’,‘D’},
{‘E’,‘B’,‘E’,‘C’,‘C’,‘D’,‘E’,‘E’,‘A’,‘D’}};
// cevap anahtari
char[] keys = {‘D’,‘B’,‘D’,‘C’,‘C’,‘D’,
‘A’,‘E’,‘A’,‘D’};
output:
1 nolu ogrencinin dogru cevap sayisi :7
2 nolu ogrencinin dogru cevap sayisi :6
3 nolu ogrencinin dogru cevap sayisi :54
*/
        public static void main(String[] args) {
            cevapKontrolu();
        }
        static void cevapKontrolu() {
            Scanner input = new Scanner(System.in);
            System.out.println("Testteki soru sayisini giriniz");
            int soruSayisi = input.nextInt();
            System.out.println("Teste katilan ogrenci sayisini giriniz");
            int stdNums = input.nextInt();
            char keys[] = new char[soruSayisi];
            char answers[][] = new char[stdNums][soruSayisi];
            System.out.println("Lutfen cevap anahtarini sirali olarak giriniz");
            for (int i = 0; i < keys.length; i++) {
                Scanner scan = new Scanner(System.in);
                System.out.println((i + 1) + ". sorunun cevabini giriniz");
                char cevap = scan.next().toUpperCase().trim().charAt(0);
                keys[i] = cevap;
            }
            System.out.println(Arrays.toString(keys));
            for (int i = 0; i < stdNums; i++) {
                System.out.println((i + 1) + ". ogrencinin cevaplarini girmeye baslayabilirsiniz");
                for (int j = 0; j < soruSayisi; j++) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println((i + 1) + ". Ogrencinin " + (j + 1) + ". cevabini giriniz");
                    char stdCevap = scan.next().toUpperCase().trim().charAt(0);
                    answers[i][j] = stdCevap;
                }
            }
            System.out.println(Arrays.deepToString(answers));
            for (int i = 0; i < answers.length; i++) {
                int trueAnswers = 0;
                int falseAnswers = 0;
                for (int j = 0; j < keys.length; j++) {
                    if (answers[i][j] == keys[j]) {
                        trueAnswers++;
                    } else {
                        falseAnswers++;
                    }
                }
                System.out.println((i + 1) + " nolu ogrencinin dogru cevap sayisi: " + trueAnswers + ", yanlis cevap sayisi : " + falseAnswers);
            }
    }
}
