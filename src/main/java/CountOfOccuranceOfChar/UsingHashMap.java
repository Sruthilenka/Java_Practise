package CountOfOccuranceOfChar;

import java.util.HashMap;
import java.util.Iterator;

public class UsingHashMap {

    public static void charoccu(String s) {
        HashMap<Character,Integer> map1= new HashMap<>();
        char[] ch1= s.toCharArray();
        for(char ch:ch1){
            if(ch== ' '){
                continue;
            }
            else if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }
Iterator<Character> it = map1.keySet().iterator();
        while(it.hasNext()){
            char key= it.next();
            int value= map1.get(key);
            System.out.println(key+" "+value);
        }

    }


    public static void main(String[] args) {

        charoccu("Sruthiruthisretdhy");
    }
}

