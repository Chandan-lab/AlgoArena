/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int len =0;
        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i) !=' ' ){ 
                len++;
        }else{
            if (len>0) return len; // we got the last word and we are done as per the question.
        }
        }
        return len;
    }
}
// @lc code=end

