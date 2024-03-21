package Palindrome;

public class Palindrome3 {
    //with single variable iteration
    public static boolean chkpal(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(l - i - 1)) {
                return false;
            }

        }
     return true;
    }
    public static void main(String[] args){
        boolean b= chkpal("Nitin");
        if(b){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
