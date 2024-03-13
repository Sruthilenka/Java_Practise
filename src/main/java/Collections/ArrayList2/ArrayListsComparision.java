package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListsComparision {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,1,3,8,4,5,9,7,6,2));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,6,3,2,8,6,9,1,5,7));
       Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println(list1.equals(list2));

    }
}
