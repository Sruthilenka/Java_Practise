package Collections.EnumSet;

import java.util.EnumSet;

public class AddOneSetToOther {
    public enum Fruits{
        APPLE,BANANA,MANGO,PEARS,APRICOT,GRAPES,GUAVA
    }
    public static void main(String[] args){
        EnumSet<Fruits> ef1= EnumSet.allOf(Fruits.class);
        EnumSet<Fruits> ef2= EnumSet.noneOf(Fruits.class);
        ef2.addAll(ef1);
        System.out.println(ef2);
    }
}
