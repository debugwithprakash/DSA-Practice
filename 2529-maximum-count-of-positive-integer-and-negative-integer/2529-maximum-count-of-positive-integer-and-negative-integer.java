class Solution 
{
    public int maximumCount(int[] nums) 
    {
        int st = 0, end = nums.length-1;
        int neg = 0, pos = 0;
        while(st <= end)
        {
            int mid = st+(end-st)/2;
            if(nums[mid]<0) st = mid+1;
            else end = mid-1;
        }
        neg = st;

        st = 0;
        end = nums.length-1;
        while(st <= end)
        {
            int mid = st+(end-st)/2;
            if(nums[mid]<1) st = mid+1;
            else end = mid-1;
        }
        pos = nums.length-st;

        return Math.max(neg, pos);
    }
}