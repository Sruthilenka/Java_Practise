package Java_Code_ReverseString;

public class ReverseTillPosition {
    //i/p->{1,2,3,4,5,6,7,8,9} Start-0,End-3 Output -->{4,3,2,1,5,6,7,8,9}

public static void revpos(int[] arr, int start,int end){

    int temp;
    while(start<end){
     temp=arr[start];
     arr[start]=arr[end];
     arr[end]=temp;
     start++;
     end--;
    }
    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }
}




    public static void main(String[] args){
     revpos(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},1,7);
    }
}
