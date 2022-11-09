package reusableMethods;

public class String_Tekrarsiz {

    public static void main(String[] args){

        String word = "melikem";
        String result = "";
        for (int i = 0; i < word.length(); i++)
        {
            if (!result.contains(word.substring(i, i+1))) {
                result += word.substring(i, i+1);
            }
        }
        System.out.println(result);
    }
}
