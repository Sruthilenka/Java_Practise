package Palindrome;


public class PalindromeSubString {

    public static void palSubString(String s){
        //first extract substring
        s=s.toLowerCase();
        int len=s.length();
        for(int i=0;i<len;i++){
            for (int j=i;j<len;j++){
                String p = s.substring(i,j+1);
               if(chkpal(p)){
                   System.out.println(p);
               }
              //  System.out.println(p);
            }
        }
    }

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
        palSubString("Nitin");

    }
}
