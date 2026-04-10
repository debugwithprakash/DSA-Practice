class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int idx = 0;
        while(idx < n) {
            int rightIdx = nums[idx]-1;
            if(nums[idx]==idx+1 || nums[idx]<1 || nums[idx]>n || nums[idx]==nums[rightIdx]) idx++;
            else swap(nums, idx, rightIdx);
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}