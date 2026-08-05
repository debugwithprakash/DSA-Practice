class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;

        TreeSet<Integer> set = new TreeSet<>();
        for(int ele : nums) {
            set.add(ele);
        }

        int[] arr = new int[n];
        int idx = 0;
        for(int ele : set) {
            arr[idx++] = ele;
        }

        int maxLen = 1;
        int i = 0, j = 1;
        while(j < n) {
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