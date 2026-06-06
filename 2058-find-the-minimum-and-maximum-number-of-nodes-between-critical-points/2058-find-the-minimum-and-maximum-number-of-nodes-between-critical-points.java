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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ListNode a = head, b = head.next, c = head.next.next;
        int idx = 1, firstIdx = -1, lastIdx = -1, minDistance = Integer.MAX_VALUE;

        if(c==null) return new int[] {-1, -1};

        while(c != null) {
            if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)) {
                if(firstIdx == -1) firstIdx = idx;
                if(lastIdx != -1) {
                    int distance = idx-lastIdx;
                    minDistance = Math.min(distance, minDistance);
                }
                lastIdx = idx;
            }
            a = b;
            b = c;
            c = c.next;
            idx++;
        }
        int maxDistance = lastIdx - firstIdx;
        if(maxDistance == 0) maxDistance = -1;
        if(minDistance == Integer.MAX_VALUE) minDistance = -1;
        return new int[] {minDistance, maxDistance};
    }
}