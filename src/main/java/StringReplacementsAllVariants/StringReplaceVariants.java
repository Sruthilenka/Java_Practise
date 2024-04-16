package StringReplacementsAllVariants;

public class StringReplaceVariants {

    //Replace
    public static void replace1(String s, char o, char n) {
        System.out.println("s before:" + s);
        s = s.replace(o, n);
        System.out.println(s);
    }

    public static void replace2(String s, String o, String n) {
        System.out.println("s before:" + s);
        s = s.replace(o, n);
        System.out.println(s);
    }

    //ReplaceAll
    public static void replace3(String s, String o, String n) {
        System.out.println("s before:" + s);
        s = s.replaceAll(o, n);
        System.out.println(s);
    }


    public static void replace4(String s, String o, String n) {
        System.out.println("s before:" + s);
        s = s.replaceAll(o, n);
        System.out.println(s);
    }


    //To replace first occurance
    public static void replace5(String s, String o, String n) {
        System.out.println("s before:" + s);
        s = s.replaceFirst(o, n);

        System.out.println(s);
    }

    public static void main(String[] args) {
        replace4("Jagrat Automation JagratRepository", "Jagrat", "JAR HUB");
        //Regular Expression with ReplaceAll --> to replace everything before
       // replace4("Jagrat Automation JagratRepository", "(.*)Jagrat(.*)", "JAR HUB");

        //To replace only the first occurance of the substring
      //  replace5("Jagrat Automation JagratRepository", "Jagrat", "JAR HUB");
    }
}
