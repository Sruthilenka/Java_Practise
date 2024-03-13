package Collections.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistMethods {
    public static void main(String[] args){
        LinkedList<String> ll1= new LinkedList<>();
        ll1.add("Sruthi");
        ll1.add("Lenka");
        System.out.println(ll1);

        //adding at particular index
        ll1.add(1,"Woman");

        System.out.println(ll1.size());

        System.out.println(ll1);
        System.out.println(ll1.get(0));

        //iterator
        Iterator<String> it = ll1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //for each
        for(String s:ll1){
            System.out.println(s);
        }
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("John","Sparrow","Blake","Cooney"));
        LinkedList<String> ll3 = new LinkedList<>();
        ll3.addAll(ll2);
        System.out.println(ll2);
        System.out.println(ll3);

        ll3.addFirst("Tom");
        ll3.addLast("Brtiney");
        System.out.println(ll3);

        ll3.remove(2);
        ll3.remove("Crow");
        System.out.println(ll2);
        ll2.clear();
        System.out.println(ll2);
        System.out.println(ll3);
        ll3.removeAll(ll2);
        System.out.println(ll3);
    }
}
