package Practise1;

public class SwapExtremesReverseMiddles {

    public static void swap1(String s){
        String[] arr = s.split(" ");
        String rev="";
        for(int i=arr.length-1;i>=0;i--){
            if(i==0 || i== arr.length-1){
              rev=rev+arr[i]+" ";
            }
            else{
                StringBuffer sb= new StringBuffer(arr[i]);
                sb.reverse();
                rev=rev+sb.toString()+" ";
            }
        }
        System.out.println(rev);
    }


    public static void main(String[] args){
       swap1("Hello Sruthi This is my world") ;
    }
}
