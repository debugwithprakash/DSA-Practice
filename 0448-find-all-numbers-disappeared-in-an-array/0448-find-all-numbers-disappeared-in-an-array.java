class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        while(idx < nums.length) {
            int rightIdx = nums[idx]-1;
            if(nums[idx] == idx+1 || nums[idx] == nums[rightIdx]) idx++;
            else swap(nums, idx, rightIdx);
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) ans.add(i+1);
        }
        return ans;
    }
    public void swap(int[] nums, int idx, int rightIdx) {
        int temp = nums[idx];
        nums[idx] = nums[rightIdx];
        nums[rightIdx] = temp;
    }
}