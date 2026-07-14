class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rotate(nums, 0, n-k-1);
        rotate(nums, n-k, n-1);
        rotate(nums, 0, n-1);
    }
    public void rotate(int[] nums, int a, int b) {
        int n = nums.length;
        int i = a, j = b;
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}