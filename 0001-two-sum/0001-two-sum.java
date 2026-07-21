class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(map.size()==0) {
                map.put(nums[i], i);
                continue;
            }
            if(!map.containsKey(target-nums[i])) {
                map.put(nums[i], i);
            } else if(map.containsKey(target-nums[i])) {
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}