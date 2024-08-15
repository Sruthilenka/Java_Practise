package LeetcodePractise;

import LeetcodePractise.SlidingWindow.LongestSubString;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongSS {
    //Input: s = "pwwkew"
    //Output: 3
    //Explanation: The answer is "wke", with the length of 3.
    //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    public static void lengthOflongestSubString(String s){
        String longestSubString = null;
        int longestSubStringlen =0;
        Map<Character,Integer> map1 = new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!map1.containsKey(ch[i])){
                map1.put(ch[i],i);
            }else{
               // map1.put(ch[i],1);
                map1.clear();
            }
            if(map1.size()>longestSubStringlen){
                longestSubStringlen = map1.size();
                longestSubString = map1.keySet().toString();
            }
        }
        System.out.println(longestSubString);
        System.out.println(longestSubStringlen);
    }

    public static void main(String[] args) {
        String s= "pwwkew";
        lengthOflongestSubString(s);

    }
}
