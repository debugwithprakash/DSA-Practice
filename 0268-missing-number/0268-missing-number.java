class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i || nums[i] == n) i++;
            else {
                int idx = nums[i];
                swap(nums, i ,idx);
            }
        }
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j) return j;
        }
        return n;
    }
    void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}