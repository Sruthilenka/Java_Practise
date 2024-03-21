package Practise1;

public class SubStringsofAString {
    public static void substringOfString(String s) {
        int n = s.length();
        String[] arr = new String[n * (n + 1) / 2];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String s1 = s.substring(i, j + 1);
                arr[temp] = s1;
                temp++;
            }
        }
        for (int k = 0; k < arr.length; k++) {

            System.out.println(arr[k]);
        }
    }


    public static void main(String[] args) {
     substringOfString("Sruthi");
    }
}
