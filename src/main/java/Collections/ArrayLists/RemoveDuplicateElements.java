package Collections.ArrayLists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        //to remove duplicates we can use Linked Hash set or Java stream APIs
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 1, 2, 4, 5));
        //1. Using Linked Hash set
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
        ArrayList<Integer> numberlistwithoutdups = new ArrayList<Integer>(linkedHashSet);
        System.out.println(numberlistwithoutdups);


        //2.After JDk 8, we have stream:
        ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(12, 22, 32, 42, 52, 62, 72, 82, 12, 22, 32, 42, 12, 22, 32, 42, 52, 62, 72, 12, 22, 42, 52));
        List<Integer> marksWithoutDups = marksList.stream().distinct().collect(Collectors.toList()); // Here stream is a method and after applying distinct method we are collecting them into a list.
        System.out.println(marksWithoutDups);

    }
}
