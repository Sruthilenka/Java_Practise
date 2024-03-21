package StringsDemo;

public class SpecialCharacters {
    //count of special charaters in the String-using AScii values
    //

    public static void splch(String s) {
        int count = 0;
        int i;
        char[] ch = s.toCharArray();
        for (i = 0; i < ch.length; i++) {
            int j = (int) (ch[i]);
            //Ascii chars of number-48 && 57
            //Ascii chars of caps-65 90
            //ascii chars of lower case- 97 and 122
            //space-32
            if (!(j >= 48 && j <= 57) && !(j > 65 && j <= 90) &&!(j > 97 && j <= 122) && !(j == 32))
            {
                count++;
                System.out.println(ch[i]);
            }
        }
        if (count == 0) {
            System.out.println("String has no special chars");
        } else {
            System.out.println("Has " + count + "special characters");
        }
    }


    public static void main(String[] args) {
        splch("S%^*tyu13224())__");
    }
}
