package COmparableAndComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CheckComparable {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
         laps.add(new Laptop("Apple",800));
        laps.add(new Laptop("Intel",500));
        laps.add(new Laptop("Dell",600));

        Collections.sort(laps);
    }
}
