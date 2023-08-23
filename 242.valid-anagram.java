/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
     }
}
// @lc code=end

