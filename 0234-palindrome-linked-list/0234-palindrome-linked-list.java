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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp1 = head;
        ListNode temp2 = slow.next;
        slow.next = null;

        temp2 = reverse(temp2);

        while(temp1!=null && temp2!=null) {
            if(temp1.val!=temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null) {
            ListNode fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }
        return pre;
    }
}