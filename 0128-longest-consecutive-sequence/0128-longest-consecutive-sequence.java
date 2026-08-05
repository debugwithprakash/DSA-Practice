class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        // Putting all elements in set
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) {
            set.add(ele);
        }

        // Finding longest consecutive Sequence
        int longestSeq = 0;
        for(int ele : set) {
            if(!set.contains(ele-1)) {
                int currEle = ele;
                int currSeq = 1;

                while(set.contains(currEle + 1)) {
                    currEle++;
                    currSeq++;
                }

                longestSeq = Math.max(longestSeq, currSeq);
            }
        }

        return longestSeq;
    }
}