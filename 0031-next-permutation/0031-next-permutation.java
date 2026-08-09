class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // Finding first Small Idx
        int smallIdx = -1;
        for(int i = n-1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                smallIdx = i-1;
                break;
            }
        }
        // checking Edge cases
        if(smallIdx == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        // finding slightly greater ele and swaping 
        for(int i = n-1; i >= smallIdx; i--) {
            if(nums[i] > nums[smallIdx]) {
                int temp = nums[smallIdx];
                nums[smallIdx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        //reversing smallIdx+1 to n-1
        reverse(nums, smallIdx+1, n-1);
    }
    public void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}