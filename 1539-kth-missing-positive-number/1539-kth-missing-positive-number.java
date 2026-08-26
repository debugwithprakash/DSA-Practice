class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        // find range
        int left = 0;
        int right = n-1;
        while(left<=right) {
            int mid = left+(right-left)/2;

            if( (arr[mid]-(mid+1)) < k ) {
                // go right
                left = mid+1;
            } else {
                // go left
                right = mid-1;
            }
        }
        return left+k;
    }
}