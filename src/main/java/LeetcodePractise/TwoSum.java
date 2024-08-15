package LeetcodePractise;


import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void twoSumIndeces(int[] arr,int target){
        Map<Integer,Integer>  map1 = new HashMap<>();
    /*  for(int i:arr){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i=0;i<arr.length;i++) {
            int difference = target- arr[i];
            if(map1.containsKey(difference)){
                System.out.println(map1.get(difference)+" "+i);
                break;
            }
        }*/
      for(int i=0;i<arr.length;i++){
            int difference = target - arr[i];
            if (map1.containsKey(difference)) {
                System.out.println(map1.get(difference) + " " + i); // to print indexes
                System.out.println(arr[map1.get(difference)]+" "+arr[i]); //to print the numbers
               return; //if we give break here then definitely last statement would be executed.
            }
             map1.put(arr[i],i);
        }
        System.out.println("No valid pairs found");
        }



    public static void main(String[] args){
        int[] arr1 = {1,7,2,15};
        int target = 9;
        twoSumIndeces(arr1,target);
    }
}
