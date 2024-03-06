package UpperCasesToEnd;

public class AllUpperCaseToEnd {
    //I/p: SRUthiLEnKa
    //o/p: thinaSRULEK
    public static void allUpper(String s){
        String upper="";
        String lower="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                upper=upper+s.charAt(i);
            else
                lower=lower+s.charAt(i);
        }
        String output= lower+upper;
        System.out.println(output);
    }


    public static void main(String[] args){
       AllUpperCaseToEnd.allUpper("SRUthiLEnKa"); //just checking if we are getting any exception when calling a static method with the help of class name.
    }
}
