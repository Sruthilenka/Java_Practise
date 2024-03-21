package Practise1;

public class RemoveFromString {


    //Method 1
    public static void removeNum(String s){
        char[] ch= s.toCharArray();
        String rev = "";
        for(int i=0;i<=ch.length-1;i++){
            if(Character.isAlphabetic(ch[i])){
                rev = rev+ch[i];
            }
        }
        System.out.println(rev);
    }


    //Method 2 - Inbuilt replaceAll Method
    public static void repNum(String s){
        s= s.replaceAll("\\d","");
        //To remove space similarly
        s=s.replaceAll("\\s","");
        System.out.println(s);
    }


    //Remove Word from String
    public static void remWord(String s,String word){
        String[] srr = s.split(" ");
        String snew="";
        for(int i=0;i<srr.length;i++){
            if(!srr[i].equalsIgnoreCase(word))
              snew=snew + srr[i]+" ";
        }
        System.out.println(snew);
    }


    //Remove Word from String-using ReplaceAll()
    public static void repStr(String s,String word){
        s=s.replaceAll(word,"");
        System.out.println(s);
    }

    public static void main(String[] args){
       // removeNum("sr4566hfjf");
      //  repNum("Sgdhj65 783cfvd");
       // remWord("Sruthi is a good girl","good");
        repStr("Sruthi is a good girl","good");
    }
}
