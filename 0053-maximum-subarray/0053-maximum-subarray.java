class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++) {
            // Step-1
            currSum += nums[i];
            // Step-2
            maxSum = Math.max(maxSum, currSum);
            // Step-3
            if(currSum < 0) currSum = 0;
        }

        return maxSum;
    }
}