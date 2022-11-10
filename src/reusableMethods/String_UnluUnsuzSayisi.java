package reusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_UnluUnsuzSayisi {
    public static void main(String[] args) {

    //1. yol
        String word = "Team 10 Projeye Baslayacak";
        int sesliSayisi = 0, sessizSayisi = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                sesliSayisi++;
            } else if ((word.charAt(i) >= 'a'&& word.charAt(i) <= 'z')){
                sessizSayisi++;
            }
        } System.out.println("number of vowels is "+sesliSayisi+" and number of consonants is "+sessizSayisi );

        System.out.println(numbers(word));

    }

    // 2. yol
    public static String numbers(String word) {
        int countVowels = 0;
        int countConsonants = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> consonants = new ArrayList<>();
        word=word.replaceAll("\\s","");
        word=word.replaceAll("\\d","");

        for(char i = 'a'; i <= 'z'; i++) {
            if(!vowels.contains(i)) {
                consonants.add(i); }
        }
        word = word.toLowerCase();
        for( int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.charAt(i))) {
                countVowels++;
            }else {
                countConsonants++; }
        }
        return "number of vowels is " + countVowels + " and number of consonants is " +
                countConsonants; }


}
