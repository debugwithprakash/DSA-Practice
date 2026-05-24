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
        if(head.next == null) {
            head = null;
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        if(length==2 && n==1) {
            head.next = null;
            return head;
        }
        if(length==n) {
            head = head.next;
            return head;
        }
        temp = head;
        for(int i = 0; i < length-n-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}