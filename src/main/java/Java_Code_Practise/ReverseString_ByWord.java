package Java_Code_Practise;

public class ReverseString_ByWord {

    public static void reverseString(String s){
        String[] sb = s.split(" "); //--> split returns array of strings
        String rev =" ";
        for(int i= sb.length-1;i>=0;i--){
            rev=rev+sb[i]+" "; //  to append space between the words
        }
        System.out.println(rev.trim()); // to remove space after the second word
    }

public static void main(String[] args){
        reverseString("Sruthi lenka");
}
}
