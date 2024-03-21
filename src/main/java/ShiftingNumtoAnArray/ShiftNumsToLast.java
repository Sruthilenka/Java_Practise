package ShiftingNumtoAnArray;

public class ShiftNumsToLast {

    public static void shiftNums(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                temp[j] = arr[k];
                j++;
            }
        }
        for (int s = 0; s < arr.length; s++) {
            System.out.print(temp[s]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,0, 2,0, 3, 1,0, 1, 5, 6};
        shiftNums(arr1);
    }
}
