class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n) {
            if(nums[i]==i+1) {
                i++;
            } else {
                int correctIdx = nums[i]-1;

                //Check duplicate
                if(nums[i]==nums[correctIdx]) {
                    return nums[i];
                }

                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
        }
        return -1;
    }
}