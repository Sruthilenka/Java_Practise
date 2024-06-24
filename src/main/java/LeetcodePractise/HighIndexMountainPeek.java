package LeetcodePractise;

public class HighIndexMountainPeek {

    //linear search -- time complexity is O(n)
    public static int peekIndexInMountainPeek(int[] arr){
        int i=0;
        while(arr[i] < arr[i+1]){
            i++;
        }
        return arr[i];
    }

    //binary Search -- time complexity is O(log n)
    public static int binPeakGetter(int[] arr){
        int low=0;int high= arr.length-1;
        while(low<high){
            int mid = low+ (high-low) /2;
            if(arr[mid] < arr[mid+1]){
                low=mid+1;
            }else{
                high = mid;
            }
        }
        return arr[high];
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int lin_num = peekIndexInMountainPeek(arr);
        System.out.println(lin_num);

        int bin_num =binPeakGetter(arr);
        System.out.println(bin_num);
    }
}
