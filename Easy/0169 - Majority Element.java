class Solution {
    public int majorityElement(int[] nums) {
        int x = 0;
        int count=0;
       for(int num:nums)
       {
        if(count==0)
        {
            x=num;
        }
        int c = (num==x)?1:-1; 
        count = count+c;
       }
       return x;
    }
}