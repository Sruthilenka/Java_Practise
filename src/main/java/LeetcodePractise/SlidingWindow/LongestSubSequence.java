package LeetcodePractise.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubSequence {

    //kindly recheck the code

    //Example 1:
    //
    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3.
    //Example 2:
    //
    //Input: s = "bbbbb"
    //Output: 1
    //Explanation: The answer is "b", with the length of 1.

    public static int lengthOfSubSequence(String s){
        Map<Character,Integer> map1 = new HashMap<>();
        char[] ch = s.toCharArray();
      //  int startIndex = 0;
        int LastIndex = 0;
        int length = ch.length;
        int subLength =0;
        while(LastIndex< length){
            if(map1.containsKey(ch[LastIndex])){
                LastIndex++;
            }else{
                map1.put(ch[LastIndex],1);
                LastIndex++;
                subLength++;
            }
        }
        return subLength;
    }

    public static void main(String[] args) {
        String s= "pwwkew";
        int len = lengthOfSubSequence(s);
        System.out.println(len);

    }
}
