package Java_Code_ReverseString;

public class ShiftToPositonDup {

    public static void shift(int[] arr){
        int j;
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            j=arr[i]-1;
            temp[j]=arr[i];
        }
        for(int k=0;k< arr.length;k++){
            System.out.print(temp[k]);
        }
    }




    public static void main(String[] args){
        shift(new int[]{9, 3, 4, 2, 6, 1, 8, 5, 3, 7});
    }
}
