package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAdditionalEleAL {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 1, 3, 8, 4, 5, 9, 7, 6, 2));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 6, 3, 2, 8, 6, 9, 1, 5, 7));

        //so lets remove list 2 elements from list 1, so whatever are remaining are the additional elements
        list1.removeAll(list2);
        System.out.println(list1);

       /* list1.remove(list2);
        System.out.println(list1);*/

    }
    }
