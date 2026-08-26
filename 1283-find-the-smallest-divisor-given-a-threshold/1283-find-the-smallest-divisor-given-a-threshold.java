class Solution {
    public int findSum(int[] nums, int k) {
        int sum = 0;
        for(int ele : nums) sum += Math.ceil((double)ele/(double)k);
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        // Find max
        int max = Integer.MIN_VALUE;
        for(int ele : nums) {
            max = Math.max(max, ele);
        }
        // Apply Binary Search
        int left = 1;
        int right = max;
        while(left <= right) {
            int mid = left+(right-left)/2;

            int sum = findSum(nums, mid);
            if(sum <= threshold) {
                // go left to find min divisor
                right = mid-1;
            } else {
                // go right
                left = mid+1;
            }
        }
        return left;
    }
}