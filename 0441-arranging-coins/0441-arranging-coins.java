class Solution 
{
    public int arrangeCoins(int n) 
    {
        long st = 1;
        long end = n;
        long ans = 1;
        while(st <= end)
        {
            long k = st+(end-st)/2;
            long noOfCoins = k*(k+1)/2;
            if(noOfCoins == n) return (int)k;
            else if(noOfCoins > n) end = k-1;
            else 
            {
                ans = k;
                st = k+1;
            }
        }
        return (int)ans;
    }
}