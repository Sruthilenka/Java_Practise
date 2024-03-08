package Collections.ArrayList2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL {
    public static void main(String[] args){
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<String>();
        cowal.add("Monica");
        cowal.add("Racheal");
        cowal.add("Phoebe");
        cowal.add("Joey");
        cowal.add("Ross");
        cowal.add("Chandler");
        System.out.println(cowal);
        System.out.println("****************************");
        for(int i=0;i<cowal.size();i++){
            System.out.println(cowal.get(i));
        }

        System.out.println("****************************");
       for(String i : cowal){
           System.out.println(i);
        }

        System.out.println("****************************");
       cowal.stream().forEach(ele-> System.out.println(ele));

        System.out.println("****************************");
        Iterator<String> it = cowal.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
