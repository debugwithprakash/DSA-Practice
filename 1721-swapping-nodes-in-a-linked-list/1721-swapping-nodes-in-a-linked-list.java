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
        ListNode temp = head;
        while(temp != null) { // Finding length of LL
            temp = temp.next;
            length++;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i = 1; i < k; i++) { // Set temp1
            temp1 = temp1.next;
        }
        for(int i = 1; i < length-k+1; i++) { // Set temp2
            temp2 = temp2.next;
        }
        int t = temp1.val;
        temp1.val = temp2.val;
        temp2.val = t;
        return head;
    }
}