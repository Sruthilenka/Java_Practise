package LeetcodePractise.SlidingWindow;

public class MaxAvgOfContArray {
    //Using Sliding Window Algorithm
    //Given an array and length of contiguous elements we need to find which contiguous elements will result in max avg.
public static double findMaxAverage(int[] arr,int k){
    //get sum of first window
    int sum =0;
    for(int i=0;i<k;i++){
        sum+=arr[i];
    }
    int maxSum = sum;
    //start sliding window
    int startIndex=0;
    int endIndex =k;
    while(endIndex<arr.length){
        sum-=arr[startIndex];
        startIndex++;

        sum+=arr[endIndex];
        endIndex++;

        maxSum = Math.max(sum,maxSum);
    }
    return (double)maxSum/k;
}
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k= 4;
        double avg = findMaxAverage(arr,k);
        System.out.println(avg);
    }
}
