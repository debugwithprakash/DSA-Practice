class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int count1 = 0;
        int leader1 = 0;
        int count2 = 0;
        int leader2 = 0;
        for(int ele : nums) {
            if(count1==0 && ele!=leader2) {
                count1++;
                leader1 = ele;
            } else if(count2==0 && ele!=leader1) {
                count2++;
                leader2 = ele;
            } else if(ele==leader1) {
                count1++;
            } else if(ele==leader2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i]==leader1) count1++;
            else if(nums[i]==leader2) count2++;
        }
        if(count1>n/3) ans.add(leader1);
        if(count2>n/3) ans.add(leader2);
        return ans;
    }
}