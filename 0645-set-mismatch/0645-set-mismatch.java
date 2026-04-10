class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int idx = 0;
        while(idx < nums.length) {
            int rightIdx = nums[idx]-1;
            if(nums[idx] == idx+1 || nums[idx] == nums[rightIdx]) idx++;
            else swap(nums, idx, rightIdx);
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                ans[0] = nums[i];
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}