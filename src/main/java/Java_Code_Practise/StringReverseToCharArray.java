package Java_Code_Practise;

//USe CAse:
//String : Sruthi lenka
//reverse: aknel ihturs


//Approach:
//without inbuilt method
public class StringReverseToCharArray {

    public static void reverseString1(String s)
    {
        String rev="";
        char[] ch = s.toCharArray();
        int len = s.length();
        for(int i= len-1;i>=0; i--){
            rev= rev+ch[i];
        }
        System.out.println("The reversed string is:"+rev);
    }


        public static void main(String[] args){
    reverseString1("Sruthi Lenka");
        }
    }

