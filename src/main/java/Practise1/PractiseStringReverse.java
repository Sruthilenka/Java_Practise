package Practise1;

public class PractiseStringReverse {
    //reverse of String
    public static void revstring(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
          rev=rev+s.charAt(i);
        }
        System.out.println(rev.trim());
    }

    //rev-tocharArray
    public static void revCharArray(String s)
    {
        String rev="";
        char[] ch= s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+ch[i];
        }
        System.out.println(rev);
    }


    //StringBuilder
    public static void sbstring(String s){
        StringBuilder sb= new StringBuilder(s);
      String str =  sb.reverse().toString();
        System.out.println(str);
    }


    //String Buffer
    public static String sbstring1(String s){
        StringBuffer sb= new StringBuffer();//lets use append
        String str =  sb.append(s).reverse().toString();
        System.out.println(str);
        return str; // modified for the other method
    }



    //Reverse Words in place - split
    public static void revWords(String s){ //s= Sruthi Lenka o/p-> ihturs aknel
       String[] arr= s.split(" "); //arr[0]-Sruthi arr[1]=lenka
        String rev="";
        for(int i=0;i< arr.length;i++){
            String p = sbstring1(arr[i]);
            rev=rev+p+" ";
        }
        System.out.println(rev.trim());
    }

    public static void revWords1(String s){
        String[] str= s.split(" ");
        String rev= "";
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+" ";
        }
        System.out.println(rev.trim());
    }



    public static void main(String[] args){
        //revstring("Sruthi");
      //  revCharArray("Sruthi");
       // sbstring("Sruthi");
       // sbstring1("Sruthi");
       // revWords("Sruthi lenka");
        revWords1("Sruthi lenka");
    }

}
