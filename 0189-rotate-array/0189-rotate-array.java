class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int i = 0;
        int j = n-k-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }

        i = n-k;
        j = n-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }

        i = 0;
        j = n-1;
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}