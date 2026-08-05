class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        Queue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            q.offer(nums[i]);
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = q.poll();
        }

        int maxLength = 1;
        int i = 0;
        int j = 1;
        while(j < n) {
            if(ans[j] == ans[j-1]) {
                i++;
                j++;
            } else if(ans[j] == ans[j-1]+1) {
                j++;
            } else {
                int currLength = j-i;
                maxLength = Math.max(maxLength, currLength);
                i = j;
                j++;
            }
        }
        int currLength = j-i;
        maxLength = Math.max(maxLength, currLength);
        i = j;

        return maxLength;
    }
}