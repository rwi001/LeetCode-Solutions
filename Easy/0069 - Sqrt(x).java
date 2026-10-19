class Solution {
    public int mySqrt(int x) {
       if (x==0)
       {
        return 0;
       } 

       int strt = 1;
       int end = x;
       while(strt<=end)
       {
        int mid = (strt + end)/2; 
        if (mid == x/mid)
        {
            return mid;
        }
        else if (mid > x/mid)
        {
            end = mid-1;
        }
        else
        {
            strt = mid+1;
        }
       }
       return end;
    }
}