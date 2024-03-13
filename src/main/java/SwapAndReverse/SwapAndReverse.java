package SwapAndReverse;

public class SwapAndReverse {
    // i/p -> Sruthi this is world! -> o/p-> World! siht si Sruthi

    public static void srev(String s) {
        String rev = "";
        String s1 = " ";

        String[] splitS = s.split(" ");
        for (int i = splitS.length - 1; i >= 0; i--) {
            if (i == 0 || i == splitS.length - 1) {
                rev = rev + splitS[i]+" ";
            } else {
                rev = rev + reverseString(splitS[i] + " ")+" ";
            }

        }
        System.out.println(rev);
    }


    private static String reverseString(String s) {
        String rev = " ";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev.trim();
    }

    public static void main(String[] args) {
        srev("Sruthi this is world!");

    }

}
