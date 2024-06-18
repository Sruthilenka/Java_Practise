package LeetcodePractise.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

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



//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.  -->Refer LongSS
public class LongestSubString {
    public static int lengthOfSubString(String s){
        Map<Character,Integer> map1 = new HashMap<>();
        int maxLength =0;
        int left =0;
        for(int right=0;right<s.length();right++){
            char currentChar = s.charAt(right);
            if (map1.containsKey(currentChar)) {
                left++;
            }else{
                map1.put(currentChar,right);
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
           return maxLength;
        }
    public static void main(String[] args) {
        String s= "pwwkew";
        int len = lengthOfSubString(s);
        System.out.println(len);

    }
}
