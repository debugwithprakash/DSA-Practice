/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        int sc = 0, lc = n-1, sr = 0, lr = m-1;
        ListNode temp = head;
        int count = 0;
        while(sr <= lr && sc <= lc) {
            for(int i = sc; i <= lc; i++) {
                if(temp==null) {
                    arr[sr][i] = -1;
                }
                else {
                    arr[sr][i] = temp.val;
                    temp = temp.next;
                }
            }
            sr++;
            if(sr>lr || sc>lc) break;

            for(int i = sr; i <= lr; i++) {
                if(temp==null) {
                    arr[i][lc] = -1;
                }
                else {
                    arr[i][lc] = temp.val;
                    temp = temp.next;
                }
            }
            lc--;
            if(sr>lr || sc>lc) break;

            for(int i = lc; i >= sc; i--) {
                if(temp==null) {
                    arr[lr][i] = -1;
                }
                else {
                    arr[lr][i] = temp.val;
                    temp = temp.next;
                }
            }
            lr--;
            if(sr>lr || sc>lc) break;

            for(int i = lr; i >= sr; i--) {
                if(temp==null) {
                    arr[i][sc] = -1;
                }
                else {
                    arr[i][sc] = temp.val;
                    temp = temp.next;
                }
            }
            sc++;
        }
        return arr;
    }
}