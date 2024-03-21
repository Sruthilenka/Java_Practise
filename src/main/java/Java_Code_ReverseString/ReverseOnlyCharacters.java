package Java_Code_ReverseString;

public class ReverseOnlyCharacters {
    public static void revChar(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if (!Character.isAlphabetic(ch[i])) {
                i++;
            }
            if (!Character.isAlphabetic(ch[j])) {
                j--;
            }
            if (Character.isAlphabetic(ch[i])) {
                char temp;
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
      /*  for (int k = 0; k < ch.length; k++) {
            System.out.print(ch[k]);
        }*/

        String output = new String(ch);
        System.out.println(output);

    }


    public static void main(String[] args) {
        revChar("S%^&RT)(UHI");
    }
}
