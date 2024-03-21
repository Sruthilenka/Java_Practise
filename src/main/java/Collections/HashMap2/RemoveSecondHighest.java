package Collections.HashMap2;

import java.util.*;

public class RemoveSecondHighest {
    public static void remove() {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>() {{
            put(1, 5);
            put(2, 10);
            put(3, 4);
            put(4, 7);

        }};

        System.out.println(map1);
        int max=Integer.MIN_VALUE; //constant which gives the min value which integer can hold
        int second_max = Integer.MIN_VALUE;
        for(int i:map1.values()){
            if(i>max){
               second_max=max;
               max=i;
            }else if(i>second_max && i!=max){
                second_max = i;
            }
        }

        Iterator<Map.Entry<Integer,Integer>> it = map1.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            if(entry.getValue()==second_max){
                it.remove();
            }
        }

        System.out.println(map1);
    }

public static void main(String[] args){

        remove();
}



    }

