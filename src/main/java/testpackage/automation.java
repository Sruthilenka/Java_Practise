package testpackage;

import java.util.HashMap;
import java.util.Map;

class MyClass {
    public static void main(String args[]) {
        // Online Java Compiler
        // Use this editor to write, compile and run your Java code online
        System.out.println("Hello, World!");
        String input = "aaabbccda";
        String up = "";
        String [] str = input.split("");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : str){
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }
            else{
                hm.put(s,1);
            }


        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            up = up+entry.getKey() + entry.getValue();
        }

        System.out.print(up); // Output: a4b2c2d1
    }

    }
