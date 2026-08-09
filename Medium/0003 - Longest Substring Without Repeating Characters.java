class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndexMap = new int[128]; 
        
        int left = 0;
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            left = Math.max(left, charIndexMap[c]);
            max_len = Math.max(max_len, i - left + 1);
            charIndexMap[c] = i + 1;
        }

        return max_len;
    }
}