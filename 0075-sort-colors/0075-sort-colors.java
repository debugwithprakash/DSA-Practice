class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m <= h) {
            if(nums[m] == 2) {
                swap(nums, m, h);
                h--;
            } else if(nums[m] == 0) {
                swap(nums, l, m);
                l++;
                m++;
            } else {
                m++;
            }
        }
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}