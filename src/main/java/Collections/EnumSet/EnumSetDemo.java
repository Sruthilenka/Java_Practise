package Collections.EnumSet;

import java.util.EnumSet;

public class EnumSetDemo {
    enum Lang {
        JAVA, PYTHON, RUBY, C,CSHARP
    }

    public static void main(String[] args) {
        //all elements of enum being added to enumset
        EnumSet<Lang> enum1 = EnumSet.allOf(Lang.class);
        System.out.println(enum1);

        //add only one element to enumset from enum
        EnumSet<Lang> oneel = EnumSet.of(Lang.CSHARP);

        //add particular values
        EnumSet<Lang> part = EnumSet.of(Lang.RUBY, Lang.C);
        EnumSet<Lang> enum2 = EnumSet.noneOf(Lang.class);
        System.out.println(enum2);

        //add method
        enum2.add(Lang.RUBY);
        System.out.println(enum2);

        EnumSet<Lang> rangeenumset =EnumSet.range(Lang.JAVA, Lang.RUBY);
        //This creates enumset with only values from Java to ruby
        System.out.println(rangeenumset);
    }
}
