class Solution {
    public boolean isPossibleStall(int[] position, int mid, int k) {
        int n = position.length;
        int noOfBalls = 1;
        int prevBall = position[0];
        for(int i = 1; i < n; i++) {
            int dist = position[i] - prevBall;
            if(dist >= mid) {
                noOfBalls++;
                prevBall = position[i];
            }
        }
        return (noOfBalls >= k) ? true : false;
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        
        Arrays.sort(position);
        
        int left = 1;
        int right = position[n-1]-position[0];
        while(left <= right) {
            
            int mid = left+(right-left)/2;
            
            if(isPossibleStall(position, mid, m)) {
                // go right to find max of min
                left = mid+1;
            } else {
                // go left
                right = mid-1;
            }
        }
        
        return right;
    }
}