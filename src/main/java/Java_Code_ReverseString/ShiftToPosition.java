package Java_Code_ReverseString;

public class ShiftToPosition {
    public static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void shiftPos(int[] arr1) {
        int max = max(arr1);
        int[] temp = new int[max];
        int j;
        for (int i = 0; i < arr1.length; i++) {
            j = arr1[i] - 1;
            temp[j] = arr1[i];
        }
        for (int k = 0; k < temp.length; k++) {
            System.out.print(temp[k]);
        }
    }


    public static void main(String[] args) {
        shiftPos(new int[]{9, 3, 4, 2, 6, 1, 8, 5, 3, 7});
    }
}
