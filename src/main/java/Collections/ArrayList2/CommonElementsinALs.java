package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CommonElementsinALs {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 1, 3, 8, 4, 5, 9, 7, 6, 2));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 6, 3, 2, 8, 6, 9, 1, 5, 7));

       // list1.retainAll(Collections.singleton(1)); // Collections.singleton(1) this creates a set with one element 1
       // System.out.println(list1);
        list1.retainAll(list2);
        System.out.println(list1);

    }
    }
