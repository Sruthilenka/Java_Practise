package Java_Code_RemoveFromString;

public class RemoveNumberFromString {
    //Input: Sruthi1234lenka5678 Output: SruthiLenka

    //Approaches:
    //Using Inbuild method
    //Without inbuild method

    public static void removeNum(String s) {
        String s1 = s.replaceAll("\\d", "");
        System.out.println(s1.replaceAll("\\s{2}", ""));
    }


    public static void removeNumCharacterClass(String s) {
        String output = "";
        System.out.println(s.length());
        char[] ch = s.toCharArray();
        for (int i = 0; i <= ch.length - 1; i++) {
            if (Character.isAlphabetic(ch[i]))
                output = output + ch[i];
        }
        System.out.println(output);
    }

    //If u dont want to convert it to character then use chat At
    public static void removeNumCharacterClass2(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)))
                output = output + s.charAt(i);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        removeNum("Sruthi1234lenka5678");
        removeNum("Sruthi 1234 lenka 5678");
        removeNumCharacterClass("Sruthi 1234 lenka 5678");
        removeNumCharacterClass2("Sruthi 1234 lenka 5678");


    }

}
