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
        // One Pass Solution
        if(head.next == null) {
            head = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i <= n; i++) {
            if(fast == null) {
                head = head.next;
                return head;
            }
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

        // Two Pass Solution
        // if(head.next == null) {
        //     head = null;
        //     return head;
        // }
        // int length = 0;
        // ListNode temp = head;
        // while(temp != null) {
        //     temp = temp.next;
        //     length++;
        // }
        // if(length==2 && n==1) {
        //     head.next = null;
        //     return head;
        // }
        // if(length==n) {
        //     head = head.next;
        //     return head;
        // }
        // temp = head;
        // for(int i = 0; i < length-n-1; i++) {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
    }
}