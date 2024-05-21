package Array;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {3,4,5};
        int[] arr1 = {5,6,7};
        System.out.println(Arrays.equals(arr, arr1));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,1 )));
    }
    
}
