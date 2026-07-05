class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0, right = 0, maxLength = 0;
        long currSum = 0;
        while(right < nums.length) {
            currSum += nums[right];
            while((long)nums[right]*(right-left+1) > k+currSum) {
                currSum -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, (right-left+1));
            right++;
        }

        return maxLength;
    }
}