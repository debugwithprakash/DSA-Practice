class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int i = -1;
        int j = 0;
        int currSum = 0;
        int maxSum = nums[0];
        while(j < n) {
            // step-1
            currSum += nums[j];
            // step-2
            maxSum = Math.max(maxSum, currSum);
            // step-3
            if(currSum < 0) currSum = 0;
            j++;
        }

        return maxSum;
    }
}