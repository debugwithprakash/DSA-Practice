class Solution 
{
    public int maximumCount(int[] nums) 
    {
        int st = 0;
        int end = nums.length-1;
        int negEle = 0, posEle = 0;
        while(st <= end)
        {
            int mid = st+(end-st);
            if(nums[mid] < 0) st = mid+1;
            else end = mid-1;
        }
        negEle = st;
        st = 0;
        end = nums.length-1;
        while(st <= end)
        {
            int mid = st+(end-st);
            if(nums[mid] < 1) st = mid+1;
            else end = mid-1;
        }
        posEle = nums.length-st;
        return Math.max(negEle, posEle);
    }
}