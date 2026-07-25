class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pveIdx = 0;
        int negIdx = 1;
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                result[pveIdx] = nums[i];
                pveIdx += 2;
            } else {
                result[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        return result;
    }
}