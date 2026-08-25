class Solution {
    public int findTime(int[] piles, int k) {
        int totalTime = 0;
        for(int ele : piles) {
            totalTime += Math.ceil((double)ele/(double)k);
        }
        return totalTime;
    }
    public int findRange(int[] piles) {
        int max = Integer.MIN_VALUE;
        for(int ele : piles) max = Math.max(max, ele);
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findRange(piles);
        while(left<=right) {
            int mid = left+(right-left)/2;

            int time = findTime(piles, mid);

            if(time <= h) {
                // go left to find min time 
                right = mid-1;
            } else {
                // go right
                left = mid+1;
            }
        }
        return left;
    }
}