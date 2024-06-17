package ToString;

import java.util.Arrays;

public class TString {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int[][] arr1={{1,2,3},{4,5,6},{6,7,8}};

        String array_String= Arrays.toString(arr);
        System.out.println(array_String);

        String array_String2= Arrays.deepToString(arr1);
        System.out.println(array_String2);

    }
}
