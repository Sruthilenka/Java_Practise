package Java_Code_ReverseString;

public class LeftArrayrotation {
    public static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftArrayRotation(int[] arr1, int t, int n) {  //t--> no of times it has to be rotated,n->no of elements +1
        reverse(arr1, 0, t - 1); // first reverse 1st 2 numbers
        reverse(arr1, t, n - 1);  //then reverse the remaining set of numbers(from 3 to end)
        reverse(arr1, 0, n - 1);//now reverse entire array of numbers
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }

    public static void main(String[] args) {
        leftArrayRotation(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 8);
    }
}
