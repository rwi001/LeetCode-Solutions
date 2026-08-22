class Solution {
    public boolean checkDivisibility(int num) {
        int n=num;
        int sum=0;
        int mult=1;
        
        while(num!=0)
        {
            int x=num%10;
            sum=sum+x;
            mult = mult*x;
            num/=10;
        }
        
       
    return n%(sum+mult)==0;
    }
}