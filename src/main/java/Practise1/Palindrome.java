package Practise1;



public class Palindrome {

    //Method 1
    public static void palcheck(String s){
        String rev = "";
        char[] ch = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        if(s.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

  //Method 2 - comparing 1st and last chars
    public static void comppal(String s){
        int i=0, j = s.length()-1;
        Boolean b = true;
        s=s.toLowerCase();
        while(i<j){
           if(s.charAt(i)!=s.charAt(j)){
               b=false;
           }
           i++;
           j--;
        }
        if(b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }


    //Method 3 Single Variable iteration
    public static void singpal(String s) {
        int l= s.length();
        Boolean b=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.toLowerCase().charAt(i)!=s.toLowerCase().charAt(l-i-1)){
                b=false;
            }
        }
        if(b){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }


    //Method 4 - Check if Substring is palindrome or not
    public static void chksub(String s){
        s=s.toLowerCase();
        int n= s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String s1= s.substring(i,j+1);
                if (palcheck1(s1)){
                    System.out.println(s1);
                }
            }
        }
    }

    public static boolean palcheck1(String s){
        int i=0,j=s.length()-1;
        Boolean b = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                b=false;
            }
            i++;
            j--;
        }
        return b;
    }


    public static void main(String[] args){
        //palcheck("10012");
       // comppal("Nitin");
        //singpal("Nitin");
        chksub("Nitin");
    }
}
