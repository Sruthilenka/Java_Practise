package Java_Code_Practise;
//USe CAse:
//String : Sruthi lenka
//reverse: aknel ihturs


//Approach:
//without inbuilt method
public class StringReverseCharAt {
    public static void stringReverseCharAt(String s){
        int length = s.length();
        String rev= "";
    for(int i=length-1;i>=0;i--){
        rev=rev+s.charAt(i);
    }
        System.out.println("The reversed string is: "+rev);
    }
    public static void main(String[] args){
        stringReverseCharAt("Sruthi Lenka");
    }
}
