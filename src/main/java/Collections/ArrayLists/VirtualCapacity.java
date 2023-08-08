package Collections.ArrayLists;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args){
        ArrayList<Object> ar1 = new ArrayList<Object>(20); // here at this point the physical/actual capacity of the arraylist is 0 but java allocates a virtual capacity of 10 by default
       // In the above step we changed default virtual capacity of 10 to 20
        System.out.println(ar1.size()); // this gives physical capacity

        ar1.add(100);
        System.out.println(ar1.size());

        ar1.add(200);
        ar1.add(300);
        ar1.add(400);
        System.out.println(ar1.size());

    }
}
