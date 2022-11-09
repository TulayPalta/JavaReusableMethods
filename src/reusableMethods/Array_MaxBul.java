package reusableMethods;

import java.util.Arrays;

public class Array_MaxBul {
    public static void main(String[] args) {

        //Largest Number in Array using Arrays
        int [] arr = {5, 6, 76, 31, 43, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
