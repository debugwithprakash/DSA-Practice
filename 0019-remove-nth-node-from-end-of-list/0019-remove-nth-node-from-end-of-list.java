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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        if(head.next.next==null && n==1) {
            head.next = null;
            return head;
        }
        if(head.next.next==null && n==2) {
            return head.next;
        }

        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }

        if(fast == null) return head.next;

        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}