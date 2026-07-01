class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0, j = 0;
        while(i < n) {
            if(j < n && nums[i] == nums[j]) j++;
            else {
                int count = j - i;
                if(count > n/2) return nums[i];
                i = j;
            }
        }
        return -1;
    }
}