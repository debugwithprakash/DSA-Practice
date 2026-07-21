class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currOnes = 0;
        int maxOnes = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i]==1) {
                currOnes++;
                maxOnes = Math.max(currOnes, maxOnes);
            } else {
                currOnes = 0;
            }
        }
        return maxOnes;
    }
}