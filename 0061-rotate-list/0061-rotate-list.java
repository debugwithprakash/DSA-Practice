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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        //Finding Length
        int length = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        k = k%length; // if k is greater than length of LL
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode dummyHead = slow.next;
        slow.next = null;
        fast.next = head;
        return dummyHead;
    }
}