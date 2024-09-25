package Array;

import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][] a[] = {{{2,3,4},{4,5}},{{6,7},{8,9,7}}};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(new int[][]{{3,4},{5,6}}));
        //we can give the name to anonymous array 
        int[] x= new int[]{4,5,6};

        x[0] ='a'; //valid because char is promoted to the int
        
    }
}
