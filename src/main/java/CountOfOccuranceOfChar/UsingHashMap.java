package CountOfOccuranceOfChar;

import java.util.HashMap;
import java.util.Iterator;

public class UsingHashMap {

    public static void charoccu(String s) {
        HashMap<Character,Integer> map1= new HashMap<>();
        char[] ch1= s.toCharArray();
        for(char ch:ch1){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
         /*   if(ch== ' '){
                continue;
            }
            else if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }*/
        }

        map1.forEach((k,v)->{
            System.out.println(k+" "+v);
         //   System.out.println(v);
        });
/*Iterator<Character> it = map1.keySet().iterator();
        while(it.hasNext()){
            char key= it.next();
            int value= map1.get(key);
            if(value>1)
            System.out.println(key+" "+value);
        }*/

    }


    public static void main(String[] args) {

        charoccu("Sruthiruthisretdhy");
    }
}

