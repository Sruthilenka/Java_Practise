package Collections.EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class IterateEnumSet {
    public enum Fruits {
        APPLE, BANANA, MANGO, PEARS, APRICOT, GRAPES, GUAVA
    }

    public static void main(String[] args) {
        EnumSet<Fruits> ef1 = EnumSet.allOf(Fruits.class);

        Iterator<Fruits> it = ef1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
