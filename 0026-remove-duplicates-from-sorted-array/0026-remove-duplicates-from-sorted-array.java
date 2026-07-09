class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 1;
        int i = 0;
        for(int j = 0; j < n; j++) {
            if(nums[i] != nums[j]) nums[++i] = nums[j];
        }
        return i+1;
    }
}