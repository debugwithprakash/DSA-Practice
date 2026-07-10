class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxConsecutiveOnes = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i]==1) {
                count++;
            }
            else {
                count = 0;
            }
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
        }
        return maxConsecutiveOnes;
    }
}