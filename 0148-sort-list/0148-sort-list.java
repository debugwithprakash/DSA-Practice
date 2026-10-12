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
    public ListNode mergeLL(ListNode head, ListNode newHead) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head;
        ListNode j = newHead;
        while(i!=null && j!=null) {
            if(i.val < j.val) {
                temp.next = i;
                temp = i;
                i = i.next;
            } else {
                temp.next = j;
                temp = j;
                j = j.next;
            }
        }
        if(i!=null) {
            temp.next = i;
        }
        if(j!=null) {
            temp.next = j;
        }
        return dummy.next;
    }
    public ListNode breakLL(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        // break into two parts
        ListNode newHead = breakLL(head);

        // apply recursion on both halfs
        head = sortList(head);
        newHead = sortList(newHead);

        // merge LL
        return mergeLL(head, newHead);
    }
}