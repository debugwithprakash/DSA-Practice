class Solution {
    public boolean possibleBouquet(int[] bloomDay, int mid, int m, int k) {
        int count = 0;
        int totalPossibleBloomDays = 0;
        for(int ele : bloomDay) {
            if(ele <= mid) {
                count++;
            } else {
                totalPossibleBloomDays += count/k;
                count = 0;
            }
        }
        totalPossibleBloomDays += count/k;
        return (totalPossibleBloomDays >= m);
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        // Edge Case
        if((long)m*(long)k > n) return -1;

        // find range
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele : bloomDay) {
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        // Binary Search
        while(min<=max) {
            int mid = min+(max-min)/2;

            if(possibleBouquet(bloomDay, mid, m, k)) {
                // go left to find min
                max = mid-1;
            } else {
                min = mid+1;
            }
        }
        return min;
    }
}