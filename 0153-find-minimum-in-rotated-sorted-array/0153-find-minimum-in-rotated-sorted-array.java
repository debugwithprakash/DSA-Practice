class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int minEle = nums[0];
        int left = 0;
        int right = n-1;
        while(left <= right) {
            int mid = left+(right-left)/2;
            minEle = Math.min(minEle, nums[mid]);
            if(nums[left] <= nums[mid]) {
                if(nums[left] < minEle) {
                    // go left
                    right = mid-1;
                } else {
                    // go right 
                    left = mid+1;
                }
            }
            else {
                if(nums[mid+1] < minEle) {
                    // go right
                    left = mid+1;
                } else {
                    // go left 
                    right = mid-1;
                }
            }
        }
        return minEle;
    }
}