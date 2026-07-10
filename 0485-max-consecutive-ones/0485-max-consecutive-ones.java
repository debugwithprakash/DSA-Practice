class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxConsecutiveOnes = 0;
        int i = 0;
        int j = 0;
        while(i < n) {
            if(nums[i]==1) {
                i++;
            }
            else {
                int consecutiveOnes = i - j;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
                i++;
                j = i;
            }
        }
        int consecutiveOnes = i - j;
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
        return maxConsecutiveOnes;
    }
}