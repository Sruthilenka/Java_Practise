package SwapWords;

public class SwapUsingThirdVar {
    public static void swap1(String s1,String s2){
        String temp;
        System.out.println(s1);
        System.out.println(s2);
        temp=s1;
        s1=s2;
        s2=temp;
        System.out.println(s1);
        System.out.println(s2);
    }
    public static void main(String[] args) {
        swap1("Sruthi","Lenka");
    }
}
