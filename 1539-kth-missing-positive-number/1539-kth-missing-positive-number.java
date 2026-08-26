class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int ans = k;
        for(int ele : arr) {
            if(ele <= ans) {
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }
}