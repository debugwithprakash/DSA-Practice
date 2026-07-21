class Solution {
    public void sortColors(int[] nums) {
        int noOfZeros = 0;
        int noOfOnes = 0;
        int noOfTwos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==0) noOfZeros++;
            else if(nums[i]==1) noOfOnes++;
            else noOfTwos++;
        }
        int Idx = 0;
        for(int i = 0; i < noOfZeros; i++) {
            nums[Idx++] = 0;
        }
        for(int i = 0; i < noOfOnes; i++) {
            nums[Idx++] = 1;
        }
        for(int i = 0; i < noOfTwos; i++) {
            nums[Idx++] = 2;
        }
    }
}