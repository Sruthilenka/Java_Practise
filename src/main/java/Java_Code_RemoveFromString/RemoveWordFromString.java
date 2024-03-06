package Java_Code_RemoveFromString;

public class RemoveWordFromString {

    //String 1: Hello Sruthi this side!  0/p -> Hello Sruthi side! ->Single occurance
    //String 2: Hello World Hello o/p->World --> Multiple occurances

    //Approaches
    //Using inbuild method --> replaceAll
    //without inbuild method


    public static void removeWord(String s, String word){
        String s1= s.replaceAll(word," ");
        String s2=  s1.replaceAll("\\s{3}"," ");
        System.out.println(s1);
        System.out.println(s2);
       // System.out.println(s.replaceAll(word," ").trim());
    }


    public static void removewordnoinbuilt(String s, String word){
        String[] sb = s.split(" ");
        String output = "";
        for(int i=0;i< sb.length;i++){
            if(!sb[i].equalsIgnoreCase(word))
           output = output+sb[i]+" ";
        }
        System.out.println(output);
    }

    public static void main(String[] args){
         removeWord("Hello Sruthi this side!","this");
         removeWord("Hello World Hello","Hello");
         removewordnoinbuilt("Hello World Hello","Hello");
    }










}
