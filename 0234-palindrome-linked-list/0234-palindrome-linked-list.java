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
    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        // Find break point
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode newHead = reverseLL(slow.next);

        // Compair both halfs
        ListNode first = head;
        ListNode second = newHead;
        while(second!=null) {
            if(first.val != second.val) {
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }
}