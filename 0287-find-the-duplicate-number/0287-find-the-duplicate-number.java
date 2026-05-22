class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n) {
            if(nums[i] == i+1) i++;
            else {
                int rightIdx = nums[i]-1;
                if(nums[i]==nums[rightIdx]) i++;
                else {
                    int temp = nums[i];
                    nums[i] = nums[rightIdx];
                    nums[rightIdx] = temp;
                }
            }
        }

        for(int j = 0; j < n; j++) {
            if(nums[j] != j+1) return nums[j];
        }

        return -1;
    }
}