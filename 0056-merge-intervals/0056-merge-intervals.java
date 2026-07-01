class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();

        for(int[] arr : intervals) {
            if(ans.size() == 0){
                ans.add(arr);
            } else {
                int[] prevArr = ans.get(ans.size()-1);
                if(prevArr[1] >= arr[0]) {
                    prevArr[1] = Math.max(prevArr[1], arr[1]);
                }
                else {
                    ans.add(arr);
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}