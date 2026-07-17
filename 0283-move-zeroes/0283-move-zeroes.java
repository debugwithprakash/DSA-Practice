class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int idx = 0, count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i]==0) count++;
            else {
                nums[idx] = nums[i];
                idx++;
            }
        }
        for(int i = 0; i < count; i++) {
            nums[idx] = 0;
            idx++;
        }
    }
}