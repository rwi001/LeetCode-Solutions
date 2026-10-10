class Solution {
    public int maxAbsoluteSum(int[] nums) 
    {
        int s = 0, min = 0, max = 0;
        for (int num: nums) {
            s += num;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        return max - min;   
    }
}