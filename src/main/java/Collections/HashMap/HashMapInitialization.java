package Collections.HashMap;

import com.google.common.collect.ImmutableMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

    public static Map<String, Integer> marksMap;

    static {
        marksMap = new HashMap<>();
        marksMap.put("A", 100);
    }

    public static void main(String[] args) {
        //1.Using HashMap class
        HashMap<String, Integer> marks = new HashMap<String, Integer>();
        Map<String, Integer> marks1 = new HashMap<String, Integer>(); //top cast

        //2. Static way of declaring Hash map -- declare n initialse out of main method just immediately after main class
        System.out.println(HashMapInitialization.marksMap.get("A")); // access it using the class name

        //3.Immutable Map with single Entry
        Map<String, Integer> map3 = Collections.singletonMap("test", 100);
        System.out.println(map3);
        //  map3.put("abc",200); // gives unsupportedOperation Exception

        //4. JDK 8- toMAp()
        Map<String, String> map4 = Stream.of(new String[][]{  // here we are just creating a 2 dim array
                {"Tom", "Elena"},
                {"Tum", "Jerry"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1])); // here we are coverting that 2 dim array to map
        System.out.println(map4);// sout(map4.get("Tom"));

        //5.Simple Entry Method
        Map<String, String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<String, String>("Naven", "Java") {
                }
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        //JDK 1.9 -> Map.of method
        //Empty Map:
        // Map<String,String> emptyMap =Map.of(); --> Mine is 1.8 so not supported
        //emptyMap.put will not be supported

        //Creating singleton Map with map.of method:
        // Map<String,String> singleTonMap1 = Map.of("k1",v1"");
        //singleTonMap.get("k1");
        //singleTonMap.put("k1","V2"); // gives exception as it is a singleton map

        // creating multi value maps
        //Map<String,String> multiMap = Map.of("k1","v1","k2","v2","k3","v3");// supports max 10 key value entires

        /*Map.ofEntries(
        new AbstractMap.SimpleEntry<>("A",100);
        new AbstractMap.SimpleEntry<>("b",100);
        new AbstractMap.SimpleEntry<>("c",100);
         );*/    // --> Immutable map


        //We also have Guava library from Google, just add the library in your POM
        Map<String,String> titleMaps = ImmutableMap.of("Google", "Google inia","Amazon","Amazon india");
        //Immutable map
    }
}
