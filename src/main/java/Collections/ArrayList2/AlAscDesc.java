package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AlAscDesc {
    public static void main(String[] args){
        ArrayList al=new ArrayList();
        al.add("Xylophone");
        al.add("Egg");
        al.add("Zebra");
        al.add("Basket");

      /*  System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);*/


        ArrayList al1= new ArrayList(Arrays.asList(4,2,3,7,6,9,1,0));
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);
        Collections.sort(al1,Collections.reverseOrder());
        System.out.println(al1);
    }
}
