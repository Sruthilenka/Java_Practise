package LeetcodePractise;

public class ArraysInsertion {
    public static void insertArray(int arr[],int element,int position){
        int[] temparr = new int[arr.length+1];
        if(position<0||position>arr.length){
            System.out.println("invalid position");
        }
        for(int i=0;i<position;i++){
            temparr[i]=arr[i];
        }
        temparr[position] = element;

        for(int i=position;i< arr.length;i++){
            temparr[i+1] = arr[i];
        }

        for(int i=0;i< temparr.length;i++)
        System.out.println(temparr[i]);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int element = 7;
        int position = 4;
        insertArray(arr,element,position);
    }
}
