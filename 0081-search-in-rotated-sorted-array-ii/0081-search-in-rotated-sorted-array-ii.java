class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left <= right) {
            int mid = left+(right-left)/2;
            // if target found
            if(nums[mid] == target) {
                return true;
            }
            if(nums[left]==nums[mid] && nums[mid]==nums[right]) {
                left++;
                right--;
            }
            // if left half is sorted
            else if(nums[left] <= nums[mid]) {
                // if target Exists in left half
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } 
            // if right half is sorted
            else {
                // if target Exists in right half
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return false;
    }
}