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
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null) return;
        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp1 = head, temp2 = slow.next;
        slow.next = null;
        temp2 = reverse(temp2);
        while(temp1!=null && temp2!=null) {
            ListNode fwd1 = temp1.next;
            ListNode fwd2 = temp2.next;
            temp1.next = temp2;
            temp2.next = fwd1;
            temp1 = fwd1;
            if(fwd1!=null) temp2 = fwd2;
        }
    }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=null) {
            slow.next = pre;
            pre = slow;
            slow = fast;
            if(fast!=null) fast = fast.next;
        }
        return pre;
    }
}