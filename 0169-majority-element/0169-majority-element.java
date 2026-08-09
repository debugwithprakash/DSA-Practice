class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;
        for(int ele : nums) {
            if(freq == 0) {
                ans = ele;
            }
            if(ele == ans) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
}