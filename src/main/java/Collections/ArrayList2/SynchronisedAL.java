package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronisedAL {
    public static void main(String[] args){
        List<String> list1 = Collections.synchronizedList(new ArrayList<>());
        list1.add("list name1");
        list1.add("list name2");

        //passing arraylist name directly
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Sruthi");
        al1.add("Lenka");
        List<String> list2 = Collections.synchronizedList(al1);
        System.out.println(list2);

        //For add,remove no need of explicit synchronisation
        //For fetch we need explicit synchronisation -- synchronized keyword

        synchronized (list2){
            Iterator<String> it =list2.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }


    }
}
