package SortedArrayRemoveDup;

import java.util.*;

public class RemDupHashSet {
    public static void main(String[] args){
        Integer[] arr1={1,1,2,3,4,4,5,5,6,6,7};
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr1));
      /* for(int i:arr1){
            set1.add(arr1[i]);
        }*/
        for(Integer i:set1){
            System.out.println(i);
        }



    }
}
