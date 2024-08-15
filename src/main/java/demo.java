public class demo {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int k= 10;
        int element = 5;
        int index=0;

        //get the index of the given element
       for(int i=0;i<arr.length;i++){
           if(arr[i]==element){
               index = i;
               System.out.println(index);
           }
       }

        System.out.println("*******************");
       for(int j=1;j<=k;j++){
           index++;
           if(index== arr.length){
               index=0;
           }

       }
        System.out.println(index);
    }
}
