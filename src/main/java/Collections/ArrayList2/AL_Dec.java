package Collections.ArrayList2;

import java.util.ArrayList;

public class AL_Dec {
    public static void main(String[] args){
        ArrayList al=new ArrayList(); //This is generic meaning any data type can be stored in it.
        //Actual declaration ArrayList<object> al = new ArrayList<object>
        al.add("Sruthi"); // stores at 0th index and in order
        al.add(100);
        al.add(true);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.size());

        //Array list lowest index=0 and highest index=al.size()-1
    }
}
