class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int requiredSum = (n * (n+1)) / 2;
        int presentSum = 0;
        for(int i = 0; i < n; i++) {
            presentSum += nums[i];
        }
        return requiredSum - presentSum;
    }
}