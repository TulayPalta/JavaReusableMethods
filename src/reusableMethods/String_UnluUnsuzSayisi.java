package reusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_UnluUnsuzSayisi {
    public static void main(String[] args) {

    //1. yol
        String str = "Count number of Vowels and Consonants";
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if ((str.charAt(i) >= 'a'&& str.charAt(i) <= 'z')){
                cCount++;
            }
        } System.out.println("number of vowels is "+vCount+" and number of consonants is "+cCount );

        // 2. yol
        System.out.println(numbers(str));
    }

    public static String numbers(String word) {
        int countVowels = 0;
        int countConsonants = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> consonants = new ArrayList<>();
        word=word.replaceAll("\\s","");

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
