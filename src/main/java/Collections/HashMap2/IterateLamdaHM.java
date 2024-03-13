package Collections.HashMap2;

import java.util.HashMap;

public class IterateLamdaHM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>() {{
            put("Steve", 10);
                    put("Robin", 20);
                    put("Elena", 30);
        }};
        hm1.forEach((k,v)-> System.out.println("Key "+k+" Value "+v));
    }
}
