/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc lets Solve using hash table 

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap <Character, Integer> s1= new HashMap<>();
      HashMap <Character, Integer> t1= new HashMap<>();

      if (s.length()!=t.length()) return false;

      for(int i=0; i<s.length(); i++){
          char ch= s.charAt(i);
          s1.put(ch,s1.getOrDefault(ch, 0)+1);
      }

      for(int j=0; j<t.length(); j++){
          char ch2=t.charAt(j);
          t1.put(ch2,t1.getOrDefault(ch2,0) +1);
      }
            return s1.equals(t1);
     
     }
}
// @lc code=end

