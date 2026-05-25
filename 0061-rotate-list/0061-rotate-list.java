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
        int length = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            length++;
        }
        k = k%length;
        if(k==0) return head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 0; i < k; i++) {
            temp2 = temp2.next;
        }
        while(temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        ListNode dummyHead = temp1.next;
        temp1.next = null;
        temp2.next = head;
        return dummyHead;
    }
}