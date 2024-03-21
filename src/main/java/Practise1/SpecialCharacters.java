package Practise1;

public class SpecialCharacters {
    public static void splchar(String s){
        char[] ch = s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
           if(!(Character.isAlphabetic(ch[i])) && !(Character.isDigit(ch[i])) && !(Character.isWhitespace(ch[i]))){
               count++;
           }
        }
        System.out.println(count);
    }


    public static void main(String[] args){
        splchar("SR%^&899THtyu");
    }
}
