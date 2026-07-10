class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xOR1 = 0;
        int xOR2 = 0;
        for(int i = 0; i < n; i++) {
            xOR1 = xOR1 ^ nums[i];
            xOR2 = xOR2 ^ (i+1);
        }
        return xOR1 ^ xOR2;
    }
}