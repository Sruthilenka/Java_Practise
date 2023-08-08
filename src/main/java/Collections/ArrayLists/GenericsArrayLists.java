package Collections.ArrayLists;

import java.util.ArrayList;

public class GenericsArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> marksList = new ArrayList<Integer>();
        marksList.add(99);

        ArrayList<String> studentName = new ArrayList<String>();
        studentName.add("Sruthi");
        studentName.add(String.valueOf(99));
    }
}
