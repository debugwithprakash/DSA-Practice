class Solution {
    public int findSubarrays(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        int l = 0, r = 0;
        while(r < n) {
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
    
            while(map.size() > k) {
                map.put(nums[l], map.get(nums[l])-1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }

            count += (r-l)+1;

            r++;
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return findSubarrays(nums, k) - findSubarrays(nums, k-1);
    }
}