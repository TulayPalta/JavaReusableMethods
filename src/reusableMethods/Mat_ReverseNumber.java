package reusableMethods;

public class Mat_ReverseNumber {
    public static void main(String[] args) {

        //Reverse Number
        int number=542;
        System.out.println("reverse number = "+reverse(number));
    }
        public static int reverse(int number){
            int reverse = 0;
            int remainder = 0;
            do{
                remainder = number%10;
                reverse = reverse*10 + remainder;
                number = number/10;
            }while(number > 0);

            return reverse; }


}
