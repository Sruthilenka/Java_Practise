package SortedArrayRemoveDup;

import java.util.HashMap;

public class RemDupHashMap {
    public static void main(String[] args){
        int[] arr1= {1,1,2,3,4,4,5,6,6,7,8,9};

        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int i:arr1){
            map1.put(i,i);
        }

        //Keep in mind that the order of elements may not be preserved, as HashMap does not maintain the insertion order of keys. If preserving the order is important, you may need to use a LinkedHashMap instead of a HashMap.
        Integer[] arr2 = map1.keySet().toArray(new Integer[map1.size()]); //Should use object class Integer.

        for(Integer i:arr2){
            System.out.println(i);
        }
    }
}
