package Java_Code_ReverseString;

public class ReverseString_WordsAtPlace {
    public static void reverseString(String s) {
        String rev = "";
        String[] sarr = s.split(" ");
        for (int i = 0; i < sarr.length; i++) {
        String sb1 =  reverseChar(sarr[i]);
        rev= rev+sb1+" "; //for space between words
        }
        System.out.println(rev.trim());
    }
        public static String reverseChar(String s){
         String rev = "";
         char[] ch = s.toCharArray();
         for(int i= ch.length-1;i>=0;i--){
             rev=rev+ch[i];
         }
         return rev;
    }
 public static void main(String[] args){

        reverseString("Sruthi lenka");
 }

}
