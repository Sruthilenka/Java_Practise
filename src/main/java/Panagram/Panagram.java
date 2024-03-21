package Panagram;



public class Panagram {
    public static void panagramCheck(String s){
        s=s.toLowerCase();
        Boolean b = true;
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(String.valueOf(ch))){
               b= false;
               break;
            }
        }
        if(b==false){
            System.out.println("Not panagram");
        }else{
            System.out.println("Panagram");
        }
    }




    public static void main(String[] args){
panagramCheck("abcdefghijklmnopqrstuvwxyZ"); //ALL LETTERS SHOULD BE IN SMALL LETTERS FOR PANAGRAMS
    }
}
