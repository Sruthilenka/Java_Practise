package Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    /*
    2 ways to synchronise Arraylists
    - Collections.synchronizedList(); - returns Synchronised list
    -copyOnwriteArrayList class
     */
    public static void main(String[] args){
        // 1. Synchronized ArrayList
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>()); //Synchronised method will return a List type, so storing it in List var
        namesList.add("Tom");
        namesList.add("Jerry");
        namesList.add("Sony");

        //add, remove doesnt require explicit synchronization whereas for fetching the values we need explicit synchronization
        synchronized (namesList){
            Iterator<String> it = namesList.iterator();
            while(it.hasNext())
                System.out.println(it.next());
        }
       // 2.CopyOnWriteArrayList --> its a class
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        empList.add("Elena");
        empList.add("Tom");
        Iterator<String> it = empList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
