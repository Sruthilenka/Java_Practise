package LeetcodePractise;
import java.util.Arrays;

public class DuplicateCheckArray {
    public static void dupCheck(int arr[]){
        Arrays.sort(arr);
        Boolean hasDuplicates = false;
        for(int i=0;i< arr.length-1;i++){ // To avoid array index out of bounds
            if(arr[i]==arr[i+1]){
                hasDuplicates=true;
                break;
            }
        }
        if(hasDuplicates){
            System.out.println("Array has duplicates");
        }else{
            System.out.println("Array is distinct");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        dupCheck(arr1);
    }
}
