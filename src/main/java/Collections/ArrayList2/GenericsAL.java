package Collections.ArrayList2;

import java.util.ArrayList;

public class GenericsAL {
    public static void main(String[] args){
        ArrayList<Integer> al_int = new ArrayList<Integer>();
        al_int.add(1);
        al_int.add(2);
        System.out.println(al_int);
        System.out.println(al_int.get(1));

        ArrayList<String> s_al =new ArrayList<String>();
        s_al.add("Sruthi");
        s_al.add("Sri");
        s_al.add("Urvi");
        System.out.println(s_al);
        System.out.println(s_al.get(1));

    }
}
