class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = -1;

        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                k = i;
                break;
            }
        }
        // Edge case
        if(k == -1) {
            int a = 0;
            int b = n-1;
            while(a < b) {
                swap(nums, a, b);
                a++;
                b--;
            }
            return;
        }

        for(int i = n-1; i > k; i--) {
            if(nums[i] > nums[k]) {
                swap(nums, k, i);
                break;
            }
        }

        int a = k+1;
        int b = n-1;
        while(a < b) {
            swap(nums, a, b);
            a++;
            b--;
        }
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}