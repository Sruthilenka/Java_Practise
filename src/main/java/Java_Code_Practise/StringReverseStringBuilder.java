package Java_Code_Practise;

public class StringReverseStringBuilder {
    public static void stringReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbrev = sb.reverse();
        System.out.println(sbrev);

        //using append method:
        StringBuilder sb1 = new StringBuilder(); // Dont pass the s here
        String rev = sb1.append(s).reverse().toString();
        System.out.println(rev);

    }

    public static void main(String[] args) {
        stringReverse("Sruthi lenka");
    }
}
