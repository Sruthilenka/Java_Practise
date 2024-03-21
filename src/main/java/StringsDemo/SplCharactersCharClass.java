package StringsDemo;

public class SplCharactersCharClass {
    public static void splchars1(String s){
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(!(Character.isAlphabetic(ch[i])) && !(Character.isDigit(ch[i])) && !(Character.isWhitespace(ch[i]))){
                count++;
                System.out.println(ch[i]);
            }
        }
        System.out.println(count);

    }



    public static void main(String[] args){
        splchars1("S%^&92394GHyuu");
    }
}
