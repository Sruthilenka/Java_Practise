package Collections.ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromAL {
    public static void main(String[] args){
        //Linked HAsh set
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("S","S","s","P","Q","P","T"));
        LinkedHashSet<String> linkedHashSet =new LinkedHashSet<>(list1);
        System.out.println(linkedHashSet);

        ArrayList<String> nodupal=new ArrayList<>(linkedHashSet);
        System.out.println(nodupal);


        //stream
        List<String> streamlist = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(streamlist);

    }
}
