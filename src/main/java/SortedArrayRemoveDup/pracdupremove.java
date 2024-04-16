package SortedArrayRemoveDup;

import java.util.HashMap;

public class pracdupremove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1, 4};
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : arr) {
map1.put(i,i);
        }

        Integer[] arr2= map1.keySet().toArray(new Integer[0]);
    }
}
