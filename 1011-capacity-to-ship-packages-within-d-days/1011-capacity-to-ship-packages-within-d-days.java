class Solution {
    public int findTotalDays(int[] weights, int mid) {
        int sum = 0;
        int totalDays = 1;
        for(int weight : weights) {
            if(sum+weight > mid) {
            totalDays++;
                sum = 0;
            }
            sum += weight;
        }
        return totalDays;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        // find maxCapacity and minCapacity
        int maxCapacity = 0;
        int minCapacity = weights[0];
        for(int weight : weights) {
            maxCapacity += weight;
            minCapacity = Math.max(minCapacity, weight);
        }
        // Binary Search Algo
        int left = minCapacity;
        int right = maxCapacity;
        while(left<=right) {
            int mid = left+(right-left)/2;
            
            int totalDays = findTotalDays(weights, mid);

            if(totalDays <= days) {
                // go left
                right = mid-1;
            } else {
                // go right
                left = mid+1;
            }
        }
        return left;
    }
}