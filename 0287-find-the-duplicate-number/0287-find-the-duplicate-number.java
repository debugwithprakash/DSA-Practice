class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i+1) i++;
            else {
                int idx = nums[i]-1;
                if(nums[i] == nums[idx]) return nums[i];
                swap(nums, i, idx);
            }
        }
        return -1;
    }
    public void swap(int[] nums, int i, int idx) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}