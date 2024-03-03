package testpackage;

import java.util.*;

public class pract {
    public static void main(String[] args) {
        //reverseString("hello Work!!");
        //CountOfDuplicatae();
        // maxOfArray();
        //oddUpperCase();
        // removeDuplicateFromArray();
        // removeNumFromString();
        //checkAnagram();
        //swapStrings();1`  `````````` 
        // reverseInt();
        //inputOutputPattern();
        //reverseAnArray();
        //firstNonRepeating();
        //addNumberDigits();
        //sumOfArray();
        //findDuplicatesInArray();
        //searchElementInArray();
        //bubbleSort();
        reverseAllWords();
        //letfRotate();
        moveAllZeroToEnd();

    }

    public static void reverseString(String s) {
        String[] sb = s.split(" ");
        String rev = "";
        String rev1 = "";
        char[] chr = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + chr[i];
            // rev1 = rev1+sb[i]+" ";
            //rev=rev+s.charAt(i); can use this too without s.tocharArray()

        }
        System.out.println("Final: " + rev);
        // System.out.println("Final by Word: "+ rev1.trim());
    }

    public static void CountOfDuplicatae() {
        String str = "The The hole hole in The Wall Wall";
        String[] sb = str.split(" ");
        //char[] ch = str.toCharArray();
        HashMap<String, Integer> hm = new LinkedHashMap<>();

        for (String a : sb) {
            if (hm.containsKey(a)) {
                hm.put(a, hm.get(a) + 1);
            } else {
                hm.put(a, 1);
            }
        }
        System.out.println("DUPLICATE VALUES ARE: " + hm.entrySet());

        int max = 0;
        String max_Key = "";
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            if (max < me.getValue()) {
                max = me.getValue();
                max_Key = me.getKey();
            }
        }
        System.out.println("MAX is :" + max + "->" + max_Key);
    }

    public static void maxOfArray() {
        int[] arr = {45, 87, 101, 89, 77, 89, 62};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void oddUpperCase() {
        String str = "thisisastringwithoddcountasuppercase";
        String updatedString = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 != 0) {
                updatedString = updatedString + Character.toUpperCase(ch[i]);
            } else {
                updatedString = updatedString + ch[i];
            }
        }
        System.out.println(updatedString);
    }

    public static void removeDuplicateFromArray() {
        int[] arr = {45, 66, 79, 88, 45, 66, 77, 101};

        List<Integer> ls = new ArrayList<>();
        for (int num : arr) {
            ls.add(num);
        }
        ls.stream().distinct().forEach(d -> System.out.print(d + " "));

        //Arrays.stream(Arrays.stream(arr).distinct().toArray()).forEach(d->System.out.print(d + " "));  --> one way
    }

    public static void removeNumFromString() {
        String str = "this8isa9Number9010strim7ng";
        //System.out.println(str.replaceAll("\\d", ""));
        String req = "";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (!Character.isDigit(c)) {
                req = req + c;
            }
        }
        System.out.print(req);
    }

    public static void checkAnagram() {
        String str1 = "civis";
        String str2 = "vicis";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        if (ch1.length == ch2.length) {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("String is Anagram " + str1 + str2);
            }
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static void swapStrings() {
        String str1 = "swap";
        String str2 = "done";
        String temp = "";
        int a = 10;
        int b = 20;

//            temp = str1;
//            str1 = str2;
//            str2 = temp;
//
//            System.out.println(str1 + " Should be done " + str2 + " Sould be swap --> with temp Variable");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println(str1 + " Should be done " + str2 + " Sould be swap --> without temp Variable");
    }

    public static void reverseInt() {
        int num = 6722;
        int rem = 0;

        while (num > 0) {

            rem = rem * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rem);

    }

    public static void inputOutputPattern() {
        int[] arr = {2, 33, 1, 44, 1, 5, 1, 44, 1, 5, 1, 78, 1, 77, 567};
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp[j] = arr[i];
                j++;
            } else {
                continue;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != 1) {
                temp[j] = arr[k];
                j++;
            }
        }
        for (int l : temp) {
            System.out.println(l + " ");
        }
    }

    public static void reverseAnArray(int start , int end, int[] arr) {
       // arr = new int[]{2, 33, 1, 44};
        //start = 0;
        //end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }

    public static void firstNonRepeating() {

        String input = "aacddcbbccdddeeef";
        String[] sb = input.split("");
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : sb) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        }
        for(String a: sb){
            if(hm.get(a)==1){
                    System.out.println("First Non repeating char is : "+ a);
                    break;
                }
            }
        }

        public static void addNumberDigits(){

            int num = 153;
            int sum = 0;

            while(num> 0){

                sum = sum + num%10;
                num= num/10;
            }
            System.out.println(sum);
        }

        public static void sumOfArray(){
            int [] arr = {1, 2, 33, 78, 99,00,16};
            int sum = 0;

            for(int i : arr){
                sum = sum +i;
            }
            System.out.println(sum);
        }

        public static void findDuplicatesInArray(){

            int [] arr = {6, 21,7, 7,3,1,6, 21};
            HashSet<Integer> hs = new HashSet<>();

            for(Integer i : arr){
                if(hs.add(i)==false){
                    System.out.println("Duplicate Found : " + i );
                }
            }
            System.out.println("set is -> " + hs );

        }

        public static void  searchElementInArray(){
            int [] arr = {6, 21,9, 12,3,1,6, 21};
             int sr = 21;
             boolean found = false;
             for(int i : arr){
                 if(i==sr){

                     found = true;
                 }
             }
             if(found){
                 System.out.println("element found: "+ sr);
             }else{
                 System.out.println("element not found: "+ sr);
             }
        }

            public static void bubbleSort(){
                int [] arr = {6, 21,9, 12,3,1,6, 21};
                int i,j;

                for(i=0;i<=arr.length-1; i++){
                    for(j=0; j< arr.length-1; j++){
                        if(arr[j]>arr[j+1]){
                            int temp = arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]= temp;
                        }
                    }
                }

                System.out.println(Arrays.toString(arr));
            }

            public static void reverseAllWords(){
                String str = "This is to reverse all words";
                String [] s= str.split("");
                String rev = "";
                for(int i = s.length-1; i>=0; i--){
                    rev= rev+ "" +s[i];
                }
                System.out.println(rev);


                //another code for substring
                String s1 = "Bikesh";

                s1 = s1.substring(3,6); // "esh"

                s1 = s1.substring(0,2); // "es"

                System.out.println(s1); // Output: "es"


            }

        public static void letfRotate(){
            int t = 2; // left rotate twice

        int [] arr = {1,2,3,4,5,6,7,8};  //[3, 4, 5, 6, 7, 8, 1, 2]

        reverseAnArray(0,t-1,arr);
        reverseAnArray(t, arr.length-1,arr);
        reverseAnArray(0,arr.length-1,arr);

        System.out.println("Left Rotate: "+Arrays.toString(arr));

        }

        public static void moveAllZeroToEnd(){

            int [] arr ={19,0,7,0,12,0,0,0,11,45,3,78,0,3,0,112};
                int j = 0;

            int [] temp = new int[arr.length];

                for(int i=0;i<arr.length;i++) {
                    if (arr[i] != 0) {
                        temp[j] = arr[i];
                        j++;
                    }
                }
            System.out.println(Arrays.toString(temp));
        }
    }
