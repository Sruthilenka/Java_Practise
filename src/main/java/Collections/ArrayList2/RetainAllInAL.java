package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RetainAllInAL {
    public static void main(String[] args){
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,2,3,4,5,6,7,8,9,10));
        list2.retainAll(Collections.singleton(1));
        System.out.println(list2);

    }

}
