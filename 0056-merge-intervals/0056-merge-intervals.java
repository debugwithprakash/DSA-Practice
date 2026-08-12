class Solution {
    public int[][] merge(int[][] intervals) {
        // Sorting the intervals basics of 0th column
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        // Helper ArrayList
        ArrayList<int[]> temp = new ArrayList<>();
        // Main logic
        for(int[] arr : intervals) {
            if(temp.size()==0) {
                temp.add(arr);
            } else {
                int[] previousArr = temp.get(temp.size()-1);
                if(previousArr[1] >= arr[0]) {
                    previousArr[1] = Math.max(previousArr[1], arr[1]);
                } else {
                    temp.add(arr);
                }
            }
        }

        return temp.toArray(new int[temp.size()][]);
    }
}