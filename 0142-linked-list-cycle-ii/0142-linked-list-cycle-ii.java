/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        // Step1: check loop
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }

        // Step2: Find starting Node of loop
        if(slow==fast) {
            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
                if(slow == fast) break;
            }
            return slow;
        }

        return null;
    }
}