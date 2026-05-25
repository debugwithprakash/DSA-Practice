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
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 1; i < k; i++) {
            fast = fast.next;
        }
        temp1 = fast;
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        temp2 = slow;
        int t = temp1.val;
        temp1.val = temp2.val;
        temp2.val = t;
        return head;
    }
}