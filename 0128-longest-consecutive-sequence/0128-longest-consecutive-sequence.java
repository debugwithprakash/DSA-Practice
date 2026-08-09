class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) {
            set.add(ele);
        }
        int longestConsecutiveSeq = 0;
        for(int ele : set) {
            if(!set.contains(ele-1)) {
                int currEle = ele;
                int freq = 1;
                while(set.contains(currEle+1)) {
                    currEle++;
                    freq++;
                }
                longestConsecutiveSeq = Math.max(longestConsecutiveSeq, freq);
            }
        }
        return longestConsecutiveSeq;
    }
}