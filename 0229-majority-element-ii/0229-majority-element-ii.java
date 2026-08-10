class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>n/3) ans.add(entry.getKey());
        }
        return ans;
    }
}