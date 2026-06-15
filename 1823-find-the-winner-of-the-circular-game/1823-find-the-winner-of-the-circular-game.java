class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }
        while(q.size()>1) {
            for(int i = 1; i < k; i++) {
                int frontEle = q.remove();
                q.add(frontEle);
            }
            q.remove();
        }
        return q.peek();
    }
}