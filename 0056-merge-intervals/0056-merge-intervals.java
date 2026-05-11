class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0])); // Sorting Array On  The basis of 0th column
        ArrayList<int[]> list = new ArrayList<>();

        for(int[] arr : intervals) {
            if(list.size() == 0) {
                list.add(arr);
            } 
            else {
                int[] previousArr = list.get(list.size()-1);
                if(previousArr[1] >= arr[0]) {
                    previousArr[1] = Math.max(previousArr[1],arr[1]);
                }
                else {
                    list.add(arr);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}