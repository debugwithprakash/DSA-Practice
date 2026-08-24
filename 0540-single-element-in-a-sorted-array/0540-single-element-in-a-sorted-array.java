class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left <= right) {
            int mid = left+(right-left)/2;

            if(left==right || nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

            int leftMid = mid;
            int rightMid = mid;
            if(nums[mid]==nums[mid-1]) leftMid = mid-1;
            else rightMid = mid+1;

            if((leftMid-left) % 2 != 0) {
                // go left
                right = leftMid-1;
            } else {
                // go right
                left = rightMid+1;
            }
        }
        return -1;
    }
}