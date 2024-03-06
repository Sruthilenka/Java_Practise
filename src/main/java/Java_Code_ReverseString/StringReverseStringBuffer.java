package Java_Code_ReverseString;

public class StringReverseStringBuffer {
    public static void stringReverse(String s){
        StringBuffer sb=new StringBuffer(s);
        StringBuffer rev = sb.reverse();
        System.out.println(rev); // can directly print it or convert it to string and then print

        String strev= rev.toString();
        System.out.println(strev);
    }
    public static void main(String[] args)
    {
       stringReverse("Sruthi Lenka");
    }
}
