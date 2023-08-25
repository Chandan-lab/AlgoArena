/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
       int count = 0;
       // is string is empty return true
       if (count == s.length()) return true;
        // init 2 pointers 
      int i = 0;
      int j = 0;
      while(i<s.length() && j<t.length()){
          if (s.charAt(i) == t.charAt(j)){
              i++;
          }
          j++;
      }
        return (i==s.length());
    }
}
// @lc code=end

// j moves ahead whether character matches or not whereass i moves as soon as character match happens 