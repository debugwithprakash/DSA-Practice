class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // Step-1: finding break Idx
        int breakIdx = -1;
        for(int i = n-2; i >= 0; i--) {
            if(nums[i]<nums[i+1]) {
                breakIdx = i;
                break;
            }
        }
        if(breakIdx == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        // Step-2: finding slightly greater Idx and swapping
        for(int i = n-1; i >= breakIdx; i--) {
            if(nums[i]>nums[breakIdx]) {
                int temp = nums[i];
                nums[i] = nums[breakIdx];
                nums[breakIdx] = temp;
                break;
            }
        }
        // Step-3: reverse breakIdx+1 to n-1
        reverse(nums, breakIdx+1, n-1);
    }
    public void reverse(int[] nums, int a, int b) {
        while(a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}