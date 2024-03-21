package SubStrings;

public class SubstringsFromAWord {

    public static void subsetString(String s) {
        int n = s.length();
        String[] arr = new String[(n * (n + 1) / 2)];
        int temp = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                String p = s.substring(i, j + 1);
                arr[temp] = p;
                temp++;
            }
        }
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }
    }


    public static void main(String[] args){

        subsetString("Sruthi");
    }
}
