class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;

        // adding elements in TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele : nums) {
            set.add(ele);
        }

        // TreeSet to array
        int[] arr = new int[set.size()];
        int idx = 0;
        for(int ele : set) {
            arr[idx++] = ele;
        }

        // Finding Longest consecutive seq using two pointer
        int maxLen = 1;
        int i = 0, j = 1;
        while(j < arr.length) {
            if(arr[j] == arr[j-1]+1) {
                j++;
            } else {
                int len = j-i;
                maxLen = Math.max(maxLen, len);
                i = j;
                j++;
            }
        }
        int len = j-i;
        maxLen = Math.max(maxLen, len);

        return maxLen;
    }
}