class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0, right = 0;
        long prefixSum = 0;
        int maxLength = 0;
        while(right < n) {
            prefixSum += nums[right];
            while((long)nums[right]*(right-left+1) > k+prefixSum) {
                prefixSum -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, (right-left+1));
            right++;
        }
        return maxLength;
    }
}