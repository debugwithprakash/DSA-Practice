class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSubArraySum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            // step-1
            currSum += nums[i];
            // step-2
            maxSubArraySum = Math.max(maxSubArraySum, currSum);
            // step-3
            if(currSum < 0) currSum = 0;
        }
        return maxSubArraySum;
    }
}