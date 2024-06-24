package LeetcodePractise;

import java.util.ArrayList;
import java.util.List;

public class AllSubStrings {
public static List allSubStrings(String s){
    List<String> list1 = new ArrayList<>();
    for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            list1.add(s.substring(i,j));
        }
    }
    return list1;
}
    public static void main(String[] args) {
        String s="Sruthi";
        List<String> list1 = allSubStrings(s);
        for(String s1 : list1){
            System.out.println(s1);
        }
    }
}
