package SortedArrayRemoveDup;

public class SortedArrayRemoveDup {
    public static void removeDup(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int k=0;k<temp.length;k++)
        System.out.println(temp[k]);


    }
    public static void main(String[] args) {
removeDup(new int[]{10,10,20,30,30,40,50,60,60},9);
    }
}
