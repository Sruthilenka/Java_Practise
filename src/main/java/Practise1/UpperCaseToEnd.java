package Practise1;

public class UpperCaseToEnd {

    public static void upperCase(String s){
        char[] ch= s.toCharArray();
        String rev="";
        String rev1="";
        for(int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                rev=rev+ch[i];
            }else{
                rev1=rev1+ch[i];
            }
        }
        rev1=rev1+rev;
        System.out.println(rev1);
    }



    public static void main(String[] args){
       upperCase("SRuthI");
    }
}
