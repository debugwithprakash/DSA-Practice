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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;
        //Maintaining four variables
        for(int i = 0; i < left-1; i++) {
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;
        temp = dummy;
        for(int i = 0; i < right; i++) {
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;
        //breaking Lists
        tail1.next = null;
        tail2.next = null;
        //Reversing sub List
        reverseList(head2);
        //Final Connections
        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
    }
    void reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null) {
            ListNode fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }
    }
}