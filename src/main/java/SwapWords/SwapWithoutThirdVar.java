package SwapWords;

public class SwapWithoutThirdVar {
    public static void swap(String s1,String s2){


        System.out.println(s1);
        System.out.println(s2);
        s1=s1+s2; //SruthiSripathy
        s2=s1.substring(0,(s1.length()-s2.length()));

        s1=s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);

        /*   // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;*/
    }

    public static void main(String[] args){
        swap("Sruthi","Sripathy");
    }
}
