package LeetcodePractise;

public class BitWiseOperators {
    public static int addBits(int a, int b) {
        while (b != 0) { //repeat until the carry ==0 and we use b to hold the carry
            int carry = (a & b) << 1;
            a = a ^ b;
            b= carry;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int sum = addBits(a, b);
        System.out.println(sum);
    }
}
