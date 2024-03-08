package Collections.ArrayList2;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args){
        ArrayList<Object> ar = new ArrayList<Object>();
        System.out.println(ar.size()); //It always give physical capacity. But initially a virtual capacity of 10 will be allocated
        //can see the virtual capacity in debug mode

        //To change the default virtual capacity from 10 to some other value,
        ArrayList<Integer> ital = new ArrayList<Integer>(20);
        //Now the VC =20
    }
}
