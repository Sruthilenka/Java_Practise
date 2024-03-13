package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Sruthi");
        ll1.add("Lenka");
      //  System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<>();

        Iterator<String> it = ll1.descendingIterator();
        while(it.hasNext()){
          //  System.out.println(it.next());
            ll2.add(it.next());
        }
        System.out.println(ll2);
    }
}
