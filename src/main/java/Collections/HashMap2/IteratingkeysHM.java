package Collections.HashMap2;

import java.util.HashMap;
import java.util.Iterator;

public class IteratingkeysHM {
    public static void main(String[] args){
        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("Sruthi","Lenka");
        hm1.put("Sri","Karri");
        hm1.put("Urvi","Karri");

        //iterate keys-- keySet
       Iterator<String> it = hm1.keySet().iterator();
       while(it.hasNext()){
           String Key = it.next();
           String Value= hm1.get(Key);
           System.out.println("Key : "+Key+" Value : "+Value);
       }
    }
}
