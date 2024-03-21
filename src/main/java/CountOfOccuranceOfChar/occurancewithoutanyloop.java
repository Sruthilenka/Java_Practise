package CountOfOccuranceOfChar;

public class occurancewithoutanyloop {
    public static void main(String s,char ch){
        int slength=s.length();
       String snew= s.replaceAll(String.valueOf(ch),""); //or directly send ch as String instead of char
       int snewlength=snew.length();
       int l=slength-snewlength;
        System.out.println("The character "+ch+" has occurred "+l+" times");
    }



    public static void main(String[] args){
        main("Srrruthi",'r');
    }
}
