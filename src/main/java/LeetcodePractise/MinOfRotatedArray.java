package LeetcodePractise;

public class MinOfRotatedArray {
    //use binary search
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {  //until low and high points to same element
            int mid = low + (high - low) / 2; //to avoid int overflow have to add high-low not directly high
            if (nums[mid] > nums[high]) { //i.e, the issue is in the second part of the array.
                low = mid + 1; // we left the first part and started considering the second part of the array
            } else {
                high=mid;//when the issue is in first part to leave the second part make high point to mid.
            }
        }
        return nums[high];
    }

    //To find the max just interchange the statements in if else blocks just considering different parts of arrays to that of in this situation.
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int high = findMin(arr);
        System.out.println(high);
    }
}
